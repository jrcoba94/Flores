/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica45_daiii;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author SAMSUNG
 */
public class VentanaEscuchadora extends Frame implements ActionListener, WindowListener {

    int x, y;
    Color c;
    int ancho, alto;
    String titulo;

//--------------------------------------------------------------------------
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = (titulo != null && !titulo.equals("")) ? titulo : "";
        setTitle(this.titulo);
    }

//------------------------------------------------------------
    public VentanaEscuchadora() {
        ancho = alto = 300;
        x = y = 200;
        c = new Color(0, 0, 0);
        setLocation(x, y);
        setBackground(c);
        addWindowListener(this);
    }

    public void setTamano(int x, int y) {
        ancho = x;
        alto = y;
        setSize(ancho, alto);
    }

    public void setLocalizacion(int cx, int cy) {
        x = cx;
        y = cy;
        setLocation(x, y);
    }
//------------------------------------------------------------    

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.err.print("Closing Aplication ...");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.print("JoseChac");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void paintComponent(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
