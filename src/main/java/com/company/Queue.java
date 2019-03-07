package com.company;

public interface Queue<C>{

    void push(C c);
    C pop();
    int size();
}
