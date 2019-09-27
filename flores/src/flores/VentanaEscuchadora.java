package flores;

import java.awt.event.*;
import java.awt.*;

public class VentanaEscuchadora extends Frame implements ActionListener, WindowListener {

    int x, y;
    Color c;
    int ancho, alto;
    String titulo;

    public VentanaEscuchadora() {
        ancho = alto = 500;
        x = y = 200;
        c = new Color(0, 0, 0);
        setLocation(x, y);
        setBackground(c);
        addWindowListener(this);
    }

    public void setTitulo(String t) {

        titulo = (t != null && !t.equals("")) ? t : "";
        setTitle(titulo);

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

    public String getTitulo() {
        return titulo;
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void windowClosing(WindowEvent e) {
        System.err.print("Cerrando Aplicacion");
        System.exit(0);
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
        System.out.print("Software:Cuytun");
    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowOpened(WindowEvent e) {
    }

}
