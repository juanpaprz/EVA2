
public class Nodo {
    private int iValor;
    private Nodo siguiente;
    private Nodo previo;

    public Nodo() {
        this.siguiente = null;
        this.previo = null;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        this.siguiente = null;
        this.previo = null;
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

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
}
