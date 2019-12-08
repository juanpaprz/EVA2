
import java.util.LinkedList;


public class Principal {

    public static void main(String[] args) {
        LinkedList<String> lListaEnla = new LinkedList<String>();
        lListaEnla.add("Hola");
        lListaEnla.add(" ");
        lListaEnla.add("mundo");
        lListaEnla.add(" ");
        lListaEnla.add("cruel");
        lListaEnla.add("!!!");
        lListaEnla.addFirst("XXXXX");
        System.out.println(lListaEnla);
        for (String string : lListaEnla) {
            System.out.print(string);
        }
        System.out.println("Cantidad de elementos " + lListaEnla.size());
        lListaEnla.remove(3);
        System.out.println(lListaEnla);
    }
    
}
