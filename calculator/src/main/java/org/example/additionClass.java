package org.example;

import org.springframework.stereotype.Component;

@Component("addBean")
public class additionClass {
    public void add(int a,int b){
        System.out.println("addition of two numbers is: "+(a+b));
    }
}
