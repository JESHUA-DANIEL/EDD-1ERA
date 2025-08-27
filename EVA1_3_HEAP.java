package com.mycompany.mavenproject1;
public class EVA1_3_HEAP {
    public static void main(String[] args){
        int x=5;
       Prueba prueba1 = new Prueba();//referencia
       Prueba prueba2 = new Prueba();//referencia
        System.out.println("x =" +x);
        System.out.println("Prueba1 =" +prueba1);
        System.out.println("Prueba2 =" + prueba2);
        System.out.println("Prueba1.valor =" + prueba2.valor);
        System.out.println("Prueba2.valor =" + prueba2.valor);
        prueba1 = null;//rompemos el enlace entre variable y memoria
        prueba2 = null;//rompemos el enlace entre variable y memoria
        
    }
}
