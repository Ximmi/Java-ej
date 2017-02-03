
package ejemplojava;
import java.awt.*;
import javax.swing.*;
public class usoLámina extends JFrame{
    usoLámina(){
          super("Ejemplo ETS 2");
    setSize(400,400);
    setLocation(0,0);
    setVisible(true);
    setResizable(false);
    getContentPane().setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Lamina objlamina=new Lamina();
    add(objlamina);
    }
}
