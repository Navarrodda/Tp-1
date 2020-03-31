package com.company;

import java.util.NoSuchElementException;

public class Pila<T>{
    private Nodo<T>First;
    public int quantity;

    public Pila() {
        quantity = 0;
    }

    public boolean its_empty()
    {
        return (quantity==0);
    }

    public void empty()
    {
        this.First=null;
        this.quantity=0;
    }

    public Nodo<T> getFirst() {
        return First;
    }


    public void push(T data) {
        if (First == null) {
            this.First = new Nodo<T>(data);
        } else {
            Nodo<T> prox = First;
            while (prox.getNext()!=null) {
                prox = prox.getNext();
            }
            prox.setNext(new Nodo<T>(data));
        }
        quantity++;
    }

    public int pop()
    {
        if(its_empty())
        {
            throw new NoSuchElementException("The battery is empty");
        }
        int fact =  (int) First.getData();
        return fact;
    }


    public void to_print() {
        Nodo travel = First;
        System.out.print("{");
        while (travel!=null) {
            System.out.print(travel.getData()+"," +
                    "");
            travel=travel.getNext();
        }
        System.out.print("}");
        System.out.println();
    }

    public int size()
    {
        Nodo<T> nex = First;
        Nodo<T> previous = First;
        int quantity = 0;
        while (nex != null) {
            quantity++;
            previous = nex;
            nex = nex.getNext();

        }
        return quantity;
    }


}
