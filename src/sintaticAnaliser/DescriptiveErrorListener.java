/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaticAnaliser;
import java.util.ArrayList;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;

/**
 *
 *
 * @author samsara
 */
public class DescriptiveErrorListener extends BaseErrorListener {
    
     public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();
     public static ArrayList<String> erros = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
              
        String MsgErro = "Linha "+line+":"+charPositionInLine + " "+msg;
       erros.add(MsgErro);
       System.err.println(MsgErro);
    }
    
}