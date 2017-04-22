package tseke;
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
SOMA = "+"
INTEIRO = 0|[1-9][0-9]*
ID = @[_|a-z|A-Z][a-z|A-Z|0-9|_]*

%%

"if"                         { { return createToken("Palavra reservada if", yytext()); } }
"then"                       { { return createToken("Palavra reservada then", yytext()); } }
{BRANCO}                     { { return createToken("Especo em branco", yytext()); } }
{SOMA}                         {{ return createToken("Operador de soma", yytext()); } }
{INTEIRO}                     { return createToken("inteiro", yytext()); }
{BRANCO} { /**/ }

. { throw new RuntimeException("Caractere inválido " + yytext()); }
