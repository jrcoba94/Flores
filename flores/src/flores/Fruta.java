
package flores;

import java.awt.Graphics;

/**
 *
 * @author Cuytun
 */
public class Fruta extends VentanaEscuchadora implements Runnable {
    String Nombre;
    String Lugar;
    String Descripcion;
    String Imagen;

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getLugar() {
        return Lugar;
    }
    public void setLugar(String Origen) {
        this.Lugar = Origen;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void paintComponent(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
