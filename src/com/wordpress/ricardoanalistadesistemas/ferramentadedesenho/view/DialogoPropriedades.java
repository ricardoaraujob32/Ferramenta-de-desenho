/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ricardobalduino
 */
public class DialogoPropriedades extends JDialog implements ActionListener {
    private Color cor1;
    private Color cor2;    
    private JTextField txtCor1;
    private JTextField txtCor2;
    private boolean temDuasCores;
    private JCheckBox ckbxTemDuasCores;
    
    
    public DialogoPropriedades(JFrame frame) {
        super(frame);
        setTitle("Configurar opções de desenho");
        setModal(true);
        temDuasCores = false;
        
        Container container = getContentPane();
        container.setLayout( new BorderLayout() );
        
        JPanel painelNorte = new JPanel( new FlowLayout(FlowLayout.LEFT) );
        txtCor1 = new JTextField(15);
        JButton btnCor1 = new JButton("Escolher cor");
        ckbxTemDuasCores = new JCheckBox("Tem 2 cores");
        txtCor2 = new JTextField(15);
        JButton btnCor2 = new JButton("Escolher cor");
        
        txtCor1.setEditable(false);
        txtCor2.setEditable(false);
        txtCor2.setEnabled(false);
        btnCor1.addActionListener(this);
        btnCor1.setActionCommand("cor1");
        btnCor2.addActionListener(this);
        btnCor2.setActionCommand("cor2");
        btnCor2.setEnabled(false);
        ckbxTemDuasCores.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JCheckBox source = (JCheckBox) e.getSource();
                temDuasCores = source.isSelected();
                
                if ( source.isSelected() ){
                    txtCor2.setEnabled(true);
                    btnCor2.setEnabled(true);
                } else {
                    txtCor2.setEnabled(false);
                    btnCor2.setEnabled(false);
                }
            }
        });
        
        painelNorte.add(txtCor1);
        painelNorte.add(btnCor1);
        painelNorte.add(ckbxTemDuasCores);
        painelNorte.add(txtCor2);
        painelNorte.add(btnCor2);
        
        TitledBorder borda = BorderFactory.createTitledBorder("Cores");
        borda.setTitleJustification(TitledBorder.CENTER);
        borda.setTitlePosition(TitledBorder.CENTER);
        
        painelNorte.setBorder(borda);
        container.add(painelNorte, BorderLayout.NORTH);
        
        JPanel painelCentro = new JPanel( new BorderLayout() );
        
        setSize(700, 300);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if ( "cor1".equals(cmd) ){
            cor1 = JColorChooser.showDialog(this, "Escolha uma cor", Color.BLACK);
            
            if (cor1 == null){
                cor1 = Color.BLACK;
            }
            
            txtCor1.setText( String.format("(%s,%s,%s)", cor1.getRed(), cor1.getGreen(), cor1.getBlue() ) );
        } else if ( "cor2".equals(cmd) ){
            cor2 = JColorChooser.showDialog(this, "Escolha uma cor", Color.BLACK);
            
            if (cor2 == null){
                cor2 = Color.WHITE;
            }
            
            txtCor2.setText( String.format("(%s,%s,%s)", cor2.getRed(), cor2.getGreen(), cor2.getBlue() ) );
            temDuasCores = true;
        } else if ( "OK".equals(cmd) ){
            if ( temDuasCores && ckbxTemDuasCores.isSelected() ){
                GradientPaint paint = new GradientPaint(0, 0, cor1, 0, 0, cor2, temDuasCores);
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        new DialogoPropriedades(null);
    }
    
}
