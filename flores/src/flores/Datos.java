package flores;

import static com.sun.glass.ui.Cursor.setVisible;
import flores.frutaprincipal;
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


public class Datos  extends Fruta{

    JLabel nombre;
    JLabel origen;
    JTextArea descripcio;
    JLabel Espacio;
    JLabel imagen;
    JButton btnAceptar;
  
    public Datos(String nom, String ori, String des, String Ima)
    {
        titulo="FRUTAS";
		super.setTitulo(titulo); 
		super.getTitulo(); 
		super.setTamano(540,300);
                setBackground(Color.white);
                setLocation(800,100);
		setLayout(null);
                
                imagen=new JLabel(new ImageIcon(Ima));
                imagen.setBounds(160, 50, 200, 300);
                nombre=new JLabel(nom);
		nombre.setFont(new Font ("Times New Roman",Font.BOLD,14));
		nombre.setForeground(Color.BLACK);
		nombre.setBounds(20,50,200,30);

                
                origen=new JLabel(ori);
		origen.setFont(new Font ("Times New Roman",Font.BOLD,16));
		origen.setForeground(Color.black);
		origen.setBounds(20,70,400,30);
                
                descripcio=new JTextArea(des);
                descripcio.enable(true);
                descripcio.setFont(new Font ("Times New Roman",Font.BOLD,14));
		descripcio.setForeground(Color.black);
                descripcio.setBounds(20,100,510,120);
                
                
                btnAceptar=new JButton("Cerrar");
                btnAceptar.setBounds(200,270,150,20);
                
                Espacio=new JLabel("");
		Espacio.setFont(new Font ("Times New Roman",Font.BOLD,20));
		Espacio.setForeground(Color.WHITE);
		Espacio.setBounds(50,230,20,500);
                 
                add(imagen);
                add(nombre);
		add(origen);
		add(descripcio);
                add(btnAceptar);
                add(Espacio);
              
                
		setVisible(true);
                btnAceptar.addActionListener(this);           
                
    }
    
    
    
  
    
    public void actionPerformed(ActionEvent e)
{
            if(e.getActionCommand().equals("Cerrar"))
		{	
                    this.hide();
		}
            
                
            }

    private void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 

   
}
