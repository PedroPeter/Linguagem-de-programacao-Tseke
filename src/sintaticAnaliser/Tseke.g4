
grammar Tseke;

program: PUBLIC CLASS ID ABRIR_CHAVETA content* FECHAR_CHAVETA;
content: declaracao|inicializacao|decisao|impressao|operacoesArt;
declaracao:TIPO ID;                                                  

inicializacao:ID = VAL;                                              
                                                                                                  
decisao: IF (boolean){inst}|IF(boolean){inst}ELSE{inst};
boolean:;                                                               
inst:declaracao|inicializacao|decisao|soma|decisao;                                                               
impressao:PRINT ABRIR_PARENTESES ID FECHAR_PARENTESES;        
soma:ID SOMA soma|ID SOMA ID|ID;                                                             
subtracao:ID MENUS ID;                                                        
divisao:ID DIV ID;                                                          
multiplicacao:ID MULT ID;                                                     
operacoesArt: soma|subtracao|divisao|multiplicacao;

PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED:  'protected';
CLASS :  'class';
PACKAGE:  'package';
IMPORT : 'import';
MENUS : '-';
MODIFICADOR_ACESSO :'public|private|protected';
TIPO : 'integer|byte|float';
PRINT: 'System.out.print';
ABRIR_CHAVETA : '{';
FECHAR_CHAVETA :  '}';
ABRIR_PARENTESES :  '(';
FECHAR_PARENTESES :  ')';
PONTO_VIRGULA : ';';
VIRGULA :  ',';
SOMA : '+';
MULT:   '/';
SUBTRACAO : '-';
DIVISAO : '/';
MULTIPLICACAO : '*';
INTEIRO : [0]|[1-9][0-9]*;
ID :  [_|a-z|A-Z][a-z|A-Z|0-9|_]*;
FLOAT :  [-+]?[0-9]*.?[0-9]+([eE][-+]?[0-9]+)?;
BRANCO : [\n| |\t|\r];
PACOTE : (([a-z]+).)*[a-z]+;
