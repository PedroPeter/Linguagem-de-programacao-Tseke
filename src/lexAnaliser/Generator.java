/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexAnaliser;
import java.io.File;
import java.nio.file.Paths;
/**
 *
 * @author Pedro Peter
 */
public class Generator {
    public static void main(String[] args) {

        String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/lexAnaliser/";
        String file = rootPath + subPath + "language.lex";
        File sourceCode = new File(file);
        jflex.Main.generate(sourceCode);
    }

}
