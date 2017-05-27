package lexAnaliser;
import java_cup.runtime.*;

%%

%{

private TsekeToken createToken(String name, String value) {
    return new TsekeToken( name, value, yyline, yycolumn);
}

%}


%public
%class LexicalAnalyzer
%type TsekeToken
%line
%column



BRANCO = [\n| |\t|\r]
PUBLIC = "public"
PRIVATE = "private"
PROTECTED = "protected"
CLASS = "class"
PACKAGE = "package"
PACOTE = "([a-z]+.)*[a-z]+"
IMPORTACAO_PACOTE = "([a-zA-Z]+.)+(\\*)"
MODIFICADOR_ACESSO = "public|private|protected"
IMPORT = "import"
ABRIR_CHAVETA = "\\{"
FECHAR_CHAVETA = "\\}";
ABRIR_PARENTESES = "\\("
FECHAR_PARENTESES = "\\)"
PONTO_VIRGULA = ";"
VIRGULA = ","

SOMA = "+"
SUBTRACAO = "-"
DIVISAO = "/"
MULTIPLICACAO = "*"
INTEIRO = 0|[1-9][0-9]*
ID = @[_|a-z|A-Z][a-z|A-Z|0-9|_]*
FLOAT = [-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?

%%

"if"                         { { return createToken("Palavra reservada if", yytext()); } }
"else"                       { { return createToken("Palavra reservada else", yytext()); } }
{BRANCO}                     { { return createToken("Espaco em branco", yytext()); } }
{SOMA}                         {{ return createToken("Operador de soma", yytext()); } }
{SUBTRACAO}                         {{ return createToken("Operador de Subtracao", yytext()); } }
{DIVISAO}                         {{ return createToken("Operador de Divisao", yytext()); } }
{MULTIPLICACAO}                         {{ return createToken("Operador de Multiplicacao", yytext()); } }
{INTEIRO}                     { return createToken("inteiro", yytext()); }
{FLOAT}                      {return createToken("float", yytext());}
{BRANCO} { /**/ }
{PUBLIC} { return createToken("PUBLIC", yytext()); }
{CLASS} { return createToken("CLASS", yytext()); }

. { throw new RuntimeException("Caractere inválido " + yytext()); }
