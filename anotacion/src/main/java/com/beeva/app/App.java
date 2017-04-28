package com.beeva.app;

import com.beeva.app.calculadora.Calculadora;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Main
 *
 */
public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"bean.xml"});
        Calculadora c = context.getBean("calculadora", Calculadora.class);

        System.out.println("\nArea es: "+c.getF().area());
        
        int arr=Integer.parseInt(args[0]);
        
        c.pascal(arr);
        
        for (int i = 0; i < args.length; i++) {

            System.out.println(i + ">>>" + args[i]);

        }
        if (args[1].compareTo("suma") == 0) {

            System.out.println("resultado = " + c.suma(Integer.parseInt(args[2]), Integer.parseInt(args[3])));

        } else if (args[1].compareTo("resta") == 0) {

            System.out.println("resultado = " + c.resta(Integer.parseInt(args[2]), Integer.parseInt(args[3])));

        } else {

            System.out.println("Nope");
        }
        
        
        ((AbstractApplicationContext) context).close();

    }
}
