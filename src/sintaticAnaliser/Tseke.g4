
grammar TSeke;

program: PUBLIC CLASS ID OPEN_BRACKET content* CLOSE_BRACKET;
content: declaracao|inicializacao|decisao|impressao|soma;
declaracao:;
inicializacao:;
decisao: IF (boolean){inst}|IF(boolean){inst}ELSE{inst};
boolean:;                                                   #gramatica para conficao do if
inst:declaracao|inicializacao|decisao|soma|decisao|inst;    #gramatica para uma instrucao                                                  
impressao:;                                                 #gramatica para impressao
soma:;                                                      #gramatica para soma
