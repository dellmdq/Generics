package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
	// write your code here
    /*
        Arreglo<String> arreglito = new Arreglo();

        String s = "Hola";
        String p = "Florchu";
        String aqui = "Aqui";
        String pepe = "Pepe";
        arreglito.add(s);
        arreglito.add(p);
        arreglito.add(aqui);
        arreglito.add(pepe);
        arreglito.showArreglo();

        System.out.println(arreglito.exists(s));
        System.out.println("El maximo es " + arreglito.max());
        System.out.println("El minimo es " + arreglito.min());
        System.out.println("Deleted element is " + arreglito.deleteLastElement());

     */
        Pila pilita = new Pila<Integer>();
        pilita.push(1);
        pilita.push(2);
        pilita.push(3);
        pilita.push(4);
        pilita.push(5);

        System.out.println(pilita.pop());
        System.out.println(pilita.pop());
        System.out.println(pilita.pop());
        System.out.println(pilita.pop());
        System.out.println(pilita.pop());

    }


}
