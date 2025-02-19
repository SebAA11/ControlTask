package calculadorabasica;
import javax.swing.*;


public class CalculadoraBasica {
 
  private String calcular;  private int val1, val2, total, acomulado, valorAcom;
  
  public CalculadoraBasica(){
      
      calcular = "";
      val1 = 0; val2 = 0; total = 0; acomulado = 0; valorAcom = 0;

}
  public void pedirDatosIniciales(){
      
        calcular = JOptionPane.showInputDialog("Ingrese el número asignado a la operacion que desea realizar: \n1. Suma    ||     2. Resta    \n3. Multiplicacion    ||    4. Division");
        val1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
        
  }
  public void pedirDatosAcomulado(){
      
        calcular = JOptionPane.showInputDialog("Ingrese la operacion que desea realizar con el resultado anterior: \n1. Suma    ||     2. Resta    \n3. Multiplicacion    ||    4. Division");
        valorAcom = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"));
         
  }
  public int calculadora(){
        
         switch(calcular){
            case"1":    
                total= val1 + val2;
                acomulado+=total;
                
                break;
            case"2": 
                total= val1 - val2;
                acomulado+=total;
                         
                break;
            case"3": 
                total= val1 * val2;
                acomulado+=total;
                         
                break;
            case"4": 
                
                total= val1 / val2;
                acomulado+=total;
                         
                break;
            default: JOptionPane.showMessageDialog(null, "operacion no valida");
                     
        }
         return(total);
    }
  public int calculadorAcomulado(){
        
         switch(calcular){
            case"1":    
                total= total + valorAcom;
                acomulado+=total;
                
                break;
            case"2": 
                total= total - valorAcom;
                acomulado+=total;
                         
                break;
            case"3": 
                total= total * valorAcom;
                acomulado+=total;
                         
                break;
            case"4": 
                
                total= total / valorAcom;
                acomulado+=total;
                         
                break;       
            default: JOptionPane.showMessageDialog(null, "operacion no valida");
                     
        }
         return(total);
    }
  public void mostrarResultado(){
        
        JOptionPane.showMessageDialog(null,"Total: " + total);
    }
 
  
    public static void main(String[] args) {
        
         CalculadoraBasica  calcular= new CalculadoraBasica();
        
        String continuar="si";
        
          calcular.pedirDatosIniciales();
          calcular.calculadora();
          calcular.mostrarResultado();
          
        while(continuar.equalsIgnoreCase("si")){ 
            
          continuar=JOptionPane.showInputDialog("¿Desea realizar otra operacion con este resultado?\n\"SI\" para continuar \n\"R\" para reiniciar  \n\"NO\" para salir ");
          
          if (continuar.equalsIgnoreCase("si")){
          calcular.pedirDatosAcomulado();
          calcular.calculadorAcomulado();
          calcular.mostrarResultado();
          
           }
        if (continuar.equalsIgnoreCase("R")){
          calcular.pedirDatosIniciales();
          calcular.calculadora();
          calcular.mostrarResultado();
          
          continuar=JOptionPane.showInputDialog("¿Desea realizar otra operacion con este resultado?\n\"SI\" para continuar \n\"R\" para reiniciar  \n\"NO\" para salir ");
           }   
        
        }
        
        
            
        
        
    }
    
    
    
}
