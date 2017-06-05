/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaticAnaliser;

import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;

/**
 *
 * @author Pedro Peter
 */
public class Main {

    private TsekeLexer lexer;
    private String source;
    private CommonTokenStream tokens;
    private CharStream stream;
    private TsekeParser parser;

    public Main(String source) throws IOException {
        stream = new ANTLRInputStream(new ByteArrayInputStream(source.getBytes()));
        lexer = new TsekeLexer(stream);
        tokens = new CommonTokenStream(lexer);
        parser = new TsekeParser(tokens);
        parser.programa();
    }

    public static void man(String [] args) throws IOException{
     Main m=new Main(args[0]);
    }

}
