package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Pila<T extends Comparable> {
    private LinkedList<T> pila;


    public Pila(){
        this.pila = new LinkedList<T>();
    }

    public void push(T t){
        this.pila.addFirst(t);
    }

    public T pop(){
        return this.pila.removeFirst();
    }

    public int size(){
        return this.pila.size();
    }


}
