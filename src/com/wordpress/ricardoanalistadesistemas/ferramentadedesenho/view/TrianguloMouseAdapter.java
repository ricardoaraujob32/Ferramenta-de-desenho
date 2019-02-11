/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.Ponto;

/**
 *
 * @author ricardobalduino
 */
public class TrianguloMouseAdapter extends MouseAdapter {
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;

    public TrianguloMouseAdapter() {
        p1 = new Ponto(-1, -1);
        p2 = new Ponto(-1, -1);
        p3 = new Ponto(-1, -1);
    }   
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if ( p1.getX() == -1 && p1.getY() == -1){
            p1.setX( e.getX() );
            p1.setY( e.getY() );
        } else if ( p2.getX() == -1 && p2.getY() == -1 ){
            p2.setX( e.getX() );
            p2.setY( e.getY() );
        } else {
            p3.setX( e.getX() );
            p3.setY( e.getY() );
        }
    }
    
}
