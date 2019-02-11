/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model;

import java.awt.Graphics2D;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ricardobalduino
 */
public class Polilinha implements Serializable, FormaGeometrica {
    private HashSet<Ponto> setPontos;

    public Polilinha() {
        setPontos = new HashSet<>();
    }
    
    public void acrescentar(Ponto p){
        setPontos.add(p);
    }
    
    public void remover(Ponto p){
        setPontos.remove(p);
    }
    
    public Set<Ponto> getPontos(){
        return setPontos;
    }

    @Override
    public void desenhar(Graphics2D g) {
        int tam = setPontos.size();
        int[] x = new int[tam];
        int[] y = new int[tam];
        Ponto[] p = ( Ponto[] ) setPontos.toArray();
        
        for (int i = 0; i < p.length; i++) {
            x[i] = p[i].getX();
            y[i] = p[i].getY();            
        }
        
        g.drawPolyline(x, y, tam);
    }
}
