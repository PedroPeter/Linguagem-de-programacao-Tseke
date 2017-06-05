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

public class Editor {
  private javax.swing.JFrame janela;
  private TsekeLexer lexer;
  private String source;
  private CommonTokenStream tokens;
  private CharStream stream;
  private TsekeParser parser;

  public Editor() {
      this.janela = new javax.swing.JFrame("Tseke Editor");
  }

  public void prepararJanela() {
    this.janela.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    this.janela.pack();
    this.janela.setSize(800, 600);


    javax.swing.JPanel painel = new javax.swing.JPanel(new java.awt.BorderLayout());
    javax.swing.JButton b = new javax.swing.JButton("Compilar");
    final javax.swing.JTextArea t = new javax.swing.JTextArea(20, 10);
    t.setTabSize(2);
    t.setLineWrap(true);
    t.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));
    java.awt.Font font = new java.awt.Font(java.awt.Font.MONOSPACED, java.awt.Font.PLAIN, 16);
    t.setFont(font);
    javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(t);
    //scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

    final javax.swing.JTextArea t2 = new javax.swing.JTextArea(10, 10);
    t2.setTabSize(2);
    t2.setLineWrap(true);
    t2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));
    t2.setFont(font);
    javax.swing.JScrollPane scroll2 = new javax.swing.JScrollPane(t2);
    //scroll2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String source = t.getText();
        try {
          stream = new ANTLRInputStream(new ByteArrayInputStream(source.getBytes()));
          lexer = new TsekeLexer(stream);
          tokens = new CommonTokenStream(lexer);
          parser = new TsekeParser(tokens);
          System.out.println("\n\n================ Tseke ================\n\n");

          ParseTree tree = parser.programa();
          int nErros = parser.getNumberOfSyntaxErrors();
          if (nErros == 0) {
            System.out.println("Nenhum erro econtrado");
          } else if (nErros == 1) {
            System.out.println(String.format("[%s] Erro encontrado", nErros));
          } else {
            System.out.println(String.format("[%s] Erros encontrado", nErros));
          }

          System.out.println("\n\n=========================================\n\n");

        } catch (Exception a) {

        }
      }

    });
    painel.add(b, java.awt.BorderLayout.SOUTH);
    painel.add(scroll, java.awt.BorderLayout.NORTH);
    painel.add(scroll2, java.awt.BorderLayout.CENTER);

    this.janela.add(painel);

    this.janela.setVisible(true);
  }

  public static void main(String[] args) {
    Editor e = new Editor();
    e.prepararJanela();
  }
}
