/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.Circulo;
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.Ponto;

/**
 *
 * @author ricardobalduino
 */
public class CirculoMouseAdapter extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        Ponto p = new Ponto();
        p.setX( e.getX() );
        p.setY( e.getY() );
        
        String aux;
        int raio = 0;
        
        try {
            aux = JOptionPane.showInputDialog(null, "Digite o valor do raio: ", "Raio", JOptionPane.QUESTION_MESSAGE);
            raio = Integer.parseInt(aux);           
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }        
        
        Circulo c = new Circulo();
        c.setCoord(p);
        c.setRaio(raio);
        
        PainelDesenho painel = (PainelDesenho) e.getSource();
        painel.addFormaGeometrica(c);
        painel.repaint();
    }
    
}
