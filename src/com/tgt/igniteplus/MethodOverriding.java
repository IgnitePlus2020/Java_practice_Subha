package com.tgt.igniteplus;
/* Program to illustrate method overriding*/
class Parent
{
    void show()
    {
        System.out.println("Parent class");
    }
}
class Child extends Parent
{
    void show()
    {
        System.out.println("Child class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Child x=new Child();
        Parent y=new Child();
        Parent z=new Parent();
        x.show();
        y.show();
        z.show();
    }
}
/*OUTPUT:
Child class
Child class
Parent class
 */
