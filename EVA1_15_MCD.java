package eva1_15_mcd;
public class EVA1_15_MCD {
    public static void main(String[] args) {
        System.out.println("El MCD de 180 y de 48 es: " + mcd(180,48));
    }
    public static int mcd(int dividendo, int divisor){
        int residuo = dividendo % divisor;
        if(residuo == 0)
            return divisor;
        else
            return mcd(divisor,residuo) ;
    }
}
