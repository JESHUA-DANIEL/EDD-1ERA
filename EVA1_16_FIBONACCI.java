package eva1_16_fibonacci;
public class EVA1_16_FIBONACCI {
    public static void main(String[] args) {
        System.out.println("Fibonacci(6)" + fibonacci(6));
    }
    public static int fibonacci(int posi){
        if (posi ==0 ||posi ==1)
            return 1;
            else
            return fibonacci(posi - 2 ) + fibonacci(posi -1 );
        } 
        } 