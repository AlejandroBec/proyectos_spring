/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beeva.app.spring.core.utils;

import com.beeva.app.spring.core.figures.Figura;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author administradorcito
 */
public class Calculadora {
   
   
   Figura f;
   String name;
   String a;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calculadora(String name){
    
    this.name=name;
    
    
    }
   
  
   
   public Figura getF(){
   
       return f;
       
   
   }
    
   public void setF(Figura f){
   
        this.f=f;
          
   
   }
   public void saludo(){
   
       System.out.println("Hola!!!");
   
   }
   public void despedida(){
   
       System.out.println("Adios!!!");
   
   }
    
   public int suma(int a, int b){

        int rest = a+b;
        return rest;

}
   public int resta(int a, int b){

        int rest = a-b;
        return rest;

}

    
    
}
