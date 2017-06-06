// Generated from C:\Users\samsara\Documents\NetBeansProjects\Tseke\src\sintaticAnaliser\Tseke.g4 by ANTLR 4.1
package sintaticAnaliser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TsekeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, PRIVATE=2, PROTECTED=3, CLASS=4, PACKAGE=5, IMPORT=6, MODIFICADOR_ACESSO=7, 
		PRINT=8, ATRIBUICAO=9, IGUAL=10, MAIOR=11, MENOR=12, MAIOR_IGUAL=13, MENOR_IGUAL=14, 
		DIFERENTE=15, NOT=16, OR=17, AND=18, IF=19, ELSE=20, MENOS=21, SOMA=22, 
		SUBTRACAO=23, DIVISAO=24, MULTIPLICACAO=25, TIPO=26, NUM=27, INTEIRO=28, 
		FLOAT=29, STRING=30, ABRIR_CHAVETA=31, FECHAR_CHAVETA=32, ABRIR_PARENTESES=33, 
		FECHAR_PARENTESES=34, PONTO_VIRGULA=35, VIRGULA=36, BRANCO=37, ID=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'publico'", "'privado'", "'protegido'", "'classe'", "'pacote'", "'importacao'", 
		"MODIFICADOR_ACESSO", "'sistema.imprimir'", "'='", "'=='", "'>'", "'<'", 
		"'>='", "'<='", "'!='", "'!'", "'|'", "'&&'", "'se'", "'senao'", "MENOS", 
		"'+'", "SUBTRACAO", "'/'", "'*'", "TIPO", "NUM", "INTEIRO", "FLOAT", "STRING", 
		"'{'", "'}'", "'('", "')'", "';'", "','", "BRANCO", "ID"
	};
	public static final String[] ruleNames = {
		"PUBLIC", "PRIVATE", "PROTECTED", "CLASS", "PACKAGE", "IMPORT", "MODIFICADOR_ACESSO", 
		"PRINT", "ATRIBUICAO", "IGUAL", "MAIOR", "MENOR", "MAIOR_IGUAL", "MENOR_IGUAL", 
		"DIFERENTE", "NOT", "OR", "AND", "IF", "ELSE", "MENOS", "SOMA", "SUBTRACAO", 
		"DIVISAO", "MULTIPLICACAO", "TIPO", "NUM", "INTEIRO", "FLOAT", "STRING", 
		"ABRIR_CHAVETA", "FECHAR_CHAVETA", "ABRIR_PARENTESES", "FECHAR_PARENTESES", 
		"PONTO_VIRGULA", "VIRGULA", "BRANCO", "ID"
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
		case 28: FLOAT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2(\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0086\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00db\n\33\3\34\3\34\5\34\u00df"+
		"\n\34\3\35\3\35\3\35\7\35\u00e4\n\35\f\35\16\35\u00e7\13\35\5\35\u00e9"+
		"\n\35\3\36\5\36\u00ec\n\36\3\36\6\36\u00ef\n\36\r\36\16\36\u00f0\3\36"+
		"\3\36\3\36\6\36\u00f6\n\36\r\36\16\36\u00f7\3\36\3\36\5\36\u00fc\n\36"+
		"\3\36\6\36\u00ff\n\36\r\36\16\36\u0100\5\36\u0103\n\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\7\'\u0119\n"+
		"\'\f\'\16\'\u011c\13\'\2(\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35"+
		"\19\36\1;\37\2= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1\3\2\n\3\2\62\62\3"+
		"\2\63;\3\2\62;\4\2--//\4\2GGgg\6\2\13\f\17\17\"\"~~\6\2C\\aac|~~\7\2\62"+
		";C\\aac|~~\u012b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5W\3\2"+
		"\2\2\7_\3\2\2\2\ti\3\2\2\2\13p\3\2\2\2\rw\3\2\2\2\17\u0085\3\2\2\2\21"+
		"\u0087\3\2\2\2\23\u0098\3\2\2\2\25\u009a\3\2\2\2\27\u009d\3\2\2\2\31\u009f"+
		"\3\2\2\2\33\u00a1\3\2\2\2\35\u00a4\3\2\2\2\37\u00a7\3\2\2\2!\u00aa\3\2"+
		"\2\2#\u00ac\3\2\2\2%\u00ae\3\2\2\2\'\u00b1\3\2\2\2)\u00b4\3\2\2\2+\u00ba"+
		"\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2"+
		"\2\65\u00da\3\2\2\2\67\u00de\3\2\2\29\u00e8\3\2\2\2;\u00eb\3\2\2\2=\u0104"+
		"\3\2\2\2?\u0108\3\2\2\2A\u010a\3\2\2\2C\u010c\3\2\2\2E\u010e\3\2\2\2G"+
		"\u0110\3\2\2\2I\u0112\3\2\2\2K\u0114\3\2\2\2M\u0116\3\2\2\2OP\7r\2\2P"+
		"Q\7w\2\2QR\7d\2\2RS\7n\2\2ST\7k\2\2TU\7e\2\2UV\7q\2\2V\4\3\2\2\2WX\7r"+
		"\2\2XY\7t\2\2YZ\7k\2\2Z[\7x\2\2[\\\7c\2\2\\]\7f\2\2]^\7q\2\2^\6\3\2\2"+
		"\2_`\7r\2\2`a\7t\2\2ab\7q\2\2bc\7v\2\2cd\7g\2\2de\7i\2\2ef\7k\2\2fg\7"+
		"f\2\2gh\7q\2\2h\b\3\2\2\2ij\7e\2\2jk\7n\2\2kl\7c\2\2lm\7u\2\2mn\7u\2\2"+
		"no\7g\2\2o\n\3\2\2\2pq\7r\2\2qr\7c\2\2rs\7e\2\2st\7q\2\2tu\7v\2\2uv\7"+
		"g\2\2v\f\3\2\2\2wx\7k\2\2xy\7o\2\2yz\7r\2\2z{\7q\2\2{|\7t\2\2|}\7v\2\2"+
		"}~\7c\2\2~\177\7e\2\2\177\u0080\7c\2\2\u0080\u0081\7q\2\2\u0081\16\3\2"+
		"\2\2\u0082\u0086\5\3\2\2\u0083\u0086\5\5\3\2\u0084\u0086\5\7\4\2\u0085"+
		"\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\20\3\2\2"+
		"\2\u0087\u0088\7u\2\2\u0088\u0089\7k\2\2\u0089\u008a\7u\2\2\u008a\u008b"+
		"\7v\2\2\u008b\u008c\7g\2\2\u008c\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7\60\2\2\u008f\u0090\7k\2\2\u0090\u0091\7o\2\2\u0091\u0092\7r\2"+
		"\2\u0092\u0093\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7o\2\2\u0095\u0096"+
		"\7k\2\2\u0096\u0097\7t\2\2\u0097\22\3\2\2\2\u0098\u0099\7?\2\2\u0099\24"+
		"\3\2\2\2\u009a\u009b\7?\2\2\u009b\u009c\7?\2\2\u009c\26\3\2\2\2\u009d"+
		"\u009e\7@\2\2\u009e\30\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\32\3\2\2\2\u00a1"+
		"\u00a2\7@\2\2\u00a2\u00a3\7?\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8\u00a9\7?\2\2\u00a9"+
		" \3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7~\2\2\u00ad"+
		"$\3\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\7(\2\2\u00b0&\3\2\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7g\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7q\2\2\u00b9"+
		"*\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd."+
		"\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1"+
		"\62\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7k\2\2"+
		"\u00c9\u00ca\7t\2\2\u00ca\u00db\7q\2\2\u00cb\u00cc\7d\2\2\u00cc\u00cd"+
		"\7{\2\2\u00cd\u00ce\7v\2\2\u00ce\u00db\7g\2\2\u00cf\u00d0\7h\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7c\2\2\u00d3\u00db\7v\2\2"+
		"\u00d4\u00d5\7U\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00db\7i\2\2\u00da\u00c4\3\2\2\2\u00da"+
		"\u00cb\3\2\2\2\u00da\u00cf\3\2\2\2\u00da\u00d4\3\2\2\2\u00db\66\3\2\2"+
		"\2\u00dc\u00df\59\35\2\u00dd\u00df\5;\36\2\u00de\u00dc\3\2\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df8\3\2\2\2\u00e0\u00e9\t\2\2\2\u00e1\u00e5\t\3\2\2\u00e2"+
		"\u00e4\t\4\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e9:\3\2\2\2\u00ea\u00ec\t\5\2\2"+
		"\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef"+
		"\t\4\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\60\2\2\u00f3\u00f5\b"+
		"\36\2\2\u00f4\u00f6\t\4\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0102\3\2\2\2\u00f9\u00fb\t\6"+
		"\2\2\u00fa\u00fc\t\5\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00ff\t\4\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00f9\3\2\2\2\u0102\u0103\3\2\2\2\u0103<\3\2\2\2\u0104\u0105\7$\2\2\u0105"+
		"\u0106\13\2\2\2\u0106\u0107\7$\2\2\u0107>\3\2\2\2\u0108\u0109\7}\2\2\u0109"+
		"@\3\2\2\2\u010a\u010b\7\177\2\2\u010bB\3\2\2\2\u010c\u010d\7*\2\2\u010d"+
		"D\3\2\2\2\u010e\u010f\7+\2\2\u010fF\3\2\2\2\u0110\u0111\7=\2\2\u0111H"+
		"\3\2\2\2\u0112\u0113\7.\2\2\u0113J\3\2\2\2\u0114\u0115\t\7\2\2\u0115L"+
		"\3\2\2\2\u0116\u011a\t\b\2\2\u0117\u0119\t\t\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bN\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\17\2\u0085\u00da\u00de\u00e5\u00e8\u00eb\u00f0\u00f7"+
		"\u00fb\u0100\u0102\u011a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}