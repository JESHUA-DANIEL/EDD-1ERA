
package com.mycompany.mavenproject1;

public class EVA1_5_PASO_REFERENCIA {
    public static void main (String[] args){
        Foo objeto = new Foo ();
        process(objeto); //tambien enviamos una copia, pero de la dirrecion del objeto
        System.out.println("objeto.valor =" + objeto.valor);
    }
    public static void process (Foo obj){
        obj.valor =9999;
    }
}
class Foo{
    int valor = 0;
}
