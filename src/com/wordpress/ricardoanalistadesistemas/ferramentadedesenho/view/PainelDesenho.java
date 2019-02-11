/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.view;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import com.wordpress.ricardoanalistadesistemas.ferramentadedesenho.model.FormaGeometrica;

/**
 *
 * @author ricardobalduino
 */
public class PainelDesenho extends JPanel implements ChangeListener {
    private Point coordInicial;
    private Point coordFinal;
    private Set<Point> setPontos;
    private GradientPaint textura;
    private Stroke tracado;
    private Font fonte;
    private ArrayList<FormaGeometrica> listaFormas;
    private MouseAdapter mouseAdapter;
    
    public PainelDesenho() {
        setLayout( new BorderLayout() );
        setBackground(Color.WHITE);
        coordInicial = new Point();
        coordFinal = new Point();
        listaFormas = new ArrayList<>();
        textura = new GradientPaint(0, 0, Color.BLACK, 0, 0, Color.BLACK, true);
        tracado = new BasicStroke(5.0f);
        mouseAdapter = new RetaMouseAdapter();
        addMouseListener(mouseAdapter);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setPaint(textura);
        g2d.setStroke(tracado);
        g2d.setFont(fonte);
        
        ListIterator<FormaGeometrica> iterator = listaFormas.listIterator();
        
        while ( iterator.hasNext() ) {
            iterator.next().desenhar(g2d);            
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JRadioButtonMenuItem source = (JRadioButtonMenuItem) e.getSource();
        
        if ( "Reta".equals( source.getName() ) ){
            mouseAdapter = new RetaMouseAdapter();
        } else if ( "Retangulo".equals( source.getName() ) ){
            mouseAdapter = new RetanguloMouseAdapter();
        } else if ( "Circulo".equals( source.getName() ) ){
            mouseAdapter = new CirculoMouseAdapter();
        } else if ( "Triangulo".equals( source.getName() ) ){
            mouseAdapter = new TrianguloMouseAdapter();
        } else if ( "Quadrado".equals( source.getName() ) ){
            mouseAdapter = new QuadradoMouseAdapter();
        }
    }

    /**
     * @return the textura
     */
    public GradientPaint getTextura() {
        return textura;
    }

    /**
     * @return the tracado
     */
    public Stroke getTracado() {
        return tracado;
    }

    /**
     * @param textura the textura to set
     */
    public void setTextura(GradientPaint textura) {
        this.textura = textura;
    }

    /**
     * @param tracado the tracado to set
     */
    public void setTracado(Stroke tracado) {
        this.tracado = tracado;
    }

    void addFormaGeometrica(FormaGeometrica f) {
        listaFormas.add(f);
    }
    
}
