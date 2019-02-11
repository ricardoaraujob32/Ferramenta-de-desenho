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
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.Quadrado;
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.Retangulo;

/**
 *
 * @author ricardobalduino
 */
public class QuadradoMouseAdapter extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        Ponto p = new Ponto();
        p.setX( e.getX() );
        p.setY( e.getY() );
        
        String aux;
        int lado = 0;
        
        try {
            aux = JOptionPane.showInputDialog(null, "Digite o valor do lado: ", "Lado", JOptionPane.QUESTION_MESSAGE);
            lado = Integer.parseInt(aux);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }        
        
        Quadrado q = new Quadrado();
        q.setCoord(p);
        q.setLado(lado);
        
        PainelDesenho painel = (PainelDesenho) e.getSource();
        painel.addFormaGeometrica(q);
        painel.repaint();
    }  
}
