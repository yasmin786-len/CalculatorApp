package org.example;

import org.springframework.stereotype.Component;

@Component
public class multiply {
    public void product(int a,int b){
        System.out.println("product of a*b is:" +(a*b));
    }
}
