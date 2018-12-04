package com;


import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cell<Car> cell=new Cell<Car>();
       // Cell<Car> cell=new Cell<Toyota>();//not working
        Cell<? super Toyota> cell=new Cell<Car>();
        cell.setT(new Toyota());
        cell.setT(new Corolla());
        Toyota toyota=(Toyota)cell.getT();
        Cell<? extends Toyota>cell2=new Cell<>();
        Toyota t = cell2.getT();
        Corolla c = (Corolla) cell2.getT();

//        List<? extends Toyota> list=(List<? extends Toyota>)arr;
//        for (Toyota toyota1:list) {
//            toyota1.equals(new Corolla());
//
//        }

    }
}
class Car{}
class Toyota extends Car{}
class Corolla extends Toyota{}
class Cell<T>{
    T t;
    public T getT() {return t;}
    public void setT(T t) {this.t = t;}
}