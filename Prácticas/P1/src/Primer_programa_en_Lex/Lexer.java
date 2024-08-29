// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: archivo2.flex

/**
* Escáner que detecta números y palabras
*/


@SuppressWarnings("fallthrough")
public class Lexer {

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
    "\1\0\u10ff\u0100";

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
    "\11\0\2\1\25\0\1\1\17\0\1\2\11\3\7\0"+
    "\6\4\21\5\1\6\2\5\4\0\1\7\1\0\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\2\5\1\16\2\5"+
    "\1\17\1\5\1\20\1\21\1\22\1\5\1\23\1\24"+
    "\1\25\1\26\1\27\1\5\1\6\2\5\u0185\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
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
    "\1\0\1\1\1\2\2\3\6\4\1\0\10\4\1\5"+
    "\3\4\1\6\13\4\1\6\2\4\1\6\7\4\1\6"+
    "\2\4\1\6\6\4\1\6\56\4\1\7";

  private static int [] zzUnpackAction() {
    int [] result = new int[105];
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
    "\0\0\0\30\0\60\0\110\0\140\0\170\0\220\0\250"+
    "\0\300\0\330\0\360\0\u0108\0\u0120\0\u0138\0\u0150\0\u0168"+
    "\0\u0180\0\u0198\0\u01b0\0\u01c8\0\u0108\0\u01e0\0\u01f8\0\u0210"+
    "\0\u01f8\0\u0228\0\u0240\0\u0258\0\u0270\0\u0288\0\u02a0\0\u02b8"+
    "\0\u02d0\0\u02e8\0\u0300\0\u0318\0\u02b8\0\u0330\0\u0348\0\u0348"+
    "\0\u0360\0\u0378\0\u0390\0\u03a8\0\u03c0\0\u03d8\0\u03f0\0\u03c0"+
    "\0\u0408\0\u0420\0\u0420\0\u0438\0\u0450\0\u0468\0\u0480\0\u0498"+
    "\0\u04b0\0\u04b0\0\u04c8\0\u04e0\0\u04f8\0\u0510\0\u0528\0\u0540"+
    "\0\u0558\0\u0570\0\u0588\0\u05a0\0\u05b8\0\u05d0\0\u05e8\0\u0600"+
    "\0\u0618\0\u0630\0\u0648\0\u0660\0\u0678\0\u0690\0\u06a8\0\u06c0"+
    "\0\u06d8\0\u06f0\0\u0708\0\u0720\0\u0738\0\u0750\0\u0768\0\u0780"+
    "\0\u0798\0\u07b0\0\u07c8\0\u07e0\0\u07f8\0\u0810\0\u0828\0\u0840"+
    "\0\u0858\0\u0870\0\u0888\0\u08a0\0\u08b8\0\u08d0\0\30\0\u08e8"+
    "\0\u08e8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\3\6\1\2\5\6\1\7"+
    "\1\10\3\6\1\11\1\6\1\12\2\6\1\13\31\0"+
    "\1\3\30\0\2\5\2\0\1\14\23\0\2\5\26\0"+
    "\2\15\3\16\1\15\20\16\2\0\2\15\3\16\1\15"+
    "\6\16\1\17\11\16\2\0\2\15\3\16\1\15\10\16"+
    "\1\20\7\16\2\0\2\15\3\16\1\15\13\16\1\21"+
    "\2\16\1\22\1\16\2\0\2\15\3\16\1\15\15\16"+
    "\1\23\2\16\2\0\2\15\3\16\1\15\11\16\1\24"+
    "\6\16\2\0\3\25\3\0\6\25\14\0\26\26\2\0"+
    "\2\26\3\27\1\26\20\27\2\0\2\26\3\27\1\26"+
    "\10\27\1\30\7\27\2\0\2\26\3\27\1\26\15\27"+
    "\1\31\2\27\2\0\2\26\3\27\1\26\6\27\1\32"+
    "\2\27\1\33\6\27\2\0\2\26\3\27\1\26\1\27"+
    "\1\34\16\27\2\0\2\26\3\27\1\26\1\35\17\27"+
    "\2\0\2\26\3\27\1\26\6\27\1\36\11\27\2\0"+
    "\26\37\2\0\2\37\3\40\1\37\20\40\2\0\2\37"+
    "\3\40\1\37\1\41\17\40\2\0\2\37\3\40\1\37"+
    "\17\40\1\42\2\0\2\37\3\40\1\37\15\40\1\43"+
    "\2\40\2\0\2\37\3\40\1\37\7\40\1\44\10\40"+
    "\2\0\2\37\3\40\1\37\15\40\1\44\2\40\2\0"+
    "\2\37\3\40\1\37\3\40\1\45\14\40\2\0\26\46"+
    "\2\0\2\46\3\47\1\46\20\47\2\0\2\46\3\47"+
    "\1\46\7\47\1\50\10\47\2\0\2\46\3\47\1\46"+
    "\1\51\17\47\2\0\2\46\3\47\1\46\4\47\1\52"+
    "\13\47\2\0\2\46\3\47\1\46\6\47\1\53\11\47"+
    "\2\0\26\54\2\0\2\54\3\55\1\54\20\55\2\0"+
    "\2\54\3\55\1\54\15\55\1\56\2\55\2\0\2\54"+
    "\3\55\1\54\2\55\1\57\15\55\2\0\2\54\3\55"+
    "\1\54\2\55\1\60\15\55\2\0\26\61\2\0\2\61"+
    "\3\62\1\61\20\62\2\0\2\61\3\62\1\61\4\62"+
    "\1\63\13\62\2\0\2\61\3\62\1\61\15\62\1\64"+
    "\2\62\2\0\26\65\2\0\2\65\3\66\1\65\20\66"+
    "\2\0\2\65\3\66\1\65\4\66\1\67\13\66\2\0"+
    "\26\70\2\0\2\70\3\71\1\70\20\71\2\0\2\70"+
    "\3\71\1\70\3\71\1\72\14\71\2\0\26\73\2\0"+
    "\2\73\3\74\1\73\20\74\2\0\26\75\2\0\2\75"+
    "\3\76\1\75\20\76\2\0\26\77\2\0\2\77\3\100"+
    "\1\77\20\100\2\0\26\101\2\0\2\101\3\102\1\101"+
    "\20\102\2\0\26\103\2\0\2\103\3\104\1\103\20\104"+
    "\2\0\26\105\2\0\2\105\3\106\1\105\20\106\2\0"+
    "\26\107\2\0\2\107\3\110\1\107\20\110\2\0\26\111"+
    "\2\0\2\111\3\112\1\111\20\112\2\0\26\113\2\0"+
    "\2\113\3\114\1\113\20\114\2\0\26\115\2\0\2\115"+
    "\3\116\1\115\20\116\2\0\26\117\2\0\2\117\3\120"+
    "\1\117\20\120\2\0\26\121\2\0\2\121\3\122\1\121"+
    "\20\122\2\0\26\123\2\0\2\123\3\124\1\123\20\124"+
    "\2\0\26\125\2\0\2\125\3\126\1\125\20\126\2\0"+
    "\26\127\2\0\2\127\3\130\1\127\20\130\2\0\26\131"+
    "\2\0\2\131\3\132\1\131\20\132\2\0\26\133\2\0"+
    "\2\133\3\134\1\133\20\134\2\0\26\135\2\0\2\135"+
    "\3\136\1\135\20\136\2\0\26\137\2\0\2\137\3\140"+
    "\1\137\20\140\2\0\26\141\2\0\2\141\3\142\1\141"+
    "\20\142\2\0\26\143\2\0\2\143\3\144\1\143\20\144"+
    "\2\0\26\145\2\0\2\145\3\146\1\145\20\146\2\0"+
    "\26\147\2\0\2\147\3\150\1\147\20\150\4\0\3\151"+
    "\1\0\20\151";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2304];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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
    "\1\0\1\11\11\1\1\0\132\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[105];
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
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

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
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
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
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
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
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
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
  public int yylex() throws java.io.IOException
  {
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
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.print(yytext());
            }
          // fall through
          case 8: break;
          case 2:
            { System.out.println("Encontré un espacio: " + yytext()+"\n");
            }
          // fall through
          case 9: break;
          case 3:
            { System.out.println("Encontré un número: " + yytext()+"\n");
            }
          // fall through
          case 10: break;
          case 4:
            { System.out.println("Encontré un identificador válido: " + yytext()+"\n");
            }
          // fall through
          case 11: break;
          case 5:
            { System.out.println("Encontré un hexadecimal: " + yytext()+"\n");
            }
          // fall through
          case 12: break;
          case 6:
            { System.out.println("Encontré una palabra reservada: " + yytext()+"\n");
            }
          // fall through
          case 13: break;
          case 7:
            { System.out.println("Encontré una palabra: " + yytext()+"\n");
            }
          // fall through
          case 14: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        java.io.FileInputStream stream = null;
        java.io.Reader reader = null;
        try {
          stream = new java.io.FileInputStream(argv[i]);
          reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
        finally {
          if (reader != null) {
            try {
              reader.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
          if (stream != null) {
            try {
              stream.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
        }
      }
    }
  }


}
