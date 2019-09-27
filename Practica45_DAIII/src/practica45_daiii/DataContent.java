/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica45_daiii;

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
import java.awt.Font;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.lang.*;

/**
 *
 * @author SAMSUNG
 */
public class DataContent extends VentanaEscuchadora implements Runnable {

    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12;
    JFrame jf = new JFrame("Catalogo");

    public DataContent() {
        jf.setLayout(new FlowLayout());
        Dimension d = new Dimension();

        ImageIcon ic1 = new ImageIcon("src\\ImaFF\\Granadas.png");
        ImageIcon ic2 = new ImageIcon("src\\ImaFF\\kiwi.png");
        ImageIcon ic3 = new ImageIcon("src\\ImaFF\\mango2.png");

        ImageIcon ic4 = new ImageIcon("src\\ImaFF\\pina.png");
        ImageIcon ic5 = new ImageIcon("src\\ImaFF\\Aguacate.png");
        ImageIcon ic6 = new ImageIcon("src\\ImaFF\\zarzamora.png");

        ImageIcon ic7 = new ImageIcon("src\\ImaFF\\elebolonegro.png");
        ImageIcon ic8 = new ImageIcon("src\\ImaFF\\aconito.png");
        ImageIcon ic9 = new ImageIcon("src\\ImaFF\\betonica.png");

        ImageIcon ic10 = new ImageIcon("src\\ImaFF\\heliotropo.png");
        ImageIcon ic11 = new ImageIcon("src\\ImaFF\\mandragora.png");
        ImageIcon ic12 = new ImageIcon("src\\ImaFF\\verbena.png");

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

        jf.add(bt1);
        jf.add(bt2);
        jf.add(bt3);
        jf.add(bt4);
        jf.add(bt5);
        jf.add(bt6);
        jf.add(bt7);
        jf.add(bt8);
        jf.add(bt9);
        jf.add(bt10);
        jf.add(bt11);
        jf.add(bt12);

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

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocation((int) ((d.getWidth() / 2) + 100), 50);
        jf.setSize(700, 350);
        jf.setVisible(true);
        jf.setResizable(false);
    }
    DGeneral oDG = new DGeneral();

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == bt1) {

            oDG.setNombreC("Nombre común: Granada");
            oDG.setNombreCo("Nombre científico: Punica granatum");
            oDG.setDescription("Descripción:\nEs un pequeño árbol\n"
                    + "frutal caducifolio de la familia Lythraceae, y cuyo fruto\n"
                    + "es la granada.Subespontánea en los ribazos, cunetas y setos; indiferente edáfica; crece del nivel del mar hasta los 1100 m.\n"
                    + "Florece de abril a junio." + "");
            oDG.setOrigen("Orígen: irano­turania");
            oDG.setImg("src\\ImaFF\\Granadas.png");
            oDG.setTaxonomia("Taxonomía\n\n Reino: Plantae\n"
                    + "División: Magnoliophyta\n"
                    + "Clase: Magnoliopsida\n"
                    + "Orden: Myrtales\n"
                    + "Familia: Lythraceae\n"
                    + "Subfamilia: Punicoideae\n"
                    + "Género: Punica\n"
                    + "Especie: Punica granatum" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }

        if (e.getSource() == bt2) {

            oDG.setNombreC("Nombre común: Kiwi");
            oDG.setNombreCo("Nombre científico: Actinidia deliciosa");
            oDG.setDescription("Descripción:\n El nombre «kiwi» le fue otorgado en Nueva Zelanda,\n"
                    + "posiblemente por una remota similitud de aspecto entre el\n"
                    + "fruto cubierto de vellosidades y el ave kiwi." + "");
            oDG.setOrigen("Origen: China");
            oDG.setImg("src\\ImaFF\\kiwi.png");
            oDG.setTaxonomia("Taxonomía:\n\n Reino: Plantae\n"
                    + "División: Magnoliophyta\n"
                    + "Clase: Magnoliopsida\n"
                    + "Orden: Ericales\n"
                    + "Familia: Actinidiaceae LINDL.\n"
                    + "Especie: Actinidia deliciosa" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
        if (e.getSource() == bt4) {

            oDG.setNombreC("Nombre común: Piña");
            oDG.setNombreCo("Nombre científico: Ananas comosus");
            oDG.setDescription("Descripción:\n\nAnanas comosus, la piña o el ananá o ananás, es una\n"
                    + "planta perenne de la familia de las bromeliáceas, nativa de\n"
                    + "América del Sur. Esta especie, de escaso porte y con\n"
                    + "hojas duras y lanceoladas de hasta 1 metro de largo,\n"
                    + "fructifica una vez cada tres años produciendo un único\n"
                    + "fruto fragante y dulce, muy apreciado en gastronomía." + "");
            oDG.setOrigen("Orígen: América del Sur");
            oDG.setImg("src\\ImaFF\\pina.png");
            oDG.setTaxonomia("Taxonomía:\n\nReino: Plantae\n"
                    + "División: Magnoliophyta\n"
                    + "Clase: Liliopsida\n"
                    + "Subclase: Commelinidae\n"
                    + "Orden: Poales\n"
                    + "Familia: Bromeliaceae\n"
                    + "Subfamilia: Bromelioideae\n"
                    + "Género: Ananas\n"
                    + "Especie: A. comosus" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
        if (e.getSource() == bt3) {

            oDG.setNombreC("Nombre común: Mango");
            oDG.setNombreCo("Nombre científico: Mangifera indica");
            oDG.setDescription("Descripción:\n\nMangifera indica, llamado comúnmente mango o\n"
                    + "melocotón de los trópicos, es una especie arbórea\n"
                    + "perteneciente a la familia de las anacardiáceas.Suele ser un árbol leñoso, que alcanza un gran tamaño y\n"
                    + "altura puede superar los 30 m de altura. Es originario de\n"
                    + "la India y se cultiva en países de clima cálido además de\n"
                    + "algunos de clima templado." + "");
            oDG.setOrigen("Orígen: India");
            oDG.setImg("src\\ImaFF\\mango2.png");
            oDG.setTaxonomia("Taxonomía:\n\nReino: Plantae\n"
                    + "Filo: Magnoliophyta\n"
                    + "Clase: Magnoliopsida\n"
                    + "Orden: Sapindales\n"
                    + "Familia: Anacardiaceae\n"
                    + "Tribu: Anacardieae\n"
                    + "Género: Mangifera\n"
                    + "Especie: M. indica" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
        if (e.getSource() == bt5) {

            oDG.setNombreC("Nombre común: Aguacate");
            oDG.setNombreCo("Nombre científico: Persea americana");
            oDG.setDescription("Descripción:\n\nEs un árbol de hoja perenne. Puede llegar a tener casi\n"
                    + "20 m de altura, aunque su tamaño normal suele rondar los\n"
                    + "diez metros.El fruto es una drupa de color amarillo­verde o marrón\n"
                    + "rojizo, grande, generalmente en forma de pera, a veces\n"
                    + "ovoide o globoso, de 8­18 cm con epicarpio corchoso\n"
                    + "más o menos tuberculado, y mesocarpio carnoso y\n"
                    + "comestible. Este último rodea íntimamente una semilla\n"
                    + "globular de episperma (tegumento) papiráceo, sin\n"
                    + "endosperma, de unos 5­6 cm." + "");
            oDG.setOrigen("Orígen: zona de las Antillas");
            oDG.setImg("src\\ImaFF\\Aguacate.png");
            oDG.setTaxonomia("Taxonomía:\n\nReino: Plantae\n"
                    + "División: Magnoliophyta\n"
                    + "Clase: Magnoliopsida\n"
                    + "Orden: Laurales\n"
                    + "Familia: Lauraceae\n"
                    + "Tribu: Perseae\n"
                    + "Género: Persea\n"
                    + "Especie: Persea americana" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
        if (e.getSource() == bt6) {

            oDG.setNombreC("Nombre común: Zarzamora");
            oDG.setNombreCo("Nombre científico: Punica granatum");
            oDG.setDescription("Descripción:\nEs un pequeño árbol\n"
                    + "frutal caducifolio de la familia Lythraceae, y cuyo fruto\n"
                    + "es la granada." + "");
            oDG.setOrigen("Orígen: irano­turania");
            oDG.setImg("src\\ImaFF\\zarzamora.png");
            oDG.setTaxonomia("Taxonomía:\nPunica del latín pūnĭcum y alude a los fenicios.\n"
                    + "Granatum del adjetivo latíno grānātus, que significa con abundantes granos'." + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
        if (e.getSource() == bt7) {

            oDG.setNombreC("Nombre común: Eléboro negro\n"
                    + "o rosa de Navidad");
            oDG.setNombreCo("Nombre científico: Helleborus niger");
            oDG.setDescription("Descripción:\n\n Es una planta rizomatosa perenne que alcanza los 50 cm\n"
                    + "de altura. La hojas, basales y palmadas con un largo\n"
                    + "peciolo, son grandes, con 7­9 segmentos, coriáceas y de\n"
                    + "color verde oscuro. Las flores, grandes y solitarias de\n"
                    + "color blanco o rosado, su cáliz tiene cinco sépalos\n"
                    + "ovalados. Los pétalos de color amarillo verdoso, son\n"
                    + "tubulares y más cortos que los estambres. El fruto es un\n"
                    + "folículo con numerosas semillas. Florece en invierno." + "");
            oDG.setOrigen("Orígen: centro de Europa y de\n"
                    + "Asia Menor");
            oDG.setImg("src\\ImaFF\\elebolonegro.png");
            oDG.setTaxonomia("Taxonomía\n\n Reino: Plantae\n"
                    + "División: Magnoliophyta\n"
                    + "Clase: Magnoliopsida\n"
                    + "Orden: Ranunculales\n"
                    + "Familia: Ranunculaceae\n"
                    + "Subfamilia: Ranunculoideae\n"
                    + "Tribu: Helleboreae\n"
                    + "Género: Helleborus\n"
                    + "Especie: H. niger" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
        if (e.getSource() == bt8) {

            oDG.setNombreC("Nombre común: Acónito");
            oDG.setNombreCo("Nombre científico: Aconitum");
            oDG.setDescription("Descripción:\n\n Este género de plantas perennes herbáceas es nativo de zonas montañosas\n del hemisferio norte. Sus hojas verde oscuras tienen estípulas; son\n"
                    + "palmeadas o palmeadas lobuladas con 5 a 7 segmentos. Cada segmento\n siguiente es trilobulado con bordes aserrados. Las hojas se disponen en\n"
                    + "espiral o alternadas, las inferiores son largamente pecioladas.\n"
                    + "Son plantas ornamentales, los tallos son erectos, altos, coronados por racimos\n de largas flores zigomorfas azules, púrpuras, blancas, amarillas o\n"
                    + "rosas, con numerosos estambres. Se distinguen por tener uno de los\n cinco sépalos (el posterior), llamado galea, en forma de yelmo cilíndrico.\n"
                    + "Tiene 2 a 10 pétalos, en forma de nectarios.\n"
                    + "Es una planta venenosa ya que contiene aconitina, uno de los\n alcaloides más activos y tóxicos. El uso de esta planta es\n peligroso y se conocen"
                    + "casos en los que el veneno hace\n efecto al contacto con la piel. Es recomendable aprender a reconocerla.\n Se considera la planta más tóxica de Europa." + "");
            oDG.setOrigen("Orígen: Zonas montañosas del hemisferio norte");
            oDG.setImg("src\\ImaFF\\aconito.png");
            oDG.setTaxonomia("Taxonomía\n\n Reino: Plantae\n"
                    + "División: Magnoliophyta\n"
                    + "Clase: Magnoliopsida\n"
                    + "Orden: Ranunculales\n"
                    + "Familia: Ranunculaceae\n"
                    + "Subfamilia: Ranunculoideae\n"
                    + "Tribu: Delphinieae\n"
                    + "Género: Aconitum" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
        if (e.getSource() == bt9) {

            oDG.setNombreC("Nombre común: Betónica");
            oDG.setNombreCo("Nombre científico: Stachys officinalis");
            oDG.setDescription("Descripción:\n\n Es una planta herbácea perenne que alcanza los 65 cm de\n"
                    + "altura con raíz gruesa y leñosa. Tallos cuadrados, peludos\n"
                    + "con sus hojas basales dispuestas en roseta con un largo\n"
                    + "peciolo, forma de corazón y recia nervadura en relieve\n"
                    + "con bordes dentados. Las flores aparecen en junioagosto \ny son de color rojo o rosa y se reúnen en una\n"
                    + "espiga terminal densa. La corola es tubular." + "");
            oDG.setOrigen("Orígen: Europa");
            oDG.setImg("src\\ImaFF\\betonica.png");
            oDG.setTaxonomia("Taxonomía\n\n Reino: Plantae\n"
                    + "Subreino: Tracheobionta\n"
                    + "División: Magnoliophyta\n"
                    + "Clase: Magnoliopsida\n"
                    + "Subclase: Asteridae\n"
                    + "Orden: Lamiales\n"
                    + "Familia: Lamiaceae\n"
                    + "Género: Stachys\n"
                    + "Especie: S.officinalis" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
        if (e.getSource() == bt10) {

            oDG.setNombreC("Nombre común: Heliotropo");
            oDG.setNombreCo("Nombre científico: Heliotropium");
            oDG.setDescription("Descripción:\n\n Son hierbas anuales o perennes o a veces arbustos\n"
                    + "pequeños; plantas hermafroditas. Hojas pecioladas.\n"
                    + "Inflorescencias en cimas helicoidales o flores solitarias a lo\n"
                    + "largo de los tallos frondosos; sépalos 5, libres o casi libres\n"
                    + "hasta la base; corola tubular, 5­lobada; estambres 5,\n"
                    + "insertos en la garganta del tubo de la corola; ovario 4­\n"
                    + "carpelar, frecuentemente 4­lobado, estilo terminal o\n"
                    + "ausente, estigma 1, de forma variable. Frutos secos,\n"
                    + "separados en 2 ó 4 nuececillas al madurarse." + "");
            oDG.setOrigen("Orígen: Desconocido");
            oDG.setImg("src\\ImaFF\\heliotropo.png");
            oDG.setTaxonomia("Taxonomía\n\n Reino: Plantae\n"
                    + "División: Magnoliophyta\n"
                    + "Clase: Magnoliopsida\n"
                    + "Orden: Lamiales\n"
                    + "Familia: Boraginaceae\n"
                    + "Subfamilia: Heliotropioideae\n"
                    + "Género: Heliotropium" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
        if (e.getSource() == bt11) {

            oDG.setNombreC("Nombre común: Mandragora");
            oDG.setNombreCo("Nombre científico: Mandragora");
            oDG.setDescription("Descripción:\n\n Antiguamente la utilizaban con fines curativos.\n"
                    + "Hoy en día sirve como especia de cocina (si está curada)\n"
                    + "o como estupefaciente (si no está curada). Es muy\n"
                    + "frecuente encontrarla en zonas donde las temperaturas\n"
                    + "son muy elevadas, como en Asia y África donde aún se\n"
                    + "utiliza con fines curativos. Es el único género de la tribu\n"
                    + "Mandragoreae." + "");
            oDG.setOrigen("Orígen: Eurasia");
            oDG.setImg("src\\ImaFF\\mandragora.png");
            oDG.setTaxonomia("Taxonomía\n\n Reino: Plantae\n"
                    + "División: Magnoliophyta\n"
                    + "Clase: Magnoliopsida\n"
                    + "Subclase: Asteridae\n"
                    + "Orden: Solanales\n"
                    + "Familia: Solanaceae\n"
                    + "Subfamilia: Solanoideae\n"
                    + "Tribu: Mandragoreae\n"
                    + "Género: Mandragora" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }

        if (e.getSource() == bt12) {

            oDG.setNombreC("Nombre común: Verbena");
            oDG.setNombreCo("Nombre científico: Verbena officinalis");
            oDG.setDescription("Descripción:\n\n Es un género de plantas herbáceas o\n"
                    + "semileñosas, anuales o perenne, con cerca de 250\n"
                    + "especies. Rastreras con hojas simples, opuestas.\n"
                    + "Originarias de ambos hemisferios. Prefieren suelos\n"
                    + "arenosos, livianos y de rápido drenaje. Generalmente se\n"
                    + "las encuentra en grupos de numerosos individuos de flores\n"
                    + "del mismo color, asociadas a otras coloridas\n"
                    + "especies/variedades, las cuales, en su conjunto, forman\n"
                    + "una atractiva vista." + "");
            oDG.setOrigen("Orígen: Desconocido");
            oDG.setImg("src\\ImaFF\\verbena.png");
            oDG.setTaxonomia("Taxonomía\n\n Reino: Plantae\n"
                    + "\nDivisión: Magnoliophyta\n"
                    + "\nClase: Magnoliopsida\n"
                    + "\nOrden: Lamiales\n"
                    + "\nFamilia: Verbenaceae\n"
                    + "\nGénero: Verbena" + "");
            new Data(oDG.getNombreC(), oDG.getNombreCo(), oDG.getOrigen(), oDG.getTaxonomia(), oDG.getDescription(), oDG.getImg());

        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
