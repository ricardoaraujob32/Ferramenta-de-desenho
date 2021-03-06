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
public class Retangulo extends FormaBidimensional {
    private Ponto coord;
    private int largura;
    private int altura;

    public Retangulo() {
        coord = new Ponto();
        largura = 0;
        altura = 0;
    }

    /**
     * @return the coord
     */
    public Ponto getCoord() {
        return coord;
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param coord the coord to set
     */
    public void setCoord(Ponto coord) {
        this.coord = coord;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void desenhar(Graphics2D g) {
        if (preenchido){
            g.fillRect(coord.getX(), coord.getY(), largura, altura);
        } else {
            g.drawRect(coord.getX(), coord.getY(), largura, altura);
        }
    }
}
