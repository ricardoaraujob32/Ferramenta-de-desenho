/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model;

import java.awt.Graphics2D;
import java.io.Serializable;

/**
 *
 * @author ricardobalduino
 */
public class Quadrado extends FormaBidimensional implements Serializable {
    private Ponto coord;
    private int lado;

    public Quadrado() {
        coord = new Ponto();
        lado = 0;
    }

    /**
     * @return the coord
     */
    public Ponto getCoord() {
        return coord;
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param coord the coord to set
     */
    public void setCoord(Ponto coord) {
        this.coord = coord;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void desenhar(Graphics2D g) {
        if (preenchido){
            g.fillRect(coord.getX(), coord.getY(), lado, lado);
        } else {
            g.drawRect(coord.getX(), coord.getY(), lado, lado);
        }
    }   
}
