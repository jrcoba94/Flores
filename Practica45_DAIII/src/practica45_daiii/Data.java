/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica45_daiii;

import static com.sun.glass.ui.Cursor.setVisible;
import practica45_daiii.DataContent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.awt.Graphics;

/**
 *
 * @author SAMSUNG
 */
public class Data extends DGeneral {

    JLabel nombreC;
    JLabel nombreCo;
    JTextArea taxonomia;
    JLabel origen;
    JTextArea descripcio;
    JLabel Espacio;
    JLabel imagen;
    JButton btnAceptar;

    public Data(String nomC, String nomCo, String ori, String tax, String des, String Ima) {
        titulo = "FRUTAS Y FLORES";
        super.setTitulo(titulo);
        super.getTitulo();
        super.setTamano(540, 750);
        setBackground(Color.WHITE);
        setLocation(150,20);
        setLayout(null);
//(POSX,POY,ANCHO,ALTO)
        imagen = new JLabel(new ImageIcon(Ima));
        imagen.setBounds(160, -80, 200, 300);

        nombreC = new JLabel(nomC);
        nombreC.setFont(new Font("Times New Roman", Font.BOLD, 14));
        nombreC.setForeground(Color.BLACK);
        nombreC.setBounds(20, 130, 300, 30);

        nombreCo = new JLabel(nomCo);
        nombreCo.setFont(new Font("Times New Roman", Font.BOLD, 14));
        nombreCo.setForeground(Color.BLACK);
        nombreCo.setBounds(20, 160, 300, 30);

        origen = new JLabel(ori);
        origen.setFont(new Font("Times New Roman", Font.BOLD, 16));
        origen.setForeground(Color.black);
        origen.setBounds(20, 190, 400, 30);

        taxonomia = new JTextArea(tax);
        taxonomia.setFont(new Font("Times New Roman", Font.BOLD, 14));
        taxonomia.setForeground(Color.BLACK);
        taxonomia.setBounds(20, 230, 300, 170);

        descripcio = new JTextArea(des);
        descripcio.enable(true);
        descripcio.setFont(new Font("Times New Roman", Font.BOLD, 14));
        descripcio.setForeground(Color.black);
        descripcio.setBounds(20, 440, 510, 170);

        btnAceptar = new JButton("Volver");
        btnAceptar.setBounds(200, 660, 150, 20);

        Espacio = new JLabel("");
        Espacio.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Espacio.setForeground(Color.WHITE);
        Espacio.setBounds(50, 730, 20, 500);

        add(imagen);
        add(nombreC);
        add(nombreCo);
        add(origen);
        add(taxonomia);
        add(descripcio);
        add(btnAceptar);
        add(Espacio);

        setVisible(true);
        setResizable(false);
        btnAceptar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Volver")) {
            this.hide();
        }

    }
}
