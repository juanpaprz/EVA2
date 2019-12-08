
public class Principal {

    public static void main(String[] args) {
        Nodo nodo1, nodo2, nodo3;
        nodo1 = new Nodo(32);
        nodo2 = new Nodo(17);
        nodo3 = new Nodo(5);
        
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);
        
        Nodo temp = nodo1;
        while(temp != null){
            System.out.print(temp.getiValor() + " - ");
            temp = temp.getSiguiente();
        }
    }
    
}

class Nodo{
    
    private int iValor;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        this.siguiente = null;
    }
    
    public int getiValor() {
        return iValor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
