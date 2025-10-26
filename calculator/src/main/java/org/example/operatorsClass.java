package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("parentBean")
public class operatorsClass {
    @Autowired
    private additionClass addition;
    @Autowired
    private subtractionClass subtraction;
    @Autowired
    private divisionClass divid;
    @Autowired
    private multiply into;
    @Autowired
    private remainderClass rem;

    public void subtract(int a,int b){
        System.out.println("subtraction is: " + (a-b));
    }
    public  void add(int a,int b){
        addition.add(a,b);
    }
    public void multiplytwo(int a,int b){
        into.product(a,b);
    }
    public void dividenum(int a,int b){
        divid.divide(a,b);
    }
    public void remainder(int a,int b){
        rem.remainder(a,b);
    }
}
