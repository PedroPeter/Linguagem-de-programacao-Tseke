package sintaticAnaliser;

// Generated from C:\Users\samsara\Documents\NetBeansProjects\Tseke\src\Tseke.g4 by ANTLR 4.1


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

/**
 *
 * @author Pedro Peter
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TsekeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, PUBLIC=2, PRIVATE=3, PROTECTED=4, CLASS=5, PACKAGE=6, IMPORT=7, 
		MODIFICADOR_ACESSO=8, PRINT=9, ATRIBUICAO=10, IGUAL=11, MAIOR=12, MENOR=13, 
		MAIOR_IGUAL=14, MENOR_IGUAL=15, DIFERENTE=16, NOT=17, OR=18, AND=19, IF=20, 
		ELSE=21, MENOS=22, SOMA=23, SUBTRACAO=24, DIVISAO=25, MULTIPLICACAO=26, 
		TIPO=27, NUM=28, INTEIRO=29, FLOAT=30, STRING=31, ABRIR_CHAVETA=32, FECHAR_CHAVETA=33, 
		ABRIR_PARENTESES=34, FECHAR_PARENTESES=35, PONTO_VIRGULA=36, VIRGULA=37, 
		BRANCO=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "'publico'", "'privado'", "'protegido'", "'classe'", "'pacote'", 
		"'importacao'", "MODIFICADOR_ACESSO", "'sistema.imprimir'", "'='", "'=='", 
		"'>'", "'<'", "'>='", "'<='", "'!='", "'!'", "'|'", "'&&'", "'se'", "'senao'", 
		"MENOS", "'+'", "SUBTRACAO", "'/'", "'*'", "'inteiro|byte|float'", "NUM", 
		"INTEIRO", "FLOAT", "STRING", "'{'", "'}'", "'('", "')'", "';'", "','", 
		"BRANCO"
	};
	public static final String[] ruleNames = {
		"ID", "PUBLIC", "PRIVATE", "PROTECTED", "CLASS", "PACKAGE", "IMPORT", 
		"MODIFICADOR_ACESSO", "PRINT", "ATRIBUICAO", "IGUAL", "MAIOR", "MENOR", 
		"MAIOR_IGUAL", "MENOR_IGUAL", "DIFERENTE", "NOT", "OR", "AND", "IF", "ELSE", 
		"MENOS", "SOMA", "SUBTRACAO", "DIVISAO", "MULTIPLICACAO", "TIPO", "NUM", 
		"INTEIRO", "FLOAT", "STRING", "ABRIR_CHAVETA", "FECHAR_CHAVETA", "ABRIR_PARENTESES", 
		"FECHAR_PARENTESES", "PONTO_VIRGULA", "VIRGULA", "BRANCO"
	};


	public TsekeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tseke.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 29: FLOAT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2(\u0118\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\7\2R\n\2\f\2\16\2"+
		"U\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35"+
		"\u00e1\n\35\3\36\3\36\3\36\7\36\u00e6\n\36\f\36\16\36\u00e9\13\36\5\36"+
		"\u00eb\n\36\3\37\5\37\u00ee\n\37\3\37\6\37\u00f1\n\37\r\37\16\37\u00f2"+
		"\3\37\3\37\3\37\6\37\u00f8\n\37\r\37\16\37\u00f9\3\37\3\37\5\37\u00fe"+
		"\n\37\3\37\6\37\u0101\n\37\r\37\16\37\u0102\5\37\u0105\n\37\3 \3 \3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\2(\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32"+
		"\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \2?!\1A\"\1C#\1E$\1G%\1I&\1K\'"+
		"\1M(\1\3\2\n\6\2C\\aac|~~\7\2\62;C\\aac|~~\3\2\62\62\3\2\63;\3\2\62;\4"+
		"\2--//\4\2GGgg\6\2\13\f\17\17\"\"~~\u0123\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\3O\3\2\2\2\5V\3\2\2\2\7^\3\2\2\2\tf\3\2\2\2\13p\3\2\2\2\rw\3"+
		"\2\2\2\17~\3\2\2\2\21\u008c\3\2\2\2\23\u008e\3\2\2\2\25\u009f\3\2\2\2"+
		"\27\u00a1\3\2\2\2\31\u00a4\3\2\2\2\33\u00a6\3\2\2\2\35\u00a8\3\2\2\2\37"+
		"\u00ab\3\2\2\2!\u00ae\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3"+
		"\2\2\2)\u00b8\3\2\2\2+\u00bb\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61"+
		"\u00c5\3\2\2\2\63\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00e0"+
		"\3\2\2\2;\u00ea\3\2\2\2=\u00ed\3\2\2\2?\u0106\3\2\2\2A\u010a\3\2\2\2C"+
		"\u010c\3\2\2\2E\u010e\3\2\2\2G\u0110\3\2\2\2I\u0112\3\2\2\2K\u0114\3\2"+
		"\2\2M\u0116\3\2\2\2OS\t\2\2\2PR\t\3\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2T\4\3\2\2\2US\3\2\2\2VW\7r\2\2WX\7w\2\2XY\7d\2\2YZ\7n\2\2Z["+
		"\7k\2\2[\\\7e\2\2\\]\7q\2\2]\6\3\2\2\2^_\7r\2\2_`\7t\2\2`a\7k\2\2ab\7"+
		"x\2\2bc\7c\2\2cd\7f\2\2de\7q\2\2e\b\3\2\2\2fg\7r\2\2gh\7t\2\2hi\7q\2\2"+
		"ij\7v\2\2jk\7g\2\2kl\7i\2\2lm\7k\2\2mn\7f\2\2no\7q\2\2o\n\3\2\2\2pq\7"+
		"e\2\2qr\7n\2\2rs\7c\2\2st\7u\2\2tu\7u\2\2uv\7g\2\2v\f\3\2\2\2wx\7r\2\2"+
		"xy\7c\2\2yz\7e\2\2z{\7q\2\2{|\7v\2\2|}\7g\2\2}\16\3\2\2\2~\177\7k\2\2"+
		"\177\u0080\7o\2\2\u0080\u0081\7r\2\2\u0081\u0082\7q\2\2\u0082\u0083\7"+
		"t\2\2\u0083\u0084\7v\2\2\u0084\u0085\7c\2\2\u0085\u0086\7e\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7q\2\2\u0088\20\3\2\2\2\u0089\u008d\5\5\3\2\u008a"+
		"\u008d\5\7\4\2\u008b\u008d\5\t\5\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008b\3\2\2\2\u008d\22\3\2\2\2\u008e\u008f\7u\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7u\2\2\u0091\u0092\7v\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7o\2\2\u0094\u0095\7c\2\2\u0095\u0096\7\60\2\2\u0096\u0097\7k\2"+
		"\2\u0097\u0098\7o\2\2\u0098\u0099\7r\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7k\2\2\u009b\u009c\7o\2\2\u009c\u009d\7k\2\2\u009d\u009e\7t\2\2\u009e"+
		"\24\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2"+
		"\u00a3\7?\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\32\3\2\2\2\u00a6"+
		"\u00a7\7>\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa\7?\2\2\u00aa"+
		"\36\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7?\2\2\u00ad \3\2\2\2\u00ae"+
		"\u00af\7#\2\2\u00af\u00b0\7?\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2"+
		"$\3\2\2\2\u00b3\u00b4\7~\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7"+
		"\7(\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba*\3"+
		"\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7c\2\2\u00bf\u00c0\7q\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7/\2\2\u00c2"+
		".\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7/\2\2\u00c6"+
		"\62\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca"+
		"\66\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce"+
		"\u00cf\7g\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7q\2\2"+
		"\u00d2\u00d3\7~\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7{\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7~\2\2\u00d8\u00d9\7h\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7v\2\2"+
		"\u00dd8\3\2\2\2\u00de\u00e1\5;\36\2\u00df\u00e1\5=\37\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00df\3\2\2\2\u00e1:\3\2\2\2\u00e2\u00eb\t\4\2\2\u00e3\u00e7"+
		"\t\5\2\2\u00e4\u00e6\t\6\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e3\3\2\2\2\u00eb<\3\2\2\2\u00ec\u00ee"+
		"\t\7\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00f1\t\6\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\13\2\2\2\u00f5"+
		"\u00f7\b\37\2\2\u00f6\u00f8\t\6\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0104\3\2\2\2\u00fb"+
		"\u00fd\t\b\2\2\u00fc\u00fe\t\7\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u0100\3\2\2\2\u00ff\u0101\t\6\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u00fb\3\2\2\2\u0104\u0105\3\2\2\2\u0105>\3\2\2\2\u0106\u0107"+
		"\7$\2\2\u0107\u0108\13\2\2\2\u0108\u0109\7$\2\2\u0109@\3\2\2\2\u010a\u010b"+
		"\7}\2\2\u010bB\3\2\2\2\u010c\u010d\7\177\2\2\u010dD\3\2\2\2\u010e\u010f"+
		"\7*\2\2\u010fF\3\2\2\2\u0110\u0111\7+\2\2\u0111H\3\2\2\2\u0112\u0113\7"+
		"=\2\2\u0113J\3\2\2\2\u0114\u0115\7.\2\2\u0115L\3\2\2\2\u0116\u0117\t\t"+
		"\2\2\u0117N\3\2\2\2\16\2S\u008c\u00e0\u00e7\u00ea\u00ed\u00f2\u00f9\u00fd"+
		"\u0102\u0104";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}