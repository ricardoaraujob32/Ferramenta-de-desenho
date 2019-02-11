/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.Ponto;
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.Retangulo;

/**
 *
 * @author ricardobalduino
 */
public class RetanguloMouseAdapter extends MouseAdapter {
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Ponto p = new Ponto();
        p.setX( e.getX() );
        p.setY( e.getY() );
        
        String aux;
        int altura = 0, largura = 0;
        
        try {
            aux = JOptionPane.showInputDialog(null, "Digite o valor da altura: ", "Altura", JOptionPane.QUESTION_MESSAGE);
            altura = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog(null, "Digite o valor da largura: ", "Largura", JOptionPane.QUESTION_MESSAGE);
            largura = Integer.parseInt(aux);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }        
        
        Retangulo r = new Retangulo();
        r.setCoord(p);
        r.setAltura(altura);
        r.setLargura(largura);
        
        PainelDesenho painel = (PainelDesenho) e.getSource();
        painel.addFormaGeometrica(r);
        painel.repaint();
    }
}
