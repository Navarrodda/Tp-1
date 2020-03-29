package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generi<T extends Comparable>{

    private List<T> arreglo;

    public Generi(){
        arreglo = new ArrayList<T>();
    }
    public List<T> getArreglo()
    {
        return this.arreglo;
    }

    public void add(T data)
    {
        arreglo.add(data);
    }

    public void remove(T data)
    {
        arreglo.remove(data);
    }

    public T max()
    {
        T max = null;
        if (!arreglo.isEmpty())
        {
            max = arreglo.get(0);
            for (T array:
                    arreglo)
            {
                if(array.compareTo(max) == 1)
                {
                    max = array;
                }
            }
        }
        return max;
    }

    public T min()
    {
        T min = null;
        if (!arreglo.isEmpty())
        {
            min = arreglo.get(0);
            for (T array:
                    arreglo)
            {
                if(array.compareTo(min) == -1)
                {
                    min = array;
                }
            }
        }
        return min;
    }

    public boolean existe( T data )
    {
        boolean flag = false;
        for (T array:
                arreglo)
        {
            if(data.equals(array))
                flag = true;

        }
        return flag;
    }

    public T the_last_to_remover()
    {
        return arreglo.remove(arreglo.size()-1);
    }

    public String toString()
    {
        String cadena =  "Generic{";
        for (T celda: arreglo)
        {
            cadena = cadena.concat(" " + celda.toString() + ",");
        }
        cadena = cadena.concat(" }");
        return cadena;
    }

    public T another_max()
    {
        T max = null;
        if (!arreglo.isEmpty())
            max = ( T ) Collections.max(arreglo);
        return max;
    }

    public T another_min()
    {
        T min = null;
        if (!arreglo.isEmpty())
        {
            min = ( T ) Collections.min(arreglo);
        }
        return min;
    }

}
