/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model;

import java.awt.Graphics2D;

/**
 * 
 * @author ricardobalduino
 */
public class Circulo extends FormaBidimensional {
    private Ponto coord;
    private int raio;

    public Circulo() {
        coord =  new Ponto();
        raio = 0;
    }

    /**
     * @return the coord
     */
    public Ponto getCoord() {
        return coord;
    }

    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param coord the coord to set
     */
    public void setCoord(Ponto coord) {
        this.coord = coord;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }   

    @Override
    public void desenhar(Graphics2D g) {
        if (preenchido){
            g.fillOval(coord.getX(), coord.getY(), raio, raio);
        } else {
            g.drawOval(coord.getX(), coord.getY(), raio, raio);
        }
    }
    
}
