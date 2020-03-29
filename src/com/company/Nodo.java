package com.company;
import java.util.List;

public class Nodo<T> {

    private T data;
    private Nodo<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }


    public  Nodo(T data) {
        this.data = data;
    }
}