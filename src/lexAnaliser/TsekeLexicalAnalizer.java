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
import lexAnaliser.LexicalAnalyzer;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;


public class TsekeLexicalAnalizer {
    public static void main(String[] args) throws IOException {
        String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/tseke/";

        String sourceCode = rootPath + subPath + "Programa.tseke";

        LexicalAnalyzer lexical = new LexicalAnalyzer(new FileReader(sourceCode));

        TsekeToken token;

        while ((token = lexical.yylex()) != null) {
            System.out.println("<" + token.name + ", " + token.value + "> (" + token.line + " - " + token.column + ")");
        }


    }

}
