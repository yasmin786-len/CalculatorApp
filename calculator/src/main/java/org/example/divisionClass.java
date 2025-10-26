package org.example;

import org.springframework.stereotype.Component;

@Component
public class divisionClass {
    public void divide(int a,int b){
        System.out.println("Division of a/b is:" +(a/b));
    }
}
