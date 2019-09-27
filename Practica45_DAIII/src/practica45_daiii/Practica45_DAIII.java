/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica45_daiii;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author SAMSUNG
 */
public class Practica45_DAIII extends VentanaEscuchadora {

    /**
     * @param args the command line arguments
     */
    JLabel lblFiguras;
    JLabel lbl1;
    JComboBox combo;
    JButton btnComenzar;
    Color c;
    private NaveE NE = new NaveE();
    private JFrame f = new JFrame();

    public Practica45_DAIII() {
        titulo = "Menu de Opciones";
        super.setTitulo(titulo);
        super.getTitulo();
        super.setTamano(320, 187);
        setBackground(Color.WHITE);
        setResizable(false);
        setLayout(null);

        lblFiguras = new JLabel("Practicas 5");
        lblFiguras.setFont(new Font("Arial", Font.BOLD, 23));
        lblFiguras.setForeground(c.BLACK);
        lblFiguras.setBounds(75, 40, 200, 20);

        lbl1 = new JLabel("Seleccione una opcion :");
        lbl1.setForeground(c.BLACK);
        lbl1.setFont(new Font("Arial", Font.BOLD, 15));
        lbl1.setBounds(70, 80, 200, 20);

        combo = new JComboBox();
        combo.setBounds(50, 120, 110, 20);
        combo.addItem("Frutas");
        //combo.addItem("Nave");

        btnComenzar = new JButton("Comenzar");
        btnComenzar.setBounds(170, 120, 95, 20);

        add(lblFiguras);
        add(lbl1);
        add(combo);
        add(btnComenzar);

        setVisible(true);
        btnComenzar.addActionListener(this);
        combo.addActionListener(this);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Practica45_DAIII p = new Practica45_DAIII();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Comenzar")) {
            if ((String) combo.getSelectedItem() == "Nave") {
                f.setTitle("Nave Espacial");
                f.setSize(630, 493);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setBackground(Color.BLACK);
                f.setResizable(false);
                f.setVisible(true);
                f.add(NE);
            }
            Ejecutando vE = new Ejecutando((String) combo.getSelectedItem());

        }
    }
}
