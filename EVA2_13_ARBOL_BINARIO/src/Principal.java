
public class Principal {

    public static void main(String[] args) {
        Arbol miArbolio = new Arbol();
        miArbolio.agregarNodo(new Nodo(13));
        miArbolio.agregarNodo(new Nodo(10));
        miArbolio.agregarNodo(new Nodo(18));
        miArbolio.agregarNodo(new Nodo(2));
        miArbolio.agregarNodo(new Nodo(11));
        miArbolio.agregarNodo(new Nodo(17));
        miArbolio.agregarNodo(new Nodo(20));
        miArbolio.imprimePostOrder();
        System.out.println("");
        miArbolio.imprimePreOrder();
        System.out.println("");
        miArbolio.imprimeInOrder();
        System.out.println("");
    }
    
}
