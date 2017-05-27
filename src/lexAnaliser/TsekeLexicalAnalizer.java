/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexAnaliser;

/**
 *
 * @author Pedro Peter
 */
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;


public class TsekeLexicalAnalizer {
    public static void main(String[] args) throws IOException {
        String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/lexAnaliser/";

        String sourceCode = rootPath + subPath + "Programa.tseke";

        LexicalAnalyzer lexical = new LexicalAnalyzer(new FileReader(sourceCode));

        TsekeToken token;
        System.out.print("Nome do token \n Seu valor \n Sua Linha \n Sua coluna");
        while ((token = lexical.yylex()) != null) {
            System.out.println( token.name + "\t" + token.value + "\t" + token.line + "\t" + token.column);
        }


    }

}
