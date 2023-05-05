// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\3\0\1\5\3\0\1\6\1\7\1\10\1\0\1\11"+
    "\1\12\1\0\1\13\1\14\11\15\1\0\1\16\2\0"+
    "\1\17\2\0\32\20\4\0\1\20\1\0\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\2\20"+
    "\1\32\1\33\1\34\1\35\1\36\1\20\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\20\1\45\1\20\1\46"+
    "\1\0\1\47\7\0\1\3\73\0\1\20\7\0\1\20"+
    "\3\0\1\20\3\0\1\20\1\0\1\20\6\0\1\20"+
    "\1\0\1\20\4\0\1\20\7\0\1\20\3\0\1\20"+
    "\3\0\1\20\1\0\1\20\6\0\1\20\1\0\1\20"+
    "\u012b\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\1\4\1\5\2\1"+
    "\2\6\1\7\1\1\1\10\1\11\1\12\16\1\1\13"+
    "\1\14\1\15\2\0\1\2\1\16\6\17\1\20\1\17"+
    "\1\21\3\17\1\22\7\17\1\23\6\17\1\24\2\0"+
    "\7\17\1\25\1\26\2\17\1\27\1\30\13\17\1\0"+
    "\1\2\1\31\1\17\1\32\1\33\1\17\1\34\1\17"+
    "\1\35\1\36\4\17\1\23\2\17\1\37\1\17\1\40"+
    "\1\41\2\17\1\42\1\43\7\17\1\44\3\17\1\45"+
    "\1\46\1\47\1\50\1\51\1\17\1\52\1\53\3\17"+
    "\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[141];
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
    "\0\0\0\50\0\50\0\120\0\170\0\50\0\50\0\50"+
    "\0\240\0\310\0\360\0\u0118\0\50\0\u0140\0\u0168\0\u0190"+
    "\0\u01b8\0\u01e0\0\u0208\0\u0230\0\u0258\0\u0280\0\u02a8\0\u02d0"+
    "\0\u02f8\0\u0320\0\u0348\0\u0370\0\u0398\0\u03c0\0\u03e8\0\50"+
    "\0\50\0\u0410\0\u0438\0\u0460\0\u0488\0\360\0\u0140\0\u04b0"+
    "\0\u04d8\0\u0500\0\u0528\0\u0550\0\u0140\0\u0578\0\u0140\0\u05a0"+
    "\0\u05c8\0\u05f0\0\u0140\0\u0618\0\u0640\0\u0668\0\u0690\0\u06b8"+
    "\0\u06e0\0\u0708\0\u0730\0\u0758\0\u0780\0\u07a8\0\u07d0\0\u07f8"+
    "\0\u0820\0\50\0\u0848\0\u0870\0\u0898\0\u08c0\0\u08e8\0\u0910"+
    "\0\u0938\0\u0960\0\u0988\0\u0140\0\u0140\0\u09b0\0\u09d8\0\u0140"+
    "\0\u0140\0\u0a00\0\u0a28\0\u0a50\0\u0a78\0\u0aa0\0\u0ac8\0\u0af0"+
    "\0\u0b18\0\u0b40\0\u0b68\0\u0b90\0\u0bb8\0\u0848\0\u0140\0\u0be0"+
    "\0\u0140\0\u0140\0\u0c08\0\u0140\0\u0c30\0\u0140\0\u0140\0\u0c58"+
    "\0\u0c80\0\u0ca8\0\u0cd0\0\u0140\0\u0cf8\0\u0d20\0\u0140\0\u0d48"+
    "\0\u0140\0\u0140\0\u0d70\0\u0d98\0\u0140\0\u0140\0\u0dc0\0\u0de8"+
    "\0\u0e10\0\u0e38\0\u0e60\0\u0e88\0\u0eb0\0\u0140\0\u0ed8\0\u0f00"+
    "\0\u0f28\0\u0140\0\u0140\0\u0140\0\u0140\0\u0140\0\u0f50\0\u0140"+
    "\0\u0140\0\u0f78\0\u0fa0\0\u0fc8\0\u0140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[141];
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
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\2"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\2\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\2\16\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\16\1\36\1\37\1\16\1\40\1\41\52\0\1\3"+
    "\65\0\26\42\14\0\1\43\45\0\1\44\2\0\1\45"+
    "\50\0\2\46\46\0\2\14\46\0\2\47\2\0\26\47"+
    "\16\0\2\47\2\0\17\47\1\50\6\47\16\0\2\47"+
    "\2\0\11\47\1\51\13\47\1\52\16\0\2\47\2\0"+
    "\1\47\1\53\10\47\1\54\13\47\16\0\2\47\2\0"+
    "\5\47\1\55\20\47\16\0\2\47\2\0\12\47\1\56"+
    "\5\47\1\57\5\47\16\0\2\47\2\0\11\47\1\60"+
    "\3\47\1\61\10\47\16\0\2\47\2\0\14\47\1\62"+
    "\11\47\16\0\2\47\2\0\1\47\1\63\13\47\1\64"+
    "\10\47\16\0\2\47\2\0\1\47\1\65\24\47\16\0"+
    "\2\47\2\0\5\47\1\66\20\47\16\0\2\47\2\0"+
    "\22\47\1\67\3\47\16\0\2\47\2\0\17\47\1\70"+
    "\2\47\1\71\3\47\16\0\2\47\2\0\5\47\1\72"+
    "\20\47\16\0\2\47\2\0\11\47\1\73\7\47\1\74"+
    "\1\75\2\47\1\76\16\0\2\47\2\0\10\47\1\77"+
    "\15\47\16\0\2\47\2\0\15\47\1\100\10\47\16\0"+
    "\2\47\2\0\10\47\1\101\15\47\16\0\2\42\2\0"+
    "\26\42\21\0\1\102\30\0\10\103\1\104\37\103\2\45"+
    "\1\3\1\45\1\4\43\45\14\0\2\47\2\0\7\47"+
    "\1\105\16\47\16\0\2\47\2\0\5\47\1\106\20\47"+
    "\16\0\2\47\2\0\21\47\1\107\4\47\16\0\2\47"+
    "\2\0\20\47\1\110\5\47\16\0\2\47\2\0\1\47"+
    "\1\111\24\47\16\0\2\47\2\0\20\47\1\112\5\47"+
    "\16\0\2\47\2\0\14\47\1\113\11\47\16\0\2\47"+
    "\2\0\17\47\1\114\6\47\16\0\2\47\2\0\21\47"+
    "\1\115\4\47\16\0\2\47\2\0\14\47\1\116\11\47"+
    "\16\0\2\47\2\0\11\47\1\117\14\47\16\0\2\47"+
    "\2\0\24\47\1\120\1\47\16\0\2\47\2\0\21\47"+
    "\1\121\4\47\16\0\2\47\2\0\11\47\1\122\14\47"+
    "\16\0\2\47\2\0\2\47\1\123\23\47\16\0\2\47"+
    "\2\0\21\47\1\124\4\47\16\0\2\47\2\0\14\47"+
    "\1\125\11\47\16\0\2\47\2\0\1\47\1\126\15\47"+
    "\1\127\6\47\16\0\2\47\2\0\13\47\1\130\12\47"+
    "\16\0\2\47\2\0\20\47\1\131\5\47\16\0\2\47"+
    "\2\0\11\47\1\132\14\47\16\0\2\47\2\0\11\47"+
    "\1\133\14\47\16\0\2\47\2\0\11\47\1\134\14\47"+
    "\2\0\10\103\1\135\47\103\1\135\2\103\1\136\34\103"+
    "\14\0\2\47\2\0\20\47\1\137\5\47\16\0\2\47"+
    "\2\0\14\47\1\140\11\47\16\0\2\47\2\0\5\47"+
    "\1\141\20\47\16\0\2\47\2\0\5\47\1\142\20\47"+
    "\16\0\2\47\2\0\20\47\1\143\5\47\16\0\2\47"+
    "\2\0\5\47\1\144\20\47\16\0\2\47\2\0\1\47"+
    "\1\145\24\47\16\0\2\47\2\0\7\47\1\146\16\47"+
    "\16\0\2\47\2\0\14\47\1\147\11\47\16\0\2\47"+
    "\2\0\14\47\1\150\6\47\1\151\2\47\16\0\2\47"+
    "\2\0\12\47\1\152\13\47\16\0\2\47\2\0\22\47"+
    "\1\153\3\47\16\0\2\47\2\0\15\47\1\154\10\47"+
    "\16\0\2\47\2\0\21\47\1\155\4\47\16\0\2\47"+
    "\2\0\11\47\1\156\14\47\16\0\2\47\2\0\1\47"+
    "\1\157\24\47\16\0\2\47\2\0\21\47\1\160\4\47"+
    "\16\0\2\47\2\0\20\47\1\161\5\47\16\0\2\47"+
    "\2\0\4\47\1\162\21\47\16\0\2\47\2\0\12\47"+
    "\1\163\13\47\2\0\10\103\1\135\2\103\1\3\34\103"+
    "\14\0\2\47\2\0\23\47\1\164\2\47\16\0\2\47"+
    "\2\0\20\47\1\165\5\47\16\0\2\47\2\0\12\47"+
    "\1\166\13\47\16\0\2\47\2\0\21\47\1\167\4\47"+
    "\16\0\2\47\2\0\1\47\1\170\24\47\16\0\2\47"+
    "\2\0\11\47\1\171\14\47\16\0\2\47\2\0\17\47"+
    "\1\172\6\47\16\0\2\47\2\0\11\47\1\173\14\47"+
    "\16\0\2\47\2\0\14\47\1\174\11\47\16\0\2\47"+
    "\2\0\5\47\1\175\20\47\16\0\2\47\2\0\5\47"+
    "\1\176\20\47\16\0\2\47\2\0\5\47\1\177\20\47"+
    "\16\0\2\47\2\0\12\47\1\200\13\47\16\0\2\47"+
    "\2\0\21\47\1\201\4\47\16\0\2\47\2\0\3\47"+
    "\1\202\22\47\16\0\2\47\2\0\14\47\1\203\11\47"+
    "\16\0\2\47\2\0\3\47\1\204\22\47\16\0\2\47"+
    "\2\0\7\47\1\205\16\47\16\0\2\47\2\0\13\47"+
    "\1\206\12\47\16\0\2\47\2\0\14\47\1\207\11\47"+
    "\16\0\2\47\2\0\14\47\1\210\11\47\16\0\2\47"+
    "\2\0\5\47\1\211\20\47\16\0\2\47\2\0\11\47"+
    "\1\212\14\47\16\0\2\47\2\0\4\47\1\213\21\47"+
    "\16\0\2\47\2\0\15\47\1\214\10\47\16\0\2\47"+
    "\2\0\20\47\1\215\5\47\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4080];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\2\1\3\11\4\1\1\11\22\1\2\11"+
    "\1\1\2\0\35\1\1\11\2\0\30\1\1\0\60\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[141];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return token(yytext(), "separador", yyline, yycolumn);
            }
            // fall through
          case 45: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 46: break;
          case 3:
            { return token(yytext(), "PARENTESIS_A", yyline, yycolumn);
            }
            // fall through
          case 47: break;
          case 4:
            { return token(yytext(), "PARENTESIS_C", yyline, yycolumn);
            }
            // fall through
          case 48: break;
          case 5:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
            // fall through
          case 49: break;
          case 6:
            { return token(yytext(), "NUMERO", yyline, yycolumn);
            }
            // fall through
          case 50: break;
          case 7:
            { return token(yytext(), "PUNTO_COMA", yyline, yycolumn);
            }
            // fall through
          case 51: break;
          case 8:
            { return token(yytext(), "operador", yyline, yycolumn);
            }
            // fall through
          case 52: break;
          case 9:
            { return token(yytext(), "operadores", yyline, yycolumn);
            }
            // fall through
          case 53: break;
          case 10:
            { return token(yytext(), "OPERADOR", yyline, yycolumn);
            }
            // fall through
          case 54: break;
          case 11:
            { return token(yytext(), "LLAVE_A", yyline, yycolumn);
            }
            // fall through
          case 55: break;
          case 12:
            { return token(yytext(), "LLAVE_C", yyline, yycolumn);
            }
            // fall through
          case 56: break;
          case 13:
            { return token(yytext(), "Identificador", yyline, yycolumn);
            }
            // fall through
          case 57: break;
          case 14:
            { return token(yytext(), "ERROR_1", yyline, yycolumn);
            }
            // fall through
          case 58: break;
          case 15:
            { return token(yytext(), "ERROR_2", yyline, yycolumn);
            }
            // fall through
          case 59: break;
          case 16:
            { return token(yytext(), "acopladores", yyline, yycolumn);
            }
            // fall through
          case 60: break;
          case 17:
            { return token(yytext(), "acoplador1", yyline, yycolumn);
            }
            // fall through
          case 61: break;
          case 18:
            { return token(yytext(), "acoplador", yyline, yycolumn);
            }
            // fall through
          case 62: break;
          case 19:
            { return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn);
            }
            // fall through
          case 63: break;
          case 20:
            { return token (yytext(), "OP_ASIG", yyline, yycolumn);
            }
            // fall through
          case 64: break;
          case 21:
            { return token(yytext(), "iteracion", yyline, yycolumn);
            }
            // fall through
          case 65: break;
          case 22:
            { return token(yytext(), "tipoDato", yyline, yycolumn);
            }
            // fall through
          case 66: break;
          case 23:
            { return token(yytext(), "nuevo", yyline, yycolumn);
            }
            // fall through
          case 67: break;
          case 24:
            { return token(yytext(), "CampoEstatico", yyline, yycolumn);
            }
            // fall through
          case 68: break;
          case 25:
            { return token(yytext(), "parametro", yyline, yycolumn);
            }
            // fall through
          case 69: break;
          case 26:
            { return token(yytext(), "cantidad", yyline, yycolumn);
            }
            // fall through
          case 70: break;
          case 27:
            { return token(yytext(), "SwComplemento", yyline, yycolumn);
            }
            // fall through
          case 71: break;
          case 28:
            { return token(yytext(), "verificador", yyline, yycolumn);
            }
            // fall through
          case 72: break;
          case 29:
            { return token(yytext(), "longitud", yyline, yycolumn);
            }
            // fall through
          case 73: break;
          case 30:
            { return token(yytext(), "Inicializa", yyline, yycolumn);
            }
            // fall through
          case 74: break;
          case 31:
            { return token(yytext(), "tipoOperacion", yyline, yycolumn);
            }
            // fall through
          case 75: break;
          case 32:
            { return token(yytext(), "referencia", yyline, yycolumn);
            }
            // fall through
          case 76: break;
          case 33:
            { return token(yytext(), "null", yyline, yycolumn);
            }
            // fall through
          case 77: break;
          case 34:
            { return token(yytext(), "Clase", yyline, yycolumn);
            }
            // fall through
          case 78: break;
          case 35:
            { return token(yytext(), "FINAL", yyline, yycolumn);
            }
            // fall through
          case 79: break;
          case 36:
            { return token(yytext(), "comparador", yyline, yycolumn);
            }
            // fall through
          case 80: break;
          case 37:
            { return token(yytext(), "clase", yyline, yycolumn);
            }
            // fall through
          case 81: break;
          case 38:
            { return token(yytext(), "devuelve", yyline, yycolumn);
            }
            // fall through
          case 82: break;
          case 39:
            { return token(yytext(), "tipoClase", yyline, yycolumn);
            }
            // fall through
          case 83: break;
          case 40:
            { return token(yytext(), "AceptaCadenas", yyline, yycolumn);
            }
            // fall through
          case 84: break;
          case 41:
            { return token(yytext(), "metodoComplementador", yyline, yycolumn);
            }
            // fall through
          case 85: break;
          case 42:
            { return token(yytext(), "MuestraResultado", yyline, yycolumn);
            }
            // fall through
          case 86: break;
          case 43:
            { return token(yytext(), "clases", yyline, yycolumn);
            }
            // fall through
          case 87: break;
          case 44:
            { return token(yytext(), "Saludo", yyline, yycolumn);
            }
            // fall through
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
