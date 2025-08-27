package com.mycompany.mavenproject1;
public class EVA1_7_ARREGLOS {
    public static void main (String[] args){
        int [] arreglo = new int[3];
        arreglo[0]=100;
        arreglo[1]=200;
        arreglo[2]=300;
        System.out.println(arreglo);
        imprimir(arreglo);
        arreglo = new int[2];
        System.out.println(arreglo);
        imprimir(arreglo);
    }
    public static void imprimir (int[] datos){
for (int i =0; i < datos.length; i++){
System.out.println("{" + datos[i] + "]");
}
System.out.println("");
}
}

