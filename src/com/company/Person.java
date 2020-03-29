package com.company;
import java.util.Objects;
public class Person implements Comparable{
    private String name;
    private String last_name;
    private int ege;

    public Person(String name, String last_name, int ege) {
        this.name = name;
        this.last_name = last_name;
        this.ege = ege;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }



}
