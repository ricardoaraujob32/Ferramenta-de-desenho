/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.Ponto;
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.Reta;

/**
 *
 * @author ricardobalduino
 */
public class RetaMouseAdapter extends MouseAdapter {
    private Ponto p1;
    private Ponto p2;

    public RetaMouseAdapter() {
        p1 = new Ponto(-1, -1);
        p2 = new Ponto(-1, -1);
    }  
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if ( p1.getX() == -1 && p1.getY() == -1 ){
            p1.setX( e.getX() );
            p1.setY( e.getY() );
        } else {
            p2.setX( e.getX() );
            p2.setY( e.getY() );
            
            Reta r = new Reta();
            r.setCoordInicial(p1);
            r.setCoordFinal(p2);
            
            PainelDesenho painel = (PainelDesenho) e.getSource();
            painel.addFormaGeometrica(r);
            painel.repaint();
            limparPontos();
        }
    }

    private void limparPontos(){
        p1.setX(-1);
        p1.setY(-1);
        p2.setX(-1);
        p2.setY(-1);
    }
}
