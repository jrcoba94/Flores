package flores;

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
import java.awt.Adjustable;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class frutaprincipal extends VentanaEscuchadora implements Runnable{
 
    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7 ,bt8, bt9, bt10,bt11,bt12,bt13,bt14,bt15,bt16;
    JFrame jf = new JFrame("Catalogo");
 
    public frutaprincipal(){
 
 
        jf.setLayout(new FlowLayout());
        Dimension d = new Dimension();
 
        //imagen para el boton
        
       
        ImageIcon ic1 = new ImageIcon("src\\flores\\imagen\\durazno.png");
        ImageIcon ic2 = new ImageIcon("src\\flores\\imagen\\fresa.png");
        ImageIcon ic3 = new ImageIcon("src\\flores\\imagen\\mango.png");
        
        ImageIcon ic4 = new ImageIcon("src\\flores\\imagen\\manzana.png");
        ImageIcon ic5 = new ImageIcon("src\\flores\\imagen\\papa.png");
        ImageIcon ic6 = new ImageIcon("src\\flores\\imagen\\pepino.png");
        
        ImageIcon ic7 = new ImageIcon("src\\flores\\imagen\\pera.png");
        ImageIcon ic8 = new ImageIcon("src\\flores\\imagen\\platano.png");
        ImageIcon ic9 = new ImageIcon("src\\flores\\imagen\\jaz.jpg");
        
        ImageIcon ic10 = new ImageIcon("src\\flores\\imagen\\grad.jpg");
        ImageIcon ic11 = new ImageIcon("src\\flores\\imagen\\lirio.jpg");
        ImageIcon ic12 = new ImageIcon("src\\flores\\imagen\\orquedeas.jpg");
        ImageIcon ic13 = new ImageIcon("src\\flores\\imagen\\rosa.jpg");
        ImageIcon ic14 = new ImageIcon("src\\flores\\imagen\\tuli.jpg");
        ImageIcon ic15 = new ImageIcon("src\\flores\\imagen\\anturiio.jpg");
        ImageIcon ic16 = new ImageIcon("src\\flores\\imagen\\crisantemos.jpg");


     
        bt1 = new JButton(ic1);
        bt2 = new JButton(ic2);
        bt3 = new JButton(ic3); 
        bt4 = new JButton(ic4);
        bt5 = new JButton(ic5); 
        bt6 = new JButton(ic6);
        bt7 = new JButton(ic7); 
        bt8 = new JButton(ic8);
        bt9 = new JButton(ic9); 
        bt10 = new JButton(ic10);
        bt11 = new JButton(ic11);
        bt12 = new JButton(ic12);
        bt13 = new JButton(ic13); 
        bt14 = new JButton(ic14);
        bt15 = new JButton(ic15);
        bt16 = new JButton(ic16);
        
//        margenes para texto en boton
        bt1.setBounds(8, 8, 8, 8);
        bt2.setBounds(7, 7, 7, 7);
        bt3.setBounds(7, 7, 7, 7);
        bt4.setBounds(7, 7, 7, 7);
        bt5.setBounds(7, 5, 7, 7);
        bt6.setBounds(7, 5, 7, 7);
        bt6.setBounds(7, 5, 7, 7);
        bt7.setBounds(7, 5, 7, 7);
        bt8.setBounds(7, 5, 7, 7);
        bt9.setBounds(7, 5, 7, 7);
        bt10.setBounds(7, 5, 7, 7);
        bt11.setBounds(7, 5, 7, 7);
        bt12.setBounds(7, 5, 7, 7);
        bt13.setBounds(7, 5, 7, 7);
        bt14.setBounds(7, 5, 7, 7);
        bt15.setBounds(7, 5, 7, 7);
        bt16.setBounds(7, 5, 7, 7);
        
        
        //agregando los botones a la ventana
        jf.add(bt1); jf.add(bt2); jf.add(bt3);
        jf.add(bt4); jf.add(bt5); jf.add(bt6);
        jf.add(bt7); jf.add(bt8); jf.add(bt9);
        jf.add(bt10); jf.add(bt11); jf.add(bt12);
        jf.add(bt13);
        jf.add(bt14); jf.add(bt15); jf.add(bt16);
 
        //listener de los botones
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt15.addActionListener(this);
        bt16.addActionListener(this);
        
     
 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X        
        jf.setResizable(false);//para configurar si se redimensiona la ventana
        jf.setLocation((int) ((d.getWidth()/2)+200), 100);//para ubicar inicialmente donde se muestra la ventana (x, y)
        jf.setSize(600, 450);//configurando tamaño de la ventana (ancho, alto)
        jf.setVisible(true);//configurando visualización de la venta
    }
 

    Fruta oFruta=new Fruta();
            @Override
    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
        if(e.getSource()==bt1){
            
            
            
            oFruta.setNombre("NOMBRE: Durazno");
            oFruta.setDescripcion("DESCRIPCIÓN:  Es un excelente laxante suave y tiene propiedades diuréticas,"+"\n"
                    +"                           "+"ayuda a la digestión, también es bueno para los problemas "+"\n"
                    +"                           "+"reumáticos y las enfermedades pulmonares."+"");
            oFruta.setLugar("ORIGEN: China, Afganistán e Irán");
            oFruta.setImagen("src\\flores\\imagen\\durazno.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
            
            
           
        }
        if(e.getSource()==bt2){
            oFruta.setNombre("Nombre: Fresa");
            oFruta.setDescripcion("DESCRIPCIÓN:  La fresa es un fruto de color rojo brillante, suculento y fragante"+"\n"
                    +"                           "+"que se obtiene de la planta que recibe su mismo nombre, "+"\n"
                    +"                           "+"En Occidente es considerada la reina de las frutas"+"");
            oFruta.setLugar("ORIGEN: China, Afganistán e Irán");
            oFruta.setLugar("ORIGEN: Irapuato Guanajuato");
            oFruta.setImagen("src\\flores\\imagen\\fresa.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
//           
        }
         if(e.getSource()==bt3){
//                    
             oFruta.setNombre("Nombre: mango o melocotón de los trópicos");
            oFruta.setDescripcion("DESCRIPCIÓN:  El mango es una fruta de la Zona Intertropical de pulpa carnosa y dulce. "+"\n"
                    +"                           "+"Destaca entre sus principalescaracterísticas su buen sabor");
            oFruta.setLugar("ORIGEN: originariamente del área indobirmana");
            oFruta.setImagen("src\\flores\\imagen\\mango.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
             
        }
         if(e.getSource()==bt4)
         {
                   
             oFruta.setNombre("Nombre: Manzana ");
            oFruta.setDescripcion("DESCRIPCIÓN: :Se estima que existen entre 5 000 y 20 000 variedades/cultivares de manzanas "+"\n"
                    +"aunque el número se reduce a nivel comercial. Todavía se están desarrollando nuevas variedades");
            oFruta.setLugar("Pais: Durango, Mexico");
            oFruta.setImagen("src\\flores\\imagen\\manzana.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
         if(e.getSource()==bt5)
         {
             oFruta.setNombre("Nombre:papa");
           oFruta.setDescripcion("DESCRIPCIÓN: :es una planta perteneciente a la familia de las solanáceas originaria de Sudamérica "+"\n"
                    +"cultivada por todo el mundo por sus tubérculos comestibles");
            oFruta.setLugar("Pais: Durango, Mexico");
            oFruta.setImagen("src\\flores\\imagen\\papa.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
         if(e.getSource()==bt6)
         {
             oFruta.setNombre("Nombre:pepino");
           oFruta.setDescripcion("DESCRIPCIÓN: :l Pepino es una planta mensual, monoica, o sea que hay flores femeninas y masculinas "+"\n"
                    +" en el mismo individuo");
            oFruta.setLugar("Pais: Guadalajara Mexico");
            oFruta.setImagen("src\\flores\\imagen\\pepino.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
         
         if(e.getSource()==bt7)
         {
             oFruta.setNombre("Nombre:pera");
           oFruta.setDescripcion("DESCRIPCIÓN: :xisten más de 30 variedades de peras, de diferentes colores, texturas y sabores "+"\n"
                    +"cultivada por todo el mundo por sus tubérculos comestibles");
            oFruta.setLugar("Pais: Durango, Mexico");
            oFruta.setImagen("src\\flores\\imagen\\pera.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
         
         if(e.getSource()==bt8)
         {
             oFruta.setNombre("Nombre:platano");
           oFruta.setDescripcion("DESCRIPCIÓN: :el platano es una fruta color amarillo o verde que crece e sonaz tropicales "+"\n"
                    +"del suroeste asiatico");
            oFruta.setLugar("Pais: Sureste Asiático");
            oFruta.setImagen("src\\flores\\imagen\\platano.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
         
         
         //flores
           if(e.getSource()==bt9)
         {
             
             
             oFruta.setNombre("Nombre:jaznimn");
           oFruta.setDescripcion("DESCRIPCIÓN: :Representan la fidelidad y lealtad. Es una de las flores más valoradas por su belleza  "+"\n"
                    +"y dulce aroma, de hecho se utiliza para crear muchos perfumes");
            oFruta.setLugar("Pais: China");
            oFruta.setImagen("src\\flores\\imagen\\jaz.jpg");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
             if(e.getSource()==bt10)
         {
             oFruta.setNombre("Nombre:Gardenias");
           oFruta.setDescripcion("DESCRIPCIÓN: :as gardenias son tradicionales flores suaves y delicadas que representan dulzura, ternura y distinción. "+"\n"
                    +"No tienen nada que envidiar a las rosas por su maravilloso aroma y sus suaves pétalos.");
            oFruta.setLugar("Pais: Japon");
            oFruta.setImagen("src\\flores\\imagen\\grad.jpg");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
               if(e.getSource()==bt11)
         {
             oFruta.setNombre("Nombre:Lirio");
           oFruta.setDescripcion("DESCRIPCIÓN: :el platano es una fruta color amarillo o verde que crece e sonaz tropicales "+"\n"
                    +"del suroeste asiatico");
            oFruta.setLugar("Pais: Sureste Asiático");
            oFruta.setImagen("src\\flores\\imagen\\lirio.jpg");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
                 if(e.getSource()==bt12)
         {
             oFruta.setNombre("Nombre:platano");
           oFruta.setDescripcion("DESCRIPCIÓN: :el platano es una fruta color amarillo o verde que crece e sonaz tropicales "+"\n"
                    +"del suroeste asiatico");
            oFruta.setLugar("Pais: Sureste Asiático");
            oFruta.setImagen("src\\flores\\imagen\\platano.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
                   if(e.getSource()==bt13)
         {
             oFruta.setNombre("Nombre:platano");
           oFruta.setDescripcion("DESCRIPCIÓN: :el platano es una fruta color amarillo o verde que crece e sonaz tropicales "+"\n"
                    +"del suroeste asiatico");
            oFruta.setLugar("Pais: Sureste Asiático");
            oFruta.setImagen("src\\flores\\imagen\\platano.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
                     if(e.getSource()==bt14)
         {
             oFruta.setNombre("Nombre:platano");
           oFruta.setDescripcion("DESCRIPCIÓN: :el platano es una fruta color amarillo o verde que crece e sonaz tropicales "+"\n"
                    +"del suroeste asiatico");
            oFruta.setLugar("Pais: Sureste Asiático");
            oFruta.setImagen("src\\flores\\imagen\\platano.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
                       if(e.getSource()==bt15)
         {
             oFruta.setNombre("Nombre:platano");
           oFruta.setDescripcion("DESCRIPCIÓN: :el platano es una fruta color amarillo o verde que crece e sonaz tropicales "+"\n"
                    +"del suroeste asiatico");
            oFruta.setLugar("Pais: Sureste Asiático");
            oFruta.setImagen("src\\flores\\imagen\\platano.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
            
         }  if(e.getSource()==bt16)
         {
             oFruta.setNombre("Nombre:platano");
           oFruta.setDescripcion("DESCRIPCIÓN: :el platano es una fruta color amarillo o verde que crece e sonaz tropicales "+"\n"
                    +"del suroeste asiatico");
            oFruta.setLugar("Pais: Sureste Asiático");
            oFruta.setImagen("src\\flores\\imagen\\platano.png");
            new Datos(oFruta.getNombre(),oFruta.getLugar(),oFruta.getDescripcion(),oFruta.getImagen());
         }
                       
         
 
            }          
           
        
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }


