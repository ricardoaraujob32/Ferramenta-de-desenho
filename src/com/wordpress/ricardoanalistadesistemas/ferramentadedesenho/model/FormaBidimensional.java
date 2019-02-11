/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model;

import java.io.Serializable;

/**
 *
 * @author ricardobalduino
 */
public abstract class FormaBidimensional implements FormaGeometrica, Serializable {
    protected boolean preenchido;

    /**
     * @return the preenchido
     */
    public boolean isPreenchido() {
        return preenchido;
    }

    /**
     * @param preenchido the preenchido to set
     */
    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }
    
    
}
