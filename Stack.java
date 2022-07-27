package com;

import java.sql.SQLOutput;

public class stack {
    static final int MAX = 1000;
    static int top = 0;
    static int[] st = new int[MAX];

    static void push(int a){
        if(top > MAX){
            System.out.println("Stack Overflow");
        }
        else{
            st[top++] = a;
        }

    }

    static void pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
        }
        int a = st[--top];
        System.out.println("Element is " + a);
    }

    public static void main(String[] args) {
        stack s = new stack();
        stack s2 = new stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s2.push(40);
        s2.push(50);
        for(int i=0; i<top; ++i)
            System.out.println(st[i]);
        s.pop();
        s.pop();
        for(int i=0; i<top; ++i)
            System.out.println(st[i]);
    }
}
