
public class Nodo {
    private int iValor;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo() {
        this.izquierda = null;
        this.derecha = null;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        this.izquierda = null;
        this.derecha = null;
    }
    
    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
}
