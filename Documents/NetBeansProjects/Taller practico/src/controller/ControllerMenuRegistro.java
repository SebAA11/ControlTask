
package controller;

import javax.swing.JPanel;

public class ControllerMenuRegistro {
    
    public void hide_panel(JPanel... panel){
    
    for(int i=0;i<panel.length ; i++){
    panel[i].setVisible(false);
    }
    
    
    }
}
