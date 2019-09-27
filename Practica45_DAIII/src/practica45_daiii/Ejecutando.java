/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica45_daiii;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author SAMSUNG
 */
public class Ejecutando extends VentanaEscuchadora implements Runnable {

    

    public Ejecutando(String op) {

        if (op == "Frutas") {
            new DataContent();
        }
    }

    public void run() {

    }
}
