package eva1_14_factorial;
public class EVA1_14_FACTORIAL {
    public static void main(String[] args) {
        System.out.println("Factorial de 7 = " + factorial(7));
    }
    public static int factorial(int val){
        if(val == 0)
            return 1;
        else
            return val * factorial(val - 1);
    }
}
