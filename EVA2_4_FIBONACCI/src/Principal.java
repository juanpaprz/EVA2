
public class Principal {

    public static void main(String[] args) {
        System.out.println(Fibonacci(100));
    }
    
    public static int Fibonacci(int iVal1){
        if (iVal1 == 0) {
            return 0;
        } else if(iVal1 == 1) {
            return 1;
        } else {
            return Fibonacci(iVal1 - 1) + Fibonacci(iVal1 - 2);
        }
    }
    
}
