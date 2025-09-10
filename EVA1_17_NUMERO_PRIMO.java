package eva1_17_numero_primo;
public class EVA1_17_NUMERO_PRIMO {
public static void main(String[] args) {
        System.out.println("EL NUMERO 100 ES PRIMO " +EsPrimoEficiente(3089) );
        System.out.println("EL NUMERO 100 ES PRIMO " +EsPrimoNoEficiente(3089));
    }
public static boolean EsPrimoEficiente(int val){
        if (val <= 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
public static boolean EsPrimoNoEficiente(int val){
int resi = 1;
boolean resu = true;
for (int i = 2; i < val ; i++){
     if (val % i == 0) {  // Si encontramos un divisor
                resu = false;  // No es primo
                break;  // No necesitamos seguir buscando más divisores
            }
}
return resu;
}
}