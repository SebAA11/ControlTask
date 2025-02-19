
package invertir;
import javax.swing.*;

public class Invertir {

    public static void main(String[] args) {
        
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        String invertida = new StringBuilder(palabra).reverse().toString();
        
        JOptionPane.showMessageDialog(null, "Palabra invertida: " + invertida);
    }
    
}
