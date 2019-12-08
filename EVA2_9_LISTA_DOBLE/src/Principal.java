
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {

    public static void main(String[] args) {
        ListaDoble miLista = new ListaDoble();
        miLista.add(new Nodo(100));
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.addBegin(new Nodo(500));
        miLista.addBegin(new Nodo(600));
        miLista.add(new Nodo(700));
        try {
            miLista.insertAt(2, new Nodo(800));
            miLista.insertAt(0, new Nodo(900));
            miLista.insertAt(5, new Nodo(1000));
            System.out.println(miLista.getAt(0));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.printList();
        miLista.printBack();
        try {
            miLista.deleteAt(0);
            miLista.deleteAt(2);
            miLista.deleteAt(7);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.printList();
    }
    
}
