
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {

    public static void main(String[] args) {
        Pila miPila = new Pila();
        miPila.push(new Nodo(100));
        miPila.push(new Nodo(200));
        miPila.push(new Nodo(300));
        miPila.push(new Nodo(400));
        try {
            System.out.println("Cima de la pila " + miPila.peek());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("Cima de la pila " + miPila.pop());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miPila.printList();
    }
    
}
