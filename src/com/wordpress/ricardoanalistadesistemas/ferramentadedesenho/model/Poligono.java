/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ricardobalduino
 */
public class Poligono extends FormaBidimensional {
    protected HashSet<Ponto> setPontos;

    public Poligono() {
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
    
    public int getNumLados(){
        return setPontos.size();
    }

    @Override
    public void desenhar(Graphics2D g) {
        Polygon poligono = new Polygon();
        
        setPontos.forEach( (p) -> poligono.addPoint( p.getX(), p.getY() ) );
        
        if (preenchido){
            g.fillPolygon(poligono);
        } else {
            g.drawPolygon(poligono);
        }
    }
}
