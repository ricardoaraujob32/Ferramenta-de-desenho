/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model;

import java.io.Serializable;
import java.util.HashSet;

/**
 *
 * @author ricardobalduino
 */
public class Trapezio implements Serializable {
    private Reta retaInferior;
    private Reta retaSuperior;
    private HashSet<Ponto> setPontos;
    
    public Trapezio() {
        retaInferior = new Reta();
        retaSuperior = new Reta();
        setPontos = new HashSet<>();
    }
    
    public void acrescentar(Ponto p){
        
    }
    
    
}
