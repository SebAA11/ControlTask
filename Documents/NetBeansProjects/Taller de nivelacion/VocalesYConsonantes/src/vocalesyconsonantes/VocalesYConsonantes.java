package vocalesyconsonantes;
import javax.swing.*;

public class VocalesYConsonantes {

    public static void main(String[] args) {
        
      String palabra = JOptionPane.showInputDialog("Ingrese una palabra:").toLowerCase();
        int vocales = 0, consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            
            char letra = palabra.charAt(i);
            
            if (Character.isLetter(letra)) {
                if ("aeiou".indexOf(letra) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        JOptionPane.showMessageDialog(null, palabra + "\nNumero de Vocales: " + vocales + "\nNumero de Consonantes: " + consonantes);
    }
    }
    

