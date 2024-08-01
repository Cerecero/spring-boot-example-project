package com.cerecero.example;

//@Component

public class MyFirstClass {
    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "Hello from my First Class ==> myVar = "+myVar;
    }
}
