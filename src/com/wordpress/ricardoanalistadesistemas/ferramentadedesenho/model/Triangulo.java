/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model;

import java.util.Iterator;

/**
 *
 * @author ricardobalduino
 */
public class Triangulo extends Poligono {
    
    /**
     *
     * @param p
     */
    @Override
    public void acrescentar(Ponto p){
        if( setPontos.size() >= 3 ){
            super.acrescentar(p);
        }
    }
    
    public boolean validaTriangulo(){
        Ponto p1, p2, p3;
        int d1, d2, d3;
        Iterator<Ponto> iterator = setPontos.iterator();
        
        p1 = iterator.next();
        p2 = iterator.next();
        p3 = iterator.next();
        
        d1 = calculaDistancia(p1, p2);
        d2 = calculaDistancia(p2, p3);
        d3 = calculaDistancia(p3, p1);
        
        return d1 < d2 + d3 && d2 < d1 + d3 && d3 < d1 + d2;
    }
    
    public int calculaDistancia(Ponto p1, Ponto p2){
        if ( p1.getX() == Math.max( p1.getX(), p2.getX() ) && p1.getY() == Math.max( p1.getY(), p2.getY() ) ){
            Ponto aux = p1;
            p1 = p2;
            p2 = aux;
        }        
        
        if ( p1.equals(p2) ){
            return 0;
        } else if ( p1.getX() == p2.getX() ){
            return p2.getX() - p1.getX();
        } else if ( p1.getY() == p2.getY() ){
            return p2.getY() - p1.getY();
        } else {
            return Math.round( (float) Math.hypot( p2.getX() - p1.getX(), p2.getY() - p1.getY() ) );
        }
    }
}
