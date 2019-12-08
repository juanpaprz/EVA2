
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner sLeer = new Scanner(System.in);
        System.out.println("Introduzca un valor");
        int x = sLeer.nextInt();
        sLeer.nextLine();
        if (esPrimoIneficiente(x)) {
            System.out.println(x + " Es primo");
        } else {
            System.out.println(x + " No es primo");
        }
        if (esPrimoEficiente(x)) {
            System.out.println(x + " Es primo");
        } else {
            System.out.println(x + " No es primo");
        }
    }
    
    public static boolean esPrimoIneficiente(int iValor){
        boolean bResul = true;
        for (int i = 2; i < iValor - 1; i++) {
            if ((iValor % i) == 0) {
                bResul = false;
                break;
            } 
        }
        return bResul;
    }
    
    public static boolean esPrimoEficiente(int iValor){
        boolean bResul = true;
        for (int i = 2; i < Math.sqrt((double) iValor); i++) {
            if ((iValor % i) == 0) {
                bResul = false;
                break;
            } 
        }
        return bResul;
    }
    
}
