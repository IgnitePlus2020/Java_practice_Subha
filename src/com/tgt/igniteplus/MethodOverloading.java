package com.tgt.igniteplus;
/* Program to illustrate method overloading*/
public class MethodOverloading {

    void add(int a,int b)
    {   int sum=a+b;
        System.out.println("Sum of "+a+" + "+b+" = "+sum);
    }
    void add(int a,int b,int c)
    {   int sum=a+b+c;
        System.out.println("Sum of "+a+" + "+b+" + "+c+" = "+sum);
    }
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.add(1,2);
        m.add(1,2,3);
    }
    /*OUTPUT:
    Sum of 1 + 2 = 3
    Sum of 1 + 2 + 3 = 6
     */

}
