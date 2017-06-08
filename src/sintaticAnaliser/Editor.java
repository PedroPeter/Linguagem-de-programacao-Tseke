/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaticAnaliser;

/**
 *
 * @author Pedro Peter
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import acessorios.TextLineNumber;

public class Editor {

    private javax.swing.JFrame janela;
    private TsekeLexer lexer;
    private String source;
    private CommonTokenStream tokens;
    private CharStream stream;
    private TsekeParser parser;
    final javax.swing.JTextArea t = new javax.swing.JTextArea(20, 10);
    final javax.swing.JTextArea t2 = new javax.swing.JTextArea(10, 10);
    public Editor() {
        this.janela = new javax.swing.JFrame("Tseke Editor");
    }

    public void prepararJanela() {
        this.janela.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.janela.pack();
        this.janela.setSize(800, 600);

        javax.swing.JPanel painel = new javax.swing.JPanel(new java.awt.BorderLayout());
        javax.swing.JButton b = new javax.swing.JButton("Compilar");
        b.setBackground(Color.green);
        t.setTabSize(2);
        t.setLineWrap(true);
        t.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));
        java.awt.Font font = new java.awt.Font(java.awt.Font.MONOSPACED, java.awt.Font.PLAIN, 16);
        t.setFont(font);
        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(t);
        scroll.setRowHeaderView(new TextLineNumber(t));
        scroll.setBackground(Color.red);

        //scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        t2.setTabSize(2);
        t2.setLineWrap(true);
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));
        t2.setFont(font);
        javax.swing.JScrollPane scroll2 = new javax.swing.JScrollPane(t2);
        //scroll2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                compilar();
            }
        });

        painel.add(b, java.awt.BorderLayout.SOUTH);
        painel.add(scroll, java.awt.BorderLayout.NORTH);
        painel.add(scroll2, java.awt.BorderLayout.CENTER);

        this.janela.add(painel);

        this.janela.setVisible(true);
    }

    public void compilar() {
        String source = this.t.getText();
        try {

            stream = new ANTLRInputStream(new ByteArrayInputStream(source.getBytes()));
            lexer = new TsekeLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
            tokens = new CommonTokenStream(lexer);
            parser = new TsekeParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(DescriptiveErrorListener.INSTANCE);
            System.out.println("\n\n================ Tseke ================\n\n");
            ParseTree tree = parser.program();
            String descricErros = "";
            ArrayList<String> listaErros = DescriptiveErrorListener.erros;
            for (String iter : listaErros) {
                descricErros += iter + "\n";
            }
            int nErros = parser.getNumberOfSyntaxErrors();
            String relatErros;

            if (nErros == 0) {
                relatErros = "==== Compilação concluída com sucesso===\n";
                t2.setBackground(Color.green);

            } else {
                relatErros = "==== Compilação concluída ===\n";
                t2.setBackground(Color.yellow);
                String contadorDeErros;
                if (nErros == 1) {
                    relatErros = nErros + " erro encontrado\n";

                } else {
                    relatErros = nErros + " erros encontrados\n";
                }

            }

            relatErros += String.format(descricErros) + "\n=========================================\n\n";
            t2.setText(relatErros);

        } catch (Exception a) {

        }
    }

    public static void main(String[] args) {
        Editor e = new Editor();
        e.prepararJanela();
    }
}
