
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Scanner sLeer = new Scanner(System.in);
        System.out.println("Introduce un número");
        int iNum = sLeer.nextInt();
        for (int i = iNum; i >= 1; i--) {
            System.out.print(i + "-");
        }
        System.out.println("");
        forFalso(iNum);
        System.out.println("");
        forFalsoInv(1, iNum);
        System.out.println("");
    }
    
    public static void forFalso(int iNum){
        System.out.print(iNum + "-");
        if (iNum > 1) {
            forFalso(iNum - 1);
        }
    }
    
    public static void forFalsoInv(int iUno, int iNum){
        System.out.print(iUno + "-");
        if(iUno < iNum){
            forFalsoInv(iUno + 1, iNum);
        }
    }
    
}
