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
public class Ponto implements FormaGeometrica, Serializable {
    private int x;
    private int y;

    /**
     *
     */
    public Ponto() {
        x = 0;
        y = 0;
    }

    /**
     *
     * @param x
     * @param y
     */
    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }
    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        if (x < 0){
            
        }
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void desenhar(Graphics2D g) {
        g.drawLine(x, y, x, y);
    }
}
