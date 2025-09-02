package com.mycompany.mavenproject1;
public class EVA1_9_CAMBIAR_TAMAÑO {
    public static void main (String[] args){
         int[] arreglo = new int[10];
         llenar(arreglo);
         System.out.println(arreglo);
         imprimir(arreglo);
         int[] copia = new int[10];
         copiar(arreglo, copia);
         System.out.println(copia);
         imprimir(copia);
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


