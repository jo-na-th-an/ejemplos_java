package tareadeso;


public class TareaDeSO {

  
    public static void main(String[] args) {
        
       Controlador e = new Controlador(5);//aqui se determina la cantidad maxima que va a producir
      
       
       Productor r = new Productor(e);
       Consumidor t = new Consumidor(e);
      
       r.LlenarCarton(75);
       
       r.start();
       //t.start();
    }
    
}
