package org.example;

import org.springframework.stereotype.Component;

@Component
public class remainderClass {
    public void remainder(int a,int b){
        System.out.println("Remainder of a/b is:" +(a%b));
    }
}
