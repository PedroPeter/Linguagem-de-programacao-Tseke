/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.johnidouglas.lexicalanalyzer;

/**
 *
 * @author Pedro Peter
 */
import br.com.johnidouglas.lexicalanalyzer.LexicalAnalyzer;
import java.io.IOException;
import java.io.StringReader;
public class LanguageSextaFase {
    public static void main(String[] args) throws IOException {
        String expr = "if 2 + 3+a then";
        LexicalAnalyzer lexical = new LexicalAnalyzer(new StringReader(expr));
        lexical.yylex();

    }

}
