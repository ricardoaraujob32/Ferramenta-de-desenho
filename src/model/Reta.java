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
public class Reta implements Serializable {
    private Ponto coordInicial;
    private Ponto coordFinal;

    public Reta() {
        coordInicial = new Ponto();
        coordFinal = new Ponto();
    }

    /**
     * @return the coordInicial
     */
    public Ponto getCoordInicial() {
        return coordInicial;
    }

    /**
     * @return the coordFinal
     */
    public Ponto getCoordFinal() {
        return coordFinal;
    }

    /**
     * @param coordInicial the coordInicial to set
     */
    public void setCoordInicial(Ponto coordInicial) {
        this.coordInicial = coordInicial;
    }

    /**
     * @param coordFinal the coordFinal to set
     */
    public void setCoordFinal(Ponto coordFinal) {
        this.coordFinal = coordFinal;
    }
    
    
    
}
