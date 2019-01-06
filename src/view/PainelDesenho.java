/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ricardobalduino
 */
public class PainelDesenho extends JPanel implements ChangeListener {
    private Point coordInicial;
    private Point coordFinal;
    private Set<Point> setPontos;
    private Color cor;
    private Stroke tracado;
    private FormaGeometrica forma;
    
    public PainelDesenho() {
        setLayout( new BorderLayout() );
        setBackground(Color.WHITE);
        coordInicial = new Point(-1, -1);
        coordFinal = new Point(-1, -1);
        this.forma = FormaGeometrica.RETA;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (coordInicial.x == -1 && coordInicial.y == -1){
                    coordInicial.setLocation( e.getPoint() );
                } else {
                    coordFinal.setLocation( e.getPoint() );
                    
                    repaint();
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        desenhar(g);                
    }
    
    public void setFormaGeometrica(FormaGeometrica f){
        forma = f;
    }
    
    public void desenhar(Graphics g){        
        Graphics2D g2d = (Graphics2D) g;
        
        g.setColor(Color.BLACK);
        
        switch (forma){
            case RETA:
                g.drawLine( coordInicial.x, coordInicial.y, coordFinal.x, coordFinal.y);
            break;

            case RETANGULO:
                g.drawRect(coordInicial.x, coordInicial.y, 20, 10);
            break;

            case CIRCULO:
                g.drawOval(coordInicial.x, coordInicial.y, 10, 10);
            break;
        }        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JRadioButtonMenuItem source = (JRadioButtonMenuItem) e.getSource();
        
        if ( "Reta".equals( source.getName() ) ){
            forma = FormaGeometrica.RETA;
        } else if ( "Retangulo".equals( source.getName() ) ){
            forma = FormaGeometrica.RETANGULO;
        } else if ( "Circulo".equals( source.getName() ) ){
            forma = FormaGeometrica.CIRCULO;
        }
    }

    /**
     * @return the cor
     */
    public Color getCor() {
        return cor;
    }

    /**
     * @return the tracado
     */
    public Stroke getTracado() {
        return tracado;
    }

    /**
     * @return the forma
     */
    public FormaGeometrica getFormaGeometrica() {
        return forma;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(Color cor) {
        this.cor = cor;
    }

    /**
     * @param tracado the tracado to set
     */
    public void setTracado(Stroke tracado) {
        this.tracado = tracado;
    }
    
}
