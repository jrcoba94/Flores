package flores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Principal extends VentanaEscuchadora {
	JLabel lblFiguras;
	JLabel lbl1;
	JComboBox combo;
	JButton btnComenzar;
	Color c;
	public Principal()
	{
		titulo="Menu";
		super.setTitulo(titulo); 
		super.getTitulo(); 
		super.setTamano(320,187);
		setLayout(null);
		lblFiguras=new JLabel("Practicas");
		lblFiguras.setFont(new Font ("Arial",Font.BOLD,16));
		lblFiguras.setForeground(c.BLUE);
		lblFiguras.setBounds(130,40,100,20);
		lbl1=new JLabel("Seleccione la opción que desee.");
		lbl1.setForeground(c.GRAY);
		lbl1.setFont(new Font ("Arial",Font.BOLD,12));
		lbl1.setBounds(70,60,200,20);
		combo=new JComboBox();
		combo.setBounds(50,85,110,20);
                combo.addItem("frutaprincipal");
                btnComenzar=new JButton("Comenzar");
		btnComenzar.setBounds(170,85,95,20);
		add(lblFiguras);
		add(lbl1);
		add(combo);
		add(btnComenzar);
		setVisible(true);
		btnComenzar.addActionListener(this);
		combo.addActionListener(this);
	}
		
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==combo)
		{
			if((String)combo.getSelectedItem()=="frutaprincipal")
			{                        
			}
                }
		if(e.getActionCommand().equals("Comenzar"))
		{
			Ejecutando vE=new Ejecutando((String)combo.getSelectedItem());
			
		}
	}
	public static void main(String args[])
	{
		Principal v=new Principal();
	}
}
