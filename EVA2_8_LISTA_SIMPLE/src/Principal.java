
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {

    public static void main(String[] args) {
        Lista miLista = new Lista();
        miLista.Add(new Nodo(4));
        miLista.Add(new Nodo(12));
        miLista.Add(new Nodo(89));
        miLista.Add(new Nodo(402));
        miLista.Add(new Nodo(15));
        boolean vacia = miLista.isEmpty();
        if (vacia) {
            System.out.println("Está vacia");
        } else {
            System.out.println("Lista con nodos");
        }
        miLista.printList();
        System.out.println("Cantidad = " + miLista.size());
        miLista.addBegin(new Nodo(5));
        miLista.printList();
        try {
            miLista.insertAt(4, new Nodo(50));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Cantidad = " + miLista.size());
        miLista.printList();
        try {
            miLista.deleteAt(3);
            miLista.printList();
            miLista.Add(new Nodo(200));
            miLista.printList();
            miLista.deleteAt(6);
            miLista.printList();
            miLista.Add(new Nodo(300));
            miLista.printList();
            System.out.println("El valor 3 es " + miLista.getAt(3));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
