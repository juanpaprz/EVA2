
public class Principal {

    public static void main(String[] args) {
        System.out.println(CalculaFactorial(14));
    }
    
    public static int CalculaFactorial(int iVal){
        System.out.println("Inicio " + iVal);
        if (iVal == 0) {
            System.out.println("Fin " + iVal);
            return 1;
        } else {
            return iVal * CalculaFactorial(iVal - 1);
        }
    }
    
}
