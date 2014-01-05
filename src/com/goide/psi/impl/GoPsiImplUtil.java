package com.goide.psi.impl;

import com.goide.GoIcons;
import com.goide.completion.GoCompletionContributor;
import com.goide.psi.*;
import com.intellij.codeInsight.completion.PrioritizedLookupElement;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.List;

public class GoPsiImplUtil {
  private static final String MAIN_FUNCTION_NAME = "main";

  @Nullable
  public static GoTypeReferenceExpression getQualifier(@NotNull GoTypeReferenceExpression o) {
    return PsiTreeUtil.getChildOfType(o, GoTypeReferenceExpression.class);
  }

  @Nullable
  public static PsiReference getReference(@NotNull GoTypeReferenceExpression o) {
    return new GoTypeReference(o);
  }

  @Nullable
  public static GoReferenceExpression getQualifier(@NotNull GoReferenceExpression o) {
    return PsiTreeUtil.getChildOfType(o, GoReferenceExpression.class);
  }

  @Nullable
  public static PsiReference getReference(@NotNull final GoReferenceExpression o) {
    return new GoReference(o);
  }

  @SuppressWarnings("UnusedParameters")
  public static boolean processDeclarations(@NotNull GoCompositeElement o,
                                            @NotNull PsiScopeProcessor processor,
                                            @NotNull ResolveState state,
                                            PsiElement lastParent,
                                            @NotNull PsiElement place) {
    boolean isAncestor = PsiTreeUtil.isAncestor(o, place, false);
    if (isAncestor) return GoCompositeElementImpl.precessDeclarationDefault(o, processor, state, lastParent, place);

    if (o instanceof GoBlock ||
        o instanceof GoIfStatement ||
        o instanceof GoSwitchStatement ||
        o instanceof GoForStatement ||
        o instanceof GoCommClause ||
        o instanceof GoTypeCaseClause ||
        o instanceof GoExprCaseClause) {
      return false;
    }
    return GoCompositeElementImpl.precessDeclarationDefault(o, processor, state, lastParent, place);
  }

  @NotNull
  public static LookupElement createFunctionLookupElement(GoFunctionDeclaration f) {
    return PrioritizedLookupElement.withPriority(LookupElementBuilder.create(f).withIcon(GoIcons.FUNCTION).withInsertHandler(null),
                                                 GoCompletionContributor.FUNCTION_PRIORITY);
  }

  @NotNull
  public static LookupElement createTypeLookupElement(GoTypeSpec t) {
    return PrioritizedLookupElement.withPriority(LookupElementBuilder.create(t).withIcon(GoIcons.TYPE),
                                                 GoCompletionContributor.TYPE_PRIORITY);
  }

  @NotNull
  public static LookupElement createVariableLookupElement(GoNamedElement v) {
    Icon icon = v instanceof GoVarDefinition ? GoIcons.VARIABLE : v instanceof GoParamDefinition ? GoIcons.PARAMETER : null;
    return PrioritizedLookupElement.withPriority(LookupElementBuilder.create(v).withIcon(icon),
                                                 GoCompletionContributor.VAR_PRIORITY);
  }

  @Nullable
  public static GoFunctionDeclarationImpl findMainFunction(@NotNull GoFile file) {
    List<GoFunctionDeclaration> functions = file.getFunctions();
    for (GoFunctionDeclaration function : functions) {
      if (function instanceof GoFunctionDeclarationImpl && MAIN_FUNCTION_NAME.equals(function.getName())) {
        return (GoFunctionDeclarationImpl)function;
      }
    }
    return null;
  }

  @Nullable
  public static String getPackageName(@NotNull GoFile file) {
    GoPackageClause packageClause = file.getPackage();
    if (packageClause != null) {
      PsiElement packageIdentifier = packageClause.getIdentifier();
      if (packageIdentifier != null) {
        return packageIdentifier.getText().trim();
      }
    }
    return null;
  }
}
