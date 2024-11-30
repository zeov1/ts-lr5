// Generated from C:/Projects/IdeaProjects/ts-lr5/grammars/IfElse.g4 by ANTLR 4.13.2
package org.example.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IfElseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, IF=9, 
		ELSE=10, IDENTIFIER=11, CONSTANT=12, EQ=13, NEQ=14, GE=15, LE=16, GT=17, 
		LT=18, ASSIGN=19, AND=20, OR=21, NOT=22, ADD=23, SUB=24, MUL=25, DIV=26, 
		WS=27, LINE_COMMENT=28, NEWLINE=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "IF", 
			"ELSE", "IDENTIFIER", "CONSTANT", "EQ", "NEQ", "GE", "LE", "GT", "LT", 
			"ASSIGN", "AND", "OR", "NOT", "ADD", "SUB", "MUL", "DIV", "WS", "LINE_COMMENT", 
			"NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'[]'", "'if'", 
			"'else'", null, null, "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'='", 
			"'&'", "'|'", "'~'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "IF", "ELSE", "IDENTIFIER", 
			"CONSTANT", "EQ", "NEQ", "GE", "LE", "GT", "LT", "ASSIGN", "AND", "OR", 
			"NOT", "ADD", "SUB", "MUL", "DIV", "WS", "LINE_COMMENT", "NEWLINE"
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


	public IfElseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IfElse.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u001d\u0099\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nW\b\n\n\n\f\nZ\t\n\u0001"+
		"\u000b\u0004\u000b]\b\u000b\u000b\u000b\f\u000b^\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a"+
		"\u0082\b\u001a\u000b\u001a\f\u001a\u0083\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u008c\b\u001b\n"+
		"\u001b\f\u001b\u008f\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0096\b\u001c\u0001\u001c\u0001\u001c\u0000"+
		"\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d\u0001\u0000\u0005\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000\t\t  \u0002"+
		"\u0000\n\n\r\r\u009d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000"+
		"\u0000\u0003=\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007"+
		"A\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bE\u0001\u0000"+
		"\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000fI\u0001\u0000\u0000\u0000"+
		"\u0011L\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000\u0000\u0015T"+
		"\u0001\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019`\u0001"+
		"\u0000\u0000\u0000\u001bc\u0001\u0000\u0000\u0000\u001df\u0001\u0000\u0000"+
		"\u0000\u001fi\u0001\u0000\u0000\u0000!l\u0001\u0000\u0000\u0000#n\u0001"+
		"\u0000\u0000\u0000%p\u0001\u0000\u0000\u0000\'r\u0001\u0000\u0000\u0000"+
		")t\u0001\u0000\u0000\u0000+v\u0001\u0000\u0000\u0000-x\u0001\u0000\u0000"+
		"\u0000/z\u0001\u0000\u0000\u00001|\u0001\u0000\u0000\u00003~\u0001\u0000"+
		"\u0000\u00005\u0081\u0001\u0000\u0000\u00007\u0087\u0001\u0000\u0000\u0000"+
		"9\u0095\u0001\u0000\u0000\u0000;<\u0005;\u0000\u0000<\u0002\u0001\u0000"+
		"\u0000\u0000=>\u0005(\u0000\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005"+
		")\u0000\u0000@\u0006\u0001\u0000\u0000\u0000AB\u0005{\u0000\u0000B\b\u0001"+
		"\u0000\u0000\u0000CD\u0005}\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005"+
		"[\u0000\u0000F\f\u0001\u0000\u0000\u0000GH\u0005]\u0000\u0000H\u000e\u0001"+
		"\u0000\u0000\u0000IJ\u0005[\u0000\u0000JK\u0005]\u0000\u0000K\u0010\u0001"+
		"\u0000\u0000\u0000LM\u0005i\u0000\u0000MN\u0005f\u0000\u0000N\u0012\u0001"+
		"\u0000\u0000\u0000OP\u0005e\u0000\u0000PQ\u0005l\u0000\u0000QR\u0005s"+
		"\u0000\u0000RS\u0005e\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TX\u0007"+
		"\u0000\u0000\u0000UW\u0007\u0001\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\u0016\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0007"+
		"\u0002\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0018\u0001\u0000"+
		"\u0000\u0000`a\u0005=\u0000\u0000ab\u0005=\u0000\u0000b\u001a\u0001\u0000"+
		"\u0000\u0000cd\u0005!\u0000\u0000de\u0005=\u0000\u0000e\u001c\u0001\u0000"+
		"\u0000\u0000fg\u0005>\u0000\u0000gh\u0005=\u0000\u0000h\u001e\u0001\u0000"+
		"\u0000\u0000ij\u0005<\u0000\u0000jk\u0005=\u0000\u0000k \u0001\u0000\u0000"+
		"\u0000lm\u0005>\u0000\u0000m\"\u0001\u0000\u0000\u0000no\u0005<\u0000"+
		"\u0000o$\u0001\u0000\u0000\u0000pq\u0005=\u0000\u0000q&\u0001\u0000\u0000"+
		"\u0000rs\u0005&\u0000\u0000s(\u0001\u0000\u0000\u0000tu\u0005|\u0000\u0000"+
		"u*\u0001\u0000\u0000\u0000vw\u0005~\u0000\u0000w,\u0001\u0000\u0000\u0000"+
		"xy\u0005+\u0000\u0000y.\u0001\u0000\u0000\u0000z{\u0005-\u0000\u0000{"+
		"0\u0001\u0000\u0000\u0000|}\u0005*\u0000\u0000}2\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005/\u0000\u0000\u007f4\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0007\u0003\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0006\u001a\u0000\u0000\u00866\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"/\u0000\u0000\u0088\u0089\u0005/\u0000\u0000\u0089\u008d\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\b\u0004\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u001b\u0000\u0000"+
		"\u00918\u0001\u0000\u0000\u0000\u0092\u0096\u0005\n\u0000\u0000\u0093"+
		"\u0094\u0005\n\u0000\u0000\u0094\u0096\u0005\r\u0000\u0000\u0095\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0006\u001c\u0001\u0000\u0098:\u0001"+
		"\u0000\u0000\u0000\u0006\u0000X^\u0083\u008d\u0095\u0002\u0006\u0000\u0000"+
		"\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}