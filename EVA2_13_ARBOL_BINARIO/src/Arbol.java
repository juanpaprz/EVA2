
public class Arbol {
    private Nodo root;

    public Arbol() {
        root = null;
    }
    
    public void agregarNodo(Nodo nuevo){
        agregarNodoRec(root, nuevo);
    }
    
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
        if (root == null) {
            root = nuevo;
        } else {
            if (nuevo.getiValor() > actual.getiValor()) {
                if (actual.getDerecha() == null) {
                    actual.setDerecha(nuevo);
                } else {
                    agregarNodoRec(actual.getDerecha(), nuevo);
                }
            } else if (nuevo.getiValor() < actual.getiValor()){
                if (actual.getIzquierda() == null) {
                    actual.setIzquierda(nuevo);
                } else {
                    agregarNodoRec(actual.getIzquierda(), nuevo);
                }
            } else{
                System.out.println("Nodo repetido");
            }
        }
    }
    
    public void imprimePostOrder(){
        postOrder(root);
    }
    
    private void postOrder(Nodo actual){
        if (root == null) {
            System.out.println("Arbol vacío");
        } else {
            if(actual != null){
                postOrder(actual.getIzquierda());
                postOrder(actual.getDerecha());
                System.out.print(actual.getiValor() + "-");
            }
        }
    }
    
    public void imprimePreOrder(){
        preOrder(root);
    }
    
    private void preOrder(Nodo actual){
        if (root == null) {
            System.out.println("Arbol vacío");
        } else {
            if(actual != null){
                System.out.print(actual.getiValor() + "-");
                preOrder(actual.getIzquierda());
                preOrder(actual.getDerecha());
            }
        }
    }
    
    public void imprimeInOrder(){
        inOrder(root);
    }
    
    private void inOrder(Nodo actual){
        if (root == null) {
            System.out.println("Arbol vacío");
        } else {
            if(actual != null){
                inOrder(actual.getIzquierda());
                System.out.print(actual.getiValor() + "-");
                inOrder(actual.getDerecha());
            }
        }
    }
    
}
