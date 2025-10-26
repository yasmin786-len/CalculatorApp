package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        operatorsClass obj=(operatorsClass) context.getBean("parentBean");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        System.out.println("enter operator(+,-,/,*,%):");
        char ch=sc.next().charAt(0);

            switch (ch) {
                case '+':
                    obj.add(a, b);
                    break;
                case '-':
                    obj.subtract(a, b);
                    break;
                case '*':
                    obj.multiplytwo(a, b);
                    break;
                case '/':
                    obj.dividenum(a, b);
                    break;
                case '%':
                    obj.remainder(a, b);
                    break;
        }


    }
}