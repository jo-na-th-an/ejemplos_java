package tareadeso;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {
    
    private Controlador controlador;
    private final int[] numeros =new int [75]; 
    
    public Productor(Controlador x){
        
        this.controlador = x;
     
    }
    
    public void run(){
    
        while(true){

            try {
                int valor = numeros[(int)(Math.random() * 75+0)];
                controlador.producir(valor);
                System.out.println("Numero "+ valor +" producido");

                sleep((int) (Math.random() * 3000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
