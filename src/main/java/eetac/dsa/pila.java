package eetac.dsa;

import exceptions.EmptyStackException;
import exceptions.FullStackException;


public class pila<E> implements Stack {

    Object[] s;

    int maxSize;
    int size;

    public pila(int maxSize){
        this.maxSize = maxSize;
        this.s = new Object[maxSize];
        this.size = 0;
    }

    @Override
    public void push(Object o) throws FullStackException {
        if (this.size == maxSize){
            throw new FullStackException();
        }
        else{
            this.s[size] = o;
            this.size += 1;
        }
    }

    @Override
    public Object pop() throws EmptyStackException {
        if (this.size != 0){
            this.size = this.size - 1;
            Object valor = this.s[size];
            return valor;
        }
        else{
            throw new EmptyStackException();
        }
    }

    @Override
    public Object peek() {
        return this.s[size-1];
    }

    @Override
    public int size() {
        return this.size;
    }
}
