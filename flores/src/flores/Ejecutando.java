package flores;

import flores.frutaprincipal;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
public class Ejecutando extends VentanaEscuchadora implements Runnable{
	public  Ejecutando( String fig)
	{	
			
		if(fig=="frutaprincipal")
		{

                       new frutaprincipal();
                }

                
        }
	
	 public void run()
	{
			
	} 
}