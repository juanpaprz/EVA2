
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {

    public static void main(String[] args) {
        Cola miCola = new Cola();
        miCola.Add(new Nodo(100));
        miCola.Add(new Nodo(200));
        miCola.Add(new Nodo(300));
        miCola.Add(new Nodo(400));
        try {
            System.out.println(miCola.leer());
            miCola.quitar();
            System.out.println(miCola.leer());
            miCola.quitar();
            System.out.println(miCola.leer());
            miCola.quitar();
            System.out.println(miCola.leer());
            miCola.quitar();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
