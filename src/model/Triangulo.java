/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ricardobalduino
 */
public class Triangulo {
    private HashSet<Ponto> setPontos;

    public Triangulo() {
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
}