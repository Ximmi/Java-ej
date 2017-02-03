package ejemplojava;
import java.awt.Color;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
public class ElSwing extends JFrame implements ActionListener{
String nombre;
int edad;
String puesto;
JPanel panel1, panel2;
JButton alta, baja, cambio, consulta, salir;
JTextField tnombre, tedad, tpuesto;
JLabel lnombre, ledad, lpuesto;

ElSwing(){
    
    super("Ejemplo ETS");
    setSize(400,400);
    setLocation(0,0);
    setVisible(true);
    setResizable(false);
    getContentPane().setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel1= new JPanel();
    panel1.setSize(400, 200);
    panel1.setLocation(0,0);
    add(panel1);
    
    JLabel lnombre= new JLabel("Nombre:");
    lnombre.setLocation(30,40);
    lnombre.setSize(90, 30);
    lnombre.setVisible(true);
    add(lnombre);
    
    JTextField tnombre=new JTextField();
    tnombre.setLocation(150,40);
    tnombre.setSize(150,30);
    tnombre.setVisible(true);
    add(tnombre);
    
    JLabel ledad= new JLabel("Edad:");
    ledad.setLocation(30,100);
    ledad.setSize(90, 30);
    ledad.setVisible(true);
    add(ledad);
    
    JTextField tedad=new JTextField();
    tedad.setLocation(150,100);
    tedad.setSize(150,30);
    tedad.setVisible(true);
    add(tedad);
    
    JLabel lpuesto= new JLabel("Puesto:");
    lpuesto.setLocation(30,160);
    lpuesto.setSize(90, 30);
    lpuesto.setVisible(true);
    add(lpuesto);
    
    JTextField tpuesto=new JTextField();
    tpuesto.setLocation(150,160);
    tpuesto.setSize(150,30);
    tpuesto.setVisible(true);
    add(tpuesto);
    
    JPanel panel2=new JPanel();
    panel2.setSize(400, 200);
    panel2.setLocation(0,200);
    add(panel2);
    
    JButton alta= new JButton("Alta");
    alta.setSize(70,30);
    alta.setLocation(40,220);
    alta.setBackground(Color.BLUE);
    alta.setVisible(true);
    add(alta);
    
    JButton baja= new JButton("Baja");
    baja.setSize(70,30);
    baja.setLocation(140,220);
    baja.setBackground(Color.PINK);
    baja.setVisible(true);
    add(baja);
    
    JButton cambio= new JButton("Cambio");
    cambio.setSize(80,30);
    cambio.setLocation(240,220);
    cambio.setBackground(Color.CYAN);
    cambio.setVisible(true);
    add(cambio);
    
    JButton consulta= new JButton("Consulta");
    consulta.setSize(90,30);
    consulta.setLocation(60,280);
    consulta.setBackground(Color.MAGENTA);
    consulta.setVisible(true);
    add(consulta);
    
    JButton salir=new JButton("Salir");
    salir.setSize(90,30);
    salir.setLocation(180,280);
    salir.setBackground(Color.red);
    salir.setVisible(true);
    add(salir);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
