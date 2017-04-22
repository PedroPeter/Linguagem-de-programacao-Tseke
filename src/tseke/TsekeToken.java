/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tseke;

/**
 *
 * @author Pedro Peter
 */
public class TsekeToken {
    public String name;
    public String value;
    public Integer line;
    public Integer column;

    public TsekeToken(String name, String value, Integer line, Integer column) {
        this.name = name;
        this.value = value;
        this.line = line;
        this.column = column;
    }

}
