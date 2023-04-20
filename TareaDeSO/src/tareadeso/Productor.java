package tareadeso;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {
    
    private Controlador controlador;
    private final int[] numeros = new int [75]; 
    
    public Productor(Controlador x){
        
        this.controlador = x;
     
    }
    
     public void LlenarCarton(int tamaño){
        
        
        for(int i=0; i<tamaño;i++){
        
            numeros[i]=i;
            //System.out.println("llenando vector: "+numeros[i]);
        }

    }
    
    public void run(){
    
        int valor = 0;
        while(true){

            try {
                valor = numeros[(int)(Math.random()* 75+0)];
                controlador.producir(valor);
                System.out.println("**Numero "+ valor +" producido**");

                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
