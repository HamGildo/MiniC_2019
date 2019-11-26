// Generated from C:/Users/ham54/IdeaProjects/MiniC_2019/src\MiniC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, VOID=20, INT=21, WHILE=22, IF=23, ELSE=24, RETURN=25, 
		OR=26, AND=27, LE=28, GE=29, EQ=30, NE=31, IDENT=32, LITERAL=33, DecimalConstant=34, 
		OctalConstant=35, HexadecimalConstant=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "VOID", "INT", "WHILE", "IF", "ELSE", "RETURN", "OR", 
			"AND", "LE", "GE", "EQ", "NE", "IDENT", "LITERAL", "DecimalConstant", 
			"OctalConstant", "HexadecimalConstant", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "']'", "'('", "')'", "','", "'{'", "'}'", 
			"'-'", "'+'", "'--'", "'++'", "'*'", "'/'", "'%'", "'<'", "'>'", "'!'", 
			"'void'", "'int'", "'while'", "'if'", "'else'", "'return'", "'or'", "'and'", 
			"'<='", "'>='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "VOID", "INT", "WHILE", 
			"IF", "ELSE", "RETURN", "OR", "AND", "LE", "GE", "EQ", "NE", "IDENT", 
			"LITERAL", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MiniCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19:
			VOID_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			INT_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			RETURN_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			LE_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			GE_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			EQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			NE_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			IDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			LITERAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			DecimalConstant_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			OctalConstant_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			HexadecimalConstant_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void VOID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("201702087 Rule16");
			break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("201702087 Rule17");
			break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("201702087 Rule18");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("201702087 Rule19");
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("201702087 Rule20");
			break;
		}
	}
	private void RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("201702087 Rule21");
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("201702087 Rule22");
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("201702087 Rule23");
			break;
		}
	}
	private void LE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("201702087 Rule24");
			break;
		}
	}
	private void GE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("201702087 Rule25");
			break;
		}
	}
	private void EQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println("201702087 Rule26");
			break;
		}
	}
	private void NE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			System.out.println("201702087 Rule27");
			break;
		}
	}
	private void IDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			System.out.println("201702087 Rule28-1");
			break;
		case 13:
			System.out.println("201702087 Rule28-2");
			break;
		case 14:
			System.out.println("201702087 Rule28-3");
			break;
		case 15:
			System.out.println("201702087 Rule28-4");
			break;
		}
	}
	private void LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			System.out.println("201702087 Rule29-1");
			break;
		case 17:
			System.out.println("201702087 Rule29-2");
			break;
		case 18:
			System.out.println("201702087 Rule29-3");
			break;
		}
	}
	private void DecimalConstant_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			System.out.println("201702087 Rule30-1");
			break;
		case 20:
			System.out.println("201702087 Rule30-2");
			break;
		}
	}
	private void OctalConstant_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			System.out.println("201702087 Rule31");
			break;
		}
	}
	private void HexadecimalConstant_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			System.out.println("201702087 Rule32");
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			System.out.println("201702087 Rule33-1");
			break;
		case 24:
			System.out.println("201702087 Rule33-2");
			break;
		case 25:
			System.out.println("201702087 Rule33-3");
			break;
		case 26:
			System.out.println("201702087 Rule33-4");
			break;
		case 27:
			System.out.println("201702087 Rule33-5");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u00c5\n!\f!\16!\u00c8\13!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00d5\n\"\3#\3#\3#\3#\7#\u00db\n#\f#"+
		"\16#\u00de\13#\3#\5#\u00e1\n#\3$\3$\7$\u00e5\n$\f$\16$\u00e8\13$\3$\3"+
		"$\3%\3%\3%\6%\u00ef\n%\r%\16%\u00f0\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\6&\u00fd"+
		"\n&\r&\16&\u00fe\3&\3&\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\b\5\2C\\aa"+
		"c|\3\2\62;\3\2\63;\3\2\629\4\2ZZzz\5\2\62;CHch\2\u010f\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3"+
		"\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31"+
		"c\3\2\2\2\33f\3\2\2\2\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3"+
		"\2\2\2\'s\3\2\2\2)u\3\2\2\2+|\3\2\2\2-\u0082\3\2\2\2/\u008a\3\2\2\2\61"+
		"\u008f\3\2\2\2\63\u0096\3\2\2\2\65\u009f\3\2\2\2\67\u00a4\3\2\2\29\u00aa"+
		"\3\2\2\2;\u00af\3\2\2\2=\u00b4\3\2\2\2?\u00b9\3\2\2\2A\u00be\3\2\2\2C"+
		"\u00d4\3\2\2\2E\u00e0\3\2\2\2G\u00e2\3\2\2\2I\u00eb\3\2\2\2K\u00fc\3\2"+
		"\2\2MN\7=\2\2N\4\3\2\2\2OP\7?\2\2P\6\3\2\2\2QR\7]\2\2R\b\3\2\2\2ST\7_"+
		"\2\2T\n\3\2\2\2UV\7*\2\2V\f\3\2\2\2WX\7+\2\2X\16\3\2\2\2YZ\7.\2\2Z\20"+
		"\3\2\2\2[\\\7}\2\2\\\22\3\2\2\2]^\7\177\2\2^\24\3\2\2\2_`\7/\2\2`\26\3"+
		"\2\2\2ab\7-\2\2b\30\3\2\2\2cd\7/\2\2de\7/\2\2e\32\3\2\2\2fg\7-\2\2gh\7"+
		"-\2\2h\34\3\2\2\2ij\7,\2\2j\36\3\2\2\2kl\7\61\2\2l \3\2\2\2mn\7\'\2\2"+
		"n\"\3\2\2\2op\7>\2\2p$\3\2\2\2qr\7@\2\2r&\3\2\2\2st\7#\2\2t(\3\2\2\2u"+
		"v\7x\2\2vw\7q\2\2wx\7k\2\2xy\7f\2\2yz\3\2\2\2z{\b\25\2\2{*\3\2\2\2|}\7"+
		"k\2\2}~\7p\2\2~\177\7v\2\2\177\u0080\3\2\2\2\u0080\u0081\b\26\3\2\u0081"+
		",\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084\7j\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\27"+
		"\4\2\u0089.\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\b\30\5\2\u008e\60\3\2\2\2\u008f\u0090\7g\2\2\u0090"+
		"\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\u0094\3\2\2"+
		"\2\u0094\u0095\b\31\6\2\u0095\62\3\2\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7v\2\2\u0099\u009a\7w\2\2\u009a\u009b\7t\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\32\7\2\u009e\64\3\2\2"+
		"\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\b\33\b\2\u00a3\66\3\2\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7f\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\34\t\2\u00a98\3\2\2\2"+
		"\u00aa\u00ab\7>\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\b\35\n\2\u00ae:\3\2\2\2\u00af\u00b0\7@\2\2\u00b0\u00b1\7?\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\b\36\13\2\u00b3<\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5"+
		"\u00b6\7?\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\37\f\2\u00b8>\3\2\2\2"+
		"\u00b9\u00ba\7#\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\b \r\2\u00bd@\3\2\2\2\u00be\u00bf\t\2\2\2\u00bf\u00c6\b!\16\2\u00c0\u00c1"+
		"\t\2\2\2\u00c1\u00c5\b!\17\2\u00c2\u00c3\t\3\2\2\u00c3\u00c5\b!\20\2\u00c4"+
		"\u00c0\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\b!\21\2\u00caB\3\2\2\2\u00cb\u00cc\5E#\2\u00cc\u00cd\b\"\22\2\u00cd"+
		"\u00d5\3\2\2\2\u00ce\u00cf\5G$\2\u00cf\u00d0\b\"\23\2\u00d0\u00d5\3\2"+
		"\2\2\u00d1\u00d2\5I%\2\u00d2\u00d3\b\"\24\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00cb\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5D\3\2\2\2"+
		"\u00d6\u00d7\7\62\2\2\u00d7\u00e1\b#\25\2\u00d8\u00dc\t\4\2\2\u00d9\u00db"+
		"\t\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\b#"+
		"\26\2\u00e0\u00d6\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e1F\3\2\2\2\u00e2\u00e6"+
		"\7\62\2\2\u00e3\u00e5\t\5\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ea\b$\27\2\u00eaH\3\2\2\2\u00eb\u00ec\7\62\2\2\u00ec"+
		"\u00ee\t\6\2\2\u00ed\u00ef\t\7\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\b%\30\2\u00f3J\3\2\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00fd\b&\31\2"+
		"\u00f6\u00f7\7\13\2\2\u00f7\u00fd\b&\32\2\u00f8\u00f9\7\17\2\2\u00f9\u00fd"+
		"\b&\33\2\u00fa\u00fb\7\f\2\2\u00fb\u00fd\b&\34\2\u00fc\u00f4\3\2\2\2\u00fc"+
		"\u00f6\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\b&\35\2\u0101\u0102\3\2\2\2\u0102\u0103\b&\36\2\u0103L\3\2\2\2"+
		"\f\2\u00c4\u00c6\u00d4\u00dc\u00e0\u00e6\u00f0\u00fc\u00fe\37\3\25\2\3"+
		"\26\3\3\27\4\3\30\5\3\31\6\3\32\7\3\33\b\3\34\t\3\35\n\3\36\13\3\37\f"+
		"\3 \r\3!\16\3!\17\3!\20\3!\21\3\"\22\3\"\23\3\"\24\3#\25\3#\26\3$\27\3"+
		"%\30\3&\31\3&\32\3&\33\3&\34\3&\35\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}