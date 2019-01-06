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
public class Elipse implements Serializable {
    private Ponto coord;
    private int eixoHorizontal;
    private int eixoVertical;

    /**
     *
     */
    public Elipse() {
        coord = new Ponto();
        eixoHorizontal = 0;
        eixoVertical = 0;
    }

    /**
     * @return the coord
     */
    public Ponto getCoord() {
        return coord;
    }

    /**
     * @return the eixoHorizontal
     */
    public int getEixoHorizontal() {
        return eixoHorizontal;
    }

    /**
     * @return the eixoVertical
     */
    public int getEixoVertical() {
        return eixoVertical;
    }

    /**
     * @param coord the coord to set
     */
    public void setCoord(Ponto coord) {
        this.coord = coord;
    }

    /**
     * @param eixoHorizontal the eixoHorizontal to set
     */
    public void setEixoHorizontal(int eixoHorizontal) {
        this.eixoHorizontal = eixoHorizontal;
    }

    /**
     * @param eixoVertical the eixoVertical to set
     */
    public void setEixoVertical(int eixoVertical) {
        this.eixoVertical = eixoVertical;
    }
    
    
}
