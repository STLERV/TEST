package com.company;

public class QueueImp<C> implements Queue<C> {

    private C[] cola;
    private int max;
    private int ocupado;



    public QueueImp(int size){

        cola = (C[]) new Object[size];
        this.max = size;
        this.ocupado = 0;

    }



    public void push(C c) {


        if(this.ocupado != max){

            this.cola[ocupado] = c;
            this.ocupado++;
            System.out.println(" OK");
        }else{

            System.out.println("Cola llena");
        }

    }


    public C pop() {

        if(this.ocupado == 0){
            System.out.println("Cola Vacia");
            return null;
        }else{

            this.ocupado--;
            System.out.println("A la basura");
            return cola[ocupado];

        }

    }


    public int size() {

        return this.ocupado;
    }
}