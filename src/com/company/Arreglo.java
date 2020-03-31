package com.company;

import java.util.ArrayList;

public class Arreglo <T extends Comparable> {
    private ArrayList<T> arrayList;

    public Arreglo() {
        this.arrayList = new ArrayList<T>();

    }

    public void add(T t){
        this.arrayList.add(t);
    }

    public boolean exists(T t){
        return this.arrayList.contains(t);
    }


    public void showArreglo(){
        for(T t:this.arrayList){
            System.out.println(t);
        }
    }

    public T max(){
        T max = this.arrayList.get(0);
        for (T t:this.arrayList) {
            if(t.compareTo(max)>0)
                max = t;
        }
        return max;
    }

    public T min(){
        T min = this.arrayList.get(0);
        for (T t : this.arrayList) {
            if(t.compareTo(min)<0)
                min = t;
        }
        return min;
    }

    public T deleteLastElement(){
        T erased = this.arrayList.get(this.arrayList.size()-1);
        this.arrayList.remove(this.arrayList.size()-1);
        return erased;
    }
}