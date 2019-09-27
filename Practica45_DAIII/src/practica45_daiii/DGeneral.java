/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica45_daiii;
import java.awt.Graphics;
/**
 *
 * @author SAMSUNG
 */
public class DGeneral extends VentanaEscuchadora implements Runnable{
    
    String img;
    String nombreC;
    String nombreCo;
    String taxonomia;
    String origen;
    String description;
    
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNombreCo() {
        return nombreCo;
    }

    public void setNombreCo(String nombreCo) {
        this.nombreCo = nombreCo;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public void setTaxonomia(String taxonomia) {
        this.taxonomia = taxonomia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
