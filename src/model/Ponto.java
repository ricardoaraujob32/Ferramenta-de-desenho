/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ricardobalduino
 */
public class Ponto implements Serializable {
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
        this.x = x;
        this.y = y;
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
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
}
