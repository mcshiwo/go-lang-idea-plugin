/* The following code was generated by JFlex 1.4.3 on 6/24/16 12:08 AM */

package com.goide.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.goide.GoTypes;
import java.util.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.goide.GoParserDefinition.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/24/16 12:08 AM from the specification file
 * <tt>go.flex</tt>
 */
public class _GoLexer implements FlexLexer, GoTypes {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int MAYBE_SEMICOLON = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\45\1\20"+
    "\2\0\1\52\1\47\1\25\1\37\1\40\1\24\1\46\1\43\1\16"+
    "\1\17\1\4\1\12\7\11\1\32\1\10\1\41\1\42\1\51\1\44"+
    "\1\53\2\0\4\7\1\15\1\7\16\5\1\30\2\5\1\14\2\5"+
    "\1\35\1\26\1\36\1\50\1\5\1\31\1\57\1\54\1\67\1\71"+
    "\1\56\1\22\1\65\1\63\1\70\1\5\1\60\1\61\1\74\1\66"+
    "\1\64\1\72\1\5\1\55\1\73\1\62\1\27\1\21\1\75\1\13"+
    "\1\76\1\5\1\33\1\23\1\34\54\0\1\5\12\0\1\5\4\0"+
    "\1\5\5\0\27\5\1\0\37\5\1\0\u01ca\5\4\0\14\5\16\0"+
    "\5\5\7\0\1\5\1\0\1\5\201\0\5\5\1\0\2\5\2\0"+
    "\4\5\10\0\1\5\1\0\3\5\1\0\1\5\1\0\24\5\1\0"+
    "\123\5\1\0\213\5\10\0\236\5\11\0\46\5\2\0\1\5\7\0"+
    "\47\5\110\0\33\5\5\0\3\5\55\0\53\5\25\0\12\6\4\0"+
    "\2\5\1\0\143\5\1\0\1\5\17\0\2\5\7\0\2\5\12\6"+
    "\3\5\2\0\1\5\20\0\1\5\1\0\36\5\35\0\131\5\13\0"+
    "\1\5\16\0\12\6\41\5\11\0\2\5\4\0\1\5\5\0\26\5"+
    "\4\0\1\5\11\0\1\5\3\0\1\5\27\0\31\5\107\0\1\5"+
    "\1\0\13\5\127\0\66\5\3\0\1\5\22\0\1\5\7\0\12\5"+
    "\4\0\12\6\1\0\7\5\1\0\7\5\5\0\10\5\2\0\2\5"+
    "\2\0\26\5\1\0\7\5\1\0\1\5\3\0\4\5\3\0\1\5"+
    "\20\0\1\5\15\0\2\5\1\0\3\5\4\0\12\6\2\5\23\0"+
    "\6\5\4\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0"+
    "\2\5\1\0\2\5\37\0\4\5\1\0\1\5\7\0\12\6\2\0"+
    "\3\5\20\0\11\5\1\0\3\5\1\0\26\5\1\0\7\5\1\0"+
    "\2\5\1\0\5\5\3\0\1\5\22\0\1\5\17\0\2\5\4\0"+
    "\12\6\25\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0"+
    "\2\5\1\0\5\5\3\0\1\5\36\0\2\5\1\0\3\5\4\0"+
    "\12\6\1\0\1\5\21\0\1\5\1\0\6\5\3\0\3\5\1\0"+
    "\4\5\3\0\2\5\1\0\1\5\1\0\2\5\3\0\2\5\3\0"+
    "\3\5\3\0\14\5\26\0\1\5\25\0\12\6\25\0\10\5\1\0"+
    "\3\5\1\0\27\5\1\0\12\5\1\0\5\5\3\0\1\5\32\0"+
    "\2\5\6\0\2\5\4\0\12\6\25\0\10\5\1\0\3\5\1\0"+
    "\27\5\1\0\12\5\1\0\5\5\3\0\1\5\40\0\1\5\1\0"+
    "\2\5\4\0\12\6\1\0\2\5\22\0\10\5\1\0\3\5\1\0"+
    "\51\5\2\0\1\5\20\0\1\5\21\0\2\5\4\0\12\6\12\0"+
    "\6\5\5\0\22\5\3\0\30\5\1\0\11\5\1\0\1\5\2\0"+
    "\7\5\72\0\60\5\1\0\2\5\14\0\7\5\11\0\12\6\47\0"+
    "\2\5\1\0\1\5\2\0\2\5\1\0\1\5\2\0\1\5\6\0"+
    "\4\5\1\0\7\5\1\0\3\5\1\0\1\5\1\0\1\5\2\0"+
    "\2\5\1\0\4\5\1\0\2\5\11\0\1\5\2\0\5\5\1\0"+
    "\1\5\11\0\12\6\2\0\4\5\40\0\1\5\37\0\12\6\26\0"+
    "\10\5\1\0\44\5\33\0\5\5\163\0\53\5\24\0\1\5\12\6"+
    "\6\0\6\5\4\0\4\5\3\0\1\5\3\0\2\5\7\0\3\5"+
    "\4\0\15\5\14\0\1\5\1\0\12\6\6\0\46\5\1\0\1\5"+
    "\5\0\1\5\2\0\53\5\1\0\u014d\5\1\0\4\5\2\0\7\5"+
    "\1\0\1\5\1\0\4\5\2\0\51\5\1\0\4\5\2\0\41\5"+
    "\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5\2\0\17\5"+
    "\1\0\71\5\1\0\4\5\2\0\103\5\45\0\20\5\20\0\125\5"+
    "\14\0\u026c\5\2\0\21\5\1\0\32\5\5\0\113\5\25\0\15\5"+
    "\1\0\4\5\16\0\22\5\16\0\22\5\16\0\15\5\1\0\3\5"+
    "\17\0\64\5\43\0\1\5\4\0\1\5\3\0\12\6\46\0\12\6"+
    "\6\0\130\5\10\0\51\5\1\0\1\5\5\0\106\5\12\0\35\5"+
    "\51\0\12\6\36\5\2\0\5\5\13\0\54\5\25\0\7\5\10\0"+
    "\12\6\46\0\27\5\11\0\65\5\53\0\12\6\6\0\12\6\15\0"+
    "\1\5\135\0\57\5\21\0\7\5\4\0\12\6\51\0\36\5\15\0"+
    "\2\5\12\6\54\5\32\0\44\5\34\0\12\6\3\0\3\5\12\6"+
    "\44\5\153\0\4\5\1\0\4\5\3\0\2\5\11\0\300\5\100\0"+
    "\u0116\5\2\0\6\5\2\0\46\5\2\0\6\5\2\0\10\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\37\5\2\0\65\5\1\0"+
    "\7\5\1\0\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0"+
    "\6\5\4\0\15\5\5\0\3\5\1\0\7\5\164\0\1\5\15\0"+
    "\1\5\20\0\15\5\145\0\1\5\4\0\1\5\2\0\12\5\1\0"+
    "\1\5\3\0\5\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0"+
    "\4\5\1\0\13\5\2\0\4\5\5\0\5\5\4\0\1\5\64\0"+
    "\2\5\u0a7b\0\57\5\1\0\57\5\1\0\205\5\6\0\4\5\3\0"+
    "\2\5\14\0\46\5\1\0\1\5\5\0\1\5\2\0\70\5\7\0"+
    "\1\5\20\0\27\5\11\0\7\5\1\0\7\5\1\0\7\5\1\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\120\0"+
    "\1\5\u01d5\0\2\5\52\0\5\5\5\0\2\5\4\0\126\5\6\0"+
    "\3\5\1\0\132\5\1\0\4\5\5\0\51\5\3\0\136\5\21\0"+
    "\33\5\65\0\20\5\u0200\0\u19b6\5\112\0\u51cd\5\63\0\u048d\5\103\0"+
    "\56\5\2\0\u010d\5\3\0\20\5\12\6\2\5\24\0\57\5\20\0"+
    "\31\5\10\0\106\5\61\0\11\5\2\0\147\5\2\0\4\5\1\0"+
    "\4\5\14\0\13\5\115\0\12\5\1\0\3\5\1\0\4\5\1\0"+
    "\27\5\35\0\64\5\16\0\62\5\34\0\12\6\30\0\6\5\3\0"+
    "\1\5\4\0\12\6\34\5\12\0\27\5\31\0\35\5\7\0\57\5"+
    "\34\0\1\5\12\6\46\0\51\5\27\0\3\5\1\0\10\5\4\0"+
    "\12\6\6\0\27\5\3\0\1\5\5\0\60\5\1\0\1\5\3\0"+
    "\2\5\2\0\5\5\2\0\1\5\1\0\1\5\30\0\3\5\2\0"+
    "\13\5\7\0\3\5\14\0\6\5\2\0\6\5\2\0\6\5\11\0"+
    "\7\5\1\0\7\5\221\0\43\5\15\0\12\6\6\0\u2ba4\5\14\0"+
    "\27\5\4\0\61\5\u2104\0\u016e\5\2\0\152\5\46\0\7\5\14\0"+
    "\5\5\5\0\1\5\1\0\12\5\1\0\15\5\1\0\5\5\1\0"+
    "\1\5\1\0\2\5\1\0\2\5\1\0\154\5\41\0\u016b\5\22\0"+
    "\100\5\2\0\66\5\50\0\14\5\164\0\5\5\1\0\207\5\23\0"+
    "\12\6\7\0\32\5\6\0\32\5\13\0\131\5\3\0\6\5\2\0"+
    "\6\5\2\0\6\5\2\0\3\5\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\1\2\6"+
    "\1\7\1\10\1\11\2\5\1\12\1\13\1\1\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\13\5\1\36\2\37\1\36\1\40\1\41\1\42"+
    "\2\0\1\43\1\44\1\45\1\0\1\46\1\47\1\0"+
    "\1\11\1\0\4\5\1\50\1\51\1\52\1\53\1\0"+
    "\1\14\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
    "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72"+
    "\5\5\1\73\3\5\1\74\10\5\1\41\1\43\1\0"+
    "\1\75\1\76\1\77\1\100\2\5\1\101\1\53\2\0"+
    "\1\102\2\0\1\103\1\104\1\105\20\5\1\106\1\41"+
    "\1\0\1\107\1\5\4\0\3\5\1\110\1\111\1\112"+
    "\1\113\1\114\13\5\1\0\1\115\1\5\1\116\1\5"+
    "\1\117\2\5\1\120\6\5\1\0\1\121\2\5\1\122"+
    "\2\5\1\123\1\124\1\125\3\5\1\126\1\127\1\5"+
    "\1\130\2\5\1\131\1\5\1\132";

  private static int [] zzUnpackAction() {
    int [] result = new int[208];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\176\0\374\0\u013b\0\u017a"+
    "\0\u01b9\0\u01f8\0\u0237\0\u0276\0\u02b5\0\u02f4\0\u0333\0\u0372"+
    "\0\u03b1\0\u03f0\0\u042f\0\176\0\176\0\176\0\176\0\176"+
    "\0\176\0\u046e\0\176\0\176\0\u04ad\0\u04ec\0\u052b\0\u056a"+
    "\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4\0\u0723\0\u0762"+
    "\0\u07a1\0\u07e0\0\u081f\0\u085e\0\u089d\0\u08dc\0\u091b\0\176"+
    "\0\176\0\u095a\0\u0999\0\u09d8\0\u0a17\0\176\0\u017a\0\u0a56"+
    "\0\u0a95\0\176\0\u0ad4\0\u0b13\0\176\0\176\0\u0b52\0\176"+
    "\0\u0b91\0\u0bd0\0\u0c0f\0\u0c4e\0\u0c8d\0\176\0\176\0\176"+
    "\0\u0ccc\0\u0d0b\0\176\0\176\0\176\0\176\0\176\0\176"+
    "\0\176\0\176\0\u0d4a\0\176\0\176\0\176\0\u0d89\0\176"+
    "\0\176\0\u0dc8\0\u0e07\0\u0e46\0\u0e85\0\u0ec4\0\u0f03\0\u0f42"+
    "\0\u0f81\0\u0fc0\0\u0fff\0\u013b\0\u103e\0\u107d\0\u10bc\0\u10fb"+
    "\0\u113a\0\u1179\0\u11b8\0\u11f7\0\u1236\0\u1275\0\u12b4\0\176"+
    "\0\u0b13\0\176\0\u013b\0\u12f3\0\u1332\0\u013b\0\176\0\u1371"+
    "\0\u13b0\0\u0ccc\0\u13ef\0\u142e\0\176\0\176\0\176\0\u146d"+
    "\0\u14ac\0\u14eb\0\u152a\0\u1569\0\u15a8\0\u15e7\0\u1626\0\u1665"+
    "\0\u16a4\0\u16e3\0\u1722\0\u1761\0\u17a0\0\u17df\0\u181e\0\u013b"+
    "\0\176\0\u1236\0\u013b\0\u185d\0\u189c\0\u18db\0\u191a\0\u1959"+
    "\0\u1998\0\u19d7\0\u1a16\0\u013b\0\u013b\0\u013b\0\u013b\0\u013b"+
    "\0\u1a55\0\u1a94\0\u1ad3\0\u1b12\0\u1b51\0\u1b90\0\u1bcf\0\u1c0e"+
    "\0\u1c4d\0\u1c8c\0\u1ccb\0\u1d0a\0\u013b\0\u1d49\0\u013b\0\u1d88"+
    "\0\u013b\0\u1dc7\0\u1e06\0\u013b\0\u1e45\0\u1e84\0\u1ec3\0\u1f02"+
    "\0\u1f41\0\u1f80\0\u1fbf\0\u013b\0\u1ffe\0\u203d\0\u013b\0\u207c"+
    "\0\u20bb\0\u013b\0\u013b\0\u013b\0\u20fa\0\u2139\0\u2178\0\u013b"+
    "\0\u013b\0\u21b7\0\u013b\0\u21f6\0\u2235\0\u013b\0\u2274\0\u013b";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[208];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\6\1\7\1\10\1\7\2\11"+
    "\1\12\3\7\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\3\2\7\1\23\1\11\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\3\7\1\50\2\7\1\51\1\7\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\2\7\1\60\1\61"+
    "\1\62\1\5\1\63\72\60\100\0\2\4\100\0\1\64"+
    "\17\0\1\65\17\0\1\66\37\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\23\7\6\0\1\67"+
    "\1\0\3\67\2\0\1\70\1\0\1\71\12\0\1\67"+
    "\23\0\1\70\11\0\1\72\14\0\1\67\1\0\3\11"+
    "\2\0\1\70\1\0\1\71\12\0\1\11\23\0\1\70"+
    "\11\0\1\72\14\0\1\67\1\0\1\67\2\73\2\74"+
    "\1\70\1\0\1\71\12\0\1\67\23\0\1\70\11\0"+
    "\1\72\24\0\1\75\25\0\1\76\40\0\1\71\1\0"+
    "\3\71\4\0\1\77\12\0\1\71\44\0\1\15\2\0"+
    "\15\15\1\100\5\15\1\101\50\15\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\3\7\1\102"+
    "\17\7\5\0\11\7\3\0\2\7\4\0\1\103\1\7"+
    "\1\0\1\7\21\0\3\7\1\104\4\7\1\105\12\7"+
    "\23\0\1\106\20\0\1\107\76\0\1\110\32\0\26\111"+
    "\1\112\50\111\31\23\1\113\45\23\44\0\1\114\76\0"+
    "\1\115\76\0\1\116\76\0\1\117\1\0\1\120\74\0"+
    "\1\121\2\0\1\122\1\123\72\0\1\124\50\0\1\125"+
    "\25\0\1\126\4\0\1\127\71\0\1\130\76\0\1\131"+
    "\6\0\1\132\30\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\1\7\1\133\21\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\2\7"+
    "\1\134\1\135\17\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\1\0\1\7\21\0\5\7\1\136\15\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\1\0\1\7\21\0"+
    "\22\7\1\137\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\10\7\1\140\12\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\3\7"+
    "\1\141\3\7\1\142\1\143\12\7\5\0\11\7\3\0"+
    "\1\7\1\144\4\0\2\7\1\0\1\7\21\0\12\7"+
    "\1\145\5\7\1\146\2\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\2\7\1\147\20\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\1\0\1\7"+
    "\21\0\3\7\1\150\17\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\2\7\1\151\3\7"+
    "\1\152\12\7\1\153\1\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\3\7\1\154\17\7"+
    "\1\0\1\61\101\0\1\64\17\0\1\65\52\0\1\64"+
    "\2\0\74\64\24\65\1\155\52\65\6\0\1\156\1\0"+
    "\3\156\3\0\1\157\13\0\1\156\13\0\1\157\36\0"+
    "\1\71\1\0\3\71\2\0\1\70\14\0\1\71\23\0"+
    "\1\70\11\0\1\160\14\0\1\67\1\0\1\67\2\73"+
    "\2\0\1\70\1\0\1\71\12\0\1\67\23\0\1\70"+
    "\11\0\1\72\15\0\4\161\2\0\1\161\4\0\1\161"+
    "\7\0\1\161\21\0\1\161\1\0\2\161\7\0\1\161"+
    "\1\0\1\161\24\0\1\162\70\0\3\15\4\0\3\15"+
    "\3\0\3\15\1\0\1\15\21\0\2\15\1\0\1\15"+
    "\2\0\1\15\3\0\1\15\15\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\1\7\1\163\21\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\1\0\1\7"+
    "\21\0\12\7\1\164\10\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\5\7\1\165\15\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\1\0\1\7"+
    "\21\0\1\7\1\166\21\7\25\0\1\167\62\0\2\170"+
    "\1\171\5\0\2\111\2\0\1\172\1\111\1\173\1\174"+
    "\23\0\2\111\1\0\1\111\2\0\1\111\3\0\1\111"+
    "\54\0\1\175\76\0\1\176\76\0\1\177\37\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\2\7"+
    "\1\200\20\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\6\7\1\201\14\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\12\7"+
    "\1\202\10\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\17\7\1\203\3\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\16\7"+
    "\1\204\4\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\6\7\1\205\14\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\17\7"+
    "\1\206\3\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\3\7\1\207\17\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\12\7"+
    "\1\210\10\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\6\7\1\211\14\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\16\7"+
    "\1\212\4\7\5\0\11\7\3\0\1\7\1\213\4\0"+
    "\2\7\1\0\1\7\21\0\23\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\13\7\1\214"+
    "\7\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\5\7\1\215\15\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\1\7\1\216"+
    "\21\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\14\7\1\217\6\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\16\7\1\220"+
    "\4\7\4\65\1\221\17\65\1\222\52\65\6\0\1\156"+
    "\1\0\3\156\17\0\1\156\35\0\1\160\14\0\1\156"+
    "\1\0\3\156\17\0\1\156\51\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\13\7\1\223\7\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\1\0\1\7"+
    "\21\0\5\7\1\224\15\7\11\0\2\225\73\0\4\226"+
    "\2\0\1\226\4\0\1\226\7\0\1\226\21\0\1\226"+
    "\1\0\2\226\7\0\1\226\1\0\1\226\14\0\4\227"+
    "\2\0\1\227\4\0\1\227\7\0\1\227\21\0\1\227"+
    "\1\0\2\227\7\0\1\227\1\0\1\227\14\0\4\230"+
    "\2\0\1\230\4\0\1\230\7\0\1\230\21\0\1\230"+
    "\1\0\2\230\7\0\1\230\1\0\1\230\12\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\3\7"+
    "\1\231\17\7\5\0\11\7\3\0\2\7\4\0\1\232"+
    "\1\7\1\0\1\7\21\0\23\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\11\7\1\233"+
    "\11\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\2\7\1\234\20\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\2\7\1\235"+
    "\20\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\10\7\1\236\12\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\2\7\1\237"+
    "\20\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\12\7\1\240\10\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\6\7\1\241"+
    "\10\7\1\242\3\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\1\0\1\7\21\0\2\7\1\243\20\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\1\0\1\7\21\0"+
    "\10\7\1\244\12\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\1\0\1\7\21\0\2\7\1\245\1\246\17\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\1\0\1\7"+
    "\21\0\4\7\1\247\16\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\2\7\1\250\20\7"+
    "\5\0\11\7\3\0\2\7\4\0\1\251\1\7\1\0"+
    "\1\7\21\0\23\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\1\0\1\7\21\0\6\7\1\252\14\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\1\0\1\7\21\0"+
    "\6\7\1\253\14\7\11\0\2\111\73\0\4\111\2\0"+
    "\1\111\4\0\1\111\7\0\1\111\21\0\1\111\1\0"+
    "\2\111\7\0\1\111\1\0\1\111\14\0\4\171\2\0"+
    "\1\171\4\0\1\171\7\0\1\171\21\0\1\171\1\0"+
    "\2\171\7\0\1\171\1\0\1\171\14\0\4\254\2\0"+
    "\1\254\4\0\1\254\7\0\1\254\21\0\1\254\1\0"+
    "\2\254\7\0\1\254\1\0\1\254\12\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\4\7\1\255"+
    "\16\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\1\7\1\256\21\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\2\7\1\257"+
    "\20\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\14\7\1\260\6\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\6\7\1\261"+
    "\14\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\1\7\1\262\21\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\1\7\1\263"+
    "\21\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\1\7\1\264\21\7\5\0\11\7\3\0"+
    "\2\7\4\0\1\265\1\7\1\0\1\7\21\0\23\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\1\0\1\7"+
    "\21\0\3\7\1\266\17\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\13\7\1\267\7\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\1\0\1\7"+
    "\21\0\13\7\1\270\7\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\13\7\1\271\7\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\1\0\1\7"+
    "\21\0\7\7\1\272\13\7\7\0\4\273\2\0\1\273"+
    "\4\0\1\273\7\0\1\273\21\0\1\273\1\0\2\273"+
    "\7\0\1\273\1\0\1\273\12\0\11\7\3\0\2\7"+
    "\4\0\2\7\1\0\1\7\21\0\12\7\1\274\10\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\1\0\1\7"+
    "\21\0\12\7\1\275\10\7\5\0\11\7\3\0\1\7"+
    "\1\276\4\0\2\7\1\0\1\7\21\0\23\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\1\0\1\7\21\0"+
    "\6\7\1\277\14\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\1\0\1\7\21\0\5\7\1\300\15\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\1\0\1\7\21\0"+
    "\11\7\1\301\11\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\1\0\1\7\21\0\6\7\1\302\14\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\1\0\1\7\21\0"+
    "\6\7\1\303\14\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\1\0\1\7\21\0\7\7\1\304\13\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\1\0\1\7\21\0"+
    "\1\7\1\305\21\7\7\0\4\173\2\0\1\173\4\0"+
    "\1\173\7\0\1\173\21\0\1\173\1\0\2\173\7\0"+
    "\1\173\1\0\1\173\12\0\11\7\3\0\2\7\4\0"+
    "\1\306\1\7\1\0\1\7\21\0\23\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\3\7"+
    "\1\307\17\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\6\7\1\310\14\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\2\7"+
    "\1\311\20\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\10\7\1\312\12\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\1\0\1\7\21\0\2\7"+
    "\1\313\20\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\1\0\1\7\21\0\13\7\1\314\7\7\5\0\11\7"+
    "\3\0\2\7\4\0\1\315\1\7\1\0\1\7\21\0"+
    "\23\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\2\7\1\316\20\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\1\0\1\7\21\0\11\7\1\317"+
    "\11\7\5\0\11\7\3\0\2\7\4\0\2\7\1\0"+
    "\1\7\21\0\7\7\1\320\13\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8883];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\16\1\6\11\1\1\2\11"+
    "\23\1\2\11\4\1\1\11\2\0\1\1\1\11\1\1"+
    "\1\0\2\11\1\0\1\11\1\0\4\1\3\11\1\1"+
    "\1\0\10\11\1\1\3\11\1\1\2\11\25\1\1\0"+
    "\1\11\1\1\1\11\4\1\1\11\2\0\1\1\2\0"+
    "\3\11\21\1\1\11\1\0\2\1\4\0\23\1\1\0"+
    "\16\1\1\0\25\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[208];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _GoLexer() {
    this((java.io.Reader)null);
  }

  private Stack<IElementType> gStringStack = new Stack<IElementType>();
  private Stack<IElementType> blockStack = new Stack<IElementType>();

  private int afterComment = YYINITIAL;
  private int afterNls = YYINITIAL;
  private int afterBrace = YYINITIAL;

  private void clearStacks(){
    gStringStack.clear();
    blockStack.clear();
  }

  private Stack<IElementType> braceCount = new Stack<IElementType>();



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _GoLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1732) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 55: 
          { return SHIFT_LEFT;
          }
        case 91: break;
        case 33: 
          { return MULTILINE_COMMENT;
          }
        case 92: break;
        case 67: 
          { return BIT_CLEAR_ASSIGN;
          }
        case 93: break;
        case 2: 
          { return NLS;
          }
        case 94: break;
        case 17: 
          { return LPAREN;
          }
        case 95: break;
        case 27: 
          { return LESS;
          }
        case 96: break;
        case 53: 
          { return SEND_CHANNEL;
          }
        case 97: break;
        case 50: 
          { return COND_AND;
          }
        case 98: break;
        case 38: 
          { yybegin(MAYBE_SEMICOLON); return MINUS_MINUS;
          }
        case 99: break;
        case 79: 
          { return CONST;
          }
        case 100: break;
        case 47: 
          { return PLUS_ASSIGN;
          }
        case 101: break;
        case 9: 
          { yybegin(MAYBE_SEMICOLON); return STRING;
          }
        case 102: break;
        case 35: 
          { yybegin(MAYBE_SEMICOLON); return FLOAT;
          }
        case 103: break;
        case 19: 
          { return COLON;
          }
        case 104: break;
        case 12: 
          { yybegin(MAYBE_SEMICOLON); return RAW_STRING;
          }
        case 105: break;
        case 45: 
          { return EQ;
          }
        case 106: break;
        case 18: 
          { yybegin(MAYBE_SEMICOLON); return RPAREN;
          }
        case 107: break;
        case 76: 
          { return CHAN;
          }
        case 108: break;
        case 43: 
          { yybegin(MAYBE_SEMICOLON); return CHAR;
          }
        case 109: break;
        case 3: 
          { return WS;
          }
        case 110: break;
        case 20: 
          { return SEMICOLON;
          }
        case 111: break;
        case 81: 
          { yybegin(MAYBE_SEMICOLON); return RETURN ;
          }
        case 112: break;
        case 21: 
          { return COMMA;
          }
        case 113: break;
        case 71: 
          { return FUNC;
          }
        case 114: break;
        case 37: 
          { yybegin(MAYBE_SEMICOLON); return OCT;
          }
        case 115: break;
        case 60: 
          { return IF ;
          }
        case 116: break;
        case 84: 
          { return STRUCT;
          }
        case 117: break;
        case 40: 
          { return COND_OR;
          }
        case 118: break;
        case 68: 
          { return SHIFT_LEFT_ASSIGN;
          }
        case 119: break;
        case 82: 
          { return IMPORT ;
          }
        case 120: break;
        case 24: 
          { return PLUS;
          }
        case 121: break;
        case 59: 
          { return GO;
          }
        case 122: break;
        case 1: 
          { return BAD_CHARACTER;
          }
        case 123: break;
        case 25: 
          { return BIT_AND;
          }
        case 124: break;
        case 49: 
          { return BIT_AND_ASSIGN;
          }
        case 125: break;
        case 85: 
          { return SWITCH;
          }
        case 126: break;
        case 62: 
          { yybegin(MAYBE_SEMICOLON); return HEX;
          }
        case 127: break;
        case 4: 
          { return QUOTIENT;
          }
        case 128: break;
        case 10: 
          { return BIT_OR;
          }
        case 129: break;
        case 39: 
          { return MINUS_ASSIGN;
          }
        case 130: break;
        case 8: 
          { return DOT;
          }
        case 131: break;
        case 86: 
          { return DEFAULT;
          }
        case 132: break;
        case 77: 
          { yybegin(MAYBE_SEMICOLON); return BREAK;
          }
        case 133: break;
        case 87: 
          { return PACKAGE;
          }
        case 134: break;
        case 73: 
          { return TYPE_;
          }
        case 135: break;
        case 56: 
          { return REMAINDER_ASSIGN;
          }
        case 136: break;
        case 52: 
          { return BIT_XOR_ASSIGN;
          }
        case 137: break;
        case 44: 
          { return VAR_ASSIGN;
          }
        case 138: break;
        case 90: 
          { yybegin(MAYBE_SEMICOLON); return FALLTHROUGH;
          }
        case 139: break;
        case 32: 
          { return LINE_COMMENT;
          }
        case 140: break;
        case 5: 
          { yybegin(MAYBE_SEMICOLON); return IDENTIFIER;
          }
        case 141: break;
        case 30: 
          { yybegin(YYINITIAL); yypushback(yytext().length());
          }
        case 142: break;
        case 80: 
          { return DEFER;
          }
        case 143: break;
        case 41: 
          { return BIT_OR_ASSIGN;
          }
        case 144: break;
        case 51: 
          { return BIT_CLEAR;
          }
        case 145: break;
        case 13: 
          { return LBRACE;
          }
        case 146: break;
        case 22: 
          { return ASSIGN;
          }
        case 147: break;
        case 83: 
          { return SELECT;
          }
        case 148: break;
        case 26: 
          { return BIT_XOR;
          }
        case 149: break;
        case 36: 
          { yybegin(MAYBE_SEMICOLON); return DECIMALI;
          }
        case 150: break;
        case 65: 
          { return FOR ;
          }
        case 151: break;
        case 15: 
          { return LBRACK;
          }
        case 152: break;
        case 64: 
          { return VAR;
          }
        case 153: break;
        case 89: 
          { return INTERFACE;
          }
        case 154: break;
        case 28: 
          { return REMAINDER;
          }
        case 155: break;
        case 23: 
          { return NOT;
          }
        case 156: break;
        case 46: 
          { return NOT_EQ;
          }
        case 157: break;
        case 42: 
          { return MUL_ASSIGN;
          }
        case 158: break;
        case 72: 
          { return ELSE;
          }
        case 159: break;
        case 63: 
          { return TRIPLE_DOT;
          }
        case 160: break;
        case 70: 
          { return MAP;
          }
        case 161: break;
        case 31: 
          { yybegin(YYINITIAL); yypushback(yytext().length()); return SEMICOLON_SYNTHETIC;
          }
        case 162: break;
        case 14: 
          { yybegin(MAYBE_SEMICOLON); return RBRACE;
          }
        case 163: break;
        case 6: 
          { yybegin(MAYBE_SEMICOLON); return INT;
          }
        case 164: break;
        case 11: 
          { return MUL;
          }
        case 165: break;
        case 48: 
          { yybegin(MAYBE_SEMICOLON); return PLUS_PLUS;
          }
        case 166: break;
        case 74: 
          { return GOTO;
          }
        case 167: break;
        case 16: 
          { yybegin(MAYBE_SEMICOLON); return RBRACK;
          }
        case 168: break;
        case 7: 
          { return MINUS;
          }
        case 169: break;
        case 78: 
          { return RANGE;
          }
        case 170: break;
        case 75: 
          { return CASE;
          }
        case 171: break;
        case 88: 
          { yybegin(MAYBE_SEMICOLON); return CONTINUE ;
          }
        case 172: break;
        case 29: 
          { return GREATER;
          }
        case 173: break;
        case 66: 
          { yybegin(MAYBE_SEMICOLON); return BAD_CHARACTER;
          }
        case 174: break;
        case 61: 
          { yybegin(MAYBE_SEMICOLON); return FLOATI;
          }
        case 175: break;
        case 54: 
          { return LESS_OR_EQUAL;
          }
        case 176: break;
        case 69: 
          { return SHIFT_RIGHT_ASSIGN;
          }
        case 177: break;
        case 58: 
          { return SHIFT_RIGHT;
          }
        case 178: break;
        case 34: 
          { return QUOTIENT_ASSIGN;
          }
        case 179: break;
        case 57: 
          { return GREATER_OR_EQUAL;
          }
        case 180: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
