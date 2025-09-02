package com.mycompany.mavenproject1;
public class EVA1_8_COPIA_ARREGLOS {
     public static void main (String[] args){
         int[] arreglo = new int[10];
         llenar(arreglo);
         System.out.println("arreglo");
         System.out.println("");
         imprimir(arreglo);
         int[] arreglo1 = new int[10];
         System.out.println("");
         System.out.println("arreglo1");
         System.out.println("");
         imprimir(arreglo1);
     }
public static void llenar(int[]arreglo){
for (int i = 0; i < arreglo.length; i++){
arreglo[i] = (int) (Math.random() * 100);
}
}
public static void imprimir (int[] arreglo){
for (int i = 0; i < arreglo.length; i++){
System.out.println("{" + arreglo[i] + "]");
}
System.out.println("");
}
public static void copiar(int[] origen, int[] destino){
    for (int i = 0; i < origen.length; i ++){
        destino[i] = origen[i];
    }
}
}
