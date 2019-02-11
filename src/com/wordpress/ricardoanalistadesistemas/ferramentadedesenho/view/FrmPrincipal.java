/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author ricardobalduino
 */
public class FrmPrincipal extends JFrame implements ActionListener {
    private PainelDesenho painel;

    public FrmPrincipal() throws HeadlessException {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem menuNovo = new JMenuItem("Novo");
        JMenuItem menuAbrir = new JMenuItem("Abrir");
        JMenuItem menuSalvar = new JMenuItem("Salvar");
        JMenuItem menuExcluir = new JMenuItem("Excluir");
        JMenu menuFormas = new JMenu("Formas");
        JRadioButtonMenuItem rdReta = new JRadioButtonMenuItem("Reta");
        JRadioButtonMenuItem rdRetangulo = new JRadioButtonMenuItem("Retângulo");
        JRadioButtonMenuItem rdCirculo = new JRadioButtonMenuItem("Círculo");
        ButtonGroup grupo = new ButtonGroup();
        JMenu menuDesenho = new JMenu("Desenho");
        JMenuItem menuPropriedades = new JMenuItem("Propriedades");
         
        menuNovo.addActionListener(this);
        menuNovo.setName("Novo");
        menuArquivo.add(menuNovo);
        
        menuAbrir.addActionListener(this);
        menuAbrir.setName("Abrir");
        menuArquivo.add(menuAbrir);
        
        menuSalvar.addActionListener(this);
        menuSalvar.setName("Salvar");
        menuArquivo.add(menuSalvar);       
        
        menuExcluir.addActionListener(this);
        menuExcluir.setName("Excluir");
        menuArquivo.add(menuExcluir);
        
        rdReta.addChangeListener(painel);
        rdReta.setName("Reta");
        grupo.add(rdReta);
        grupo.setSelected( rdReta.getModel(), true);
        menuFormas.add(rdReta);
        
        rdRetangulo.addChangeListener(painel);
        rdRetangulo.setName("Retangulo");
        grupo.add(rdRetangulo);
        menuFormas.add(rdRetangulo);
        
        rdCirculo.addChangeListener(painel);
        rdCirculo.setName("Circulo");
        grupo.add(rdCirculo);
        menuFormas.add(rdCirculo);
        
        menuPropriedades.addActionListener(this);
        menuPropriedades.setName("Propriedades");
        menuDesenho.add(menuPropriedades);
        
        menuBar.add(menuArquivo);
        menuBar.add(menuFormas);
        menuBar.add(menuDesenho);
        setJMenuBar(menuBar);
        
        painel = new PainelDesenho();        
        Container container = getContentPane();
        container.add(painel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if ( "Novo".equals(cmd) ){
            
        } else if ( "Abrir".equals(cmd) ){
            
        } else if ( "Salvar".equals(cmd) ){
            
        } else if ( "Excluir".equals(cmd) ){
            
        } else if ( "Propriedades".equals(cmd) ){
            
        }
        
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipal();
            }
        });
    }
}
