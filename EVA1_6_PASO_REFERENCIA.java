package com.mycompany.mavenproject1;
public class EVA1_6_PASO_REFERENCIA {
    public static void main(String[] args){
        int[] arreglo = new int[10];
        llenar(arreglo);
        imprimir(arreglo);
        System.out.println("");
        int[] arreglo2 =new int[100];
        llenar(arreglo2);
        imprimir(arreglo2);
        System.out.println("");
        int[] arreglo3 = new int[15];
        llenar(arreglo3);
        imprimir(arreglo3);
        System.out.println("");
    }
public static void llenar(int[]datos){
for (int i =0; i < datos.length; i++){
datos[i] = (int) (Math.random() * 100);
}
}
public static void imprimir (int[] datos){
for (int i =0; i < datos.length; i++){
System.out.println("{" + datos[i] + "]");
}
System.out.println("");
}
}