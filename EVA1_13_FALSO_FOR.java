package eva1_13_falso_for;
public class EVA1_13_FALSO_FOR {
    public static void main(String[] args) {
        falsofor(5); //5-4-3-2-1
        System.out.println("");
        falsoforUp(1);
    }
    public static void falsofor(int val){//5-4-3-2-1
        System.out.print(val+ "-");//resolvemos un problema
        if(val>1)//detener recursividad
        falsofor(val - 1); //llamarse a si mismo
    }
    public static void falsoforUp(int val){//1-2-3-4-5
       System.out.print(val + "-");//RESOLVER EL PROBLEMA
       if(val<5)//DETENER RECURSIVIDAD
           falsoforUp(val + 1);//LLAMARSE A SI MISMO
    }
}
