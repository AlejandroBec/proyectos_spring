/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beeva.app.calculadora;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.beeva.app.figures.Figura;

@Component
public class Calculadora {
    
	@Value("${name}")
	String nombre;
	
	@Autowired
	@Qualifier("triangulo")
	Figura f;
	
	public Calculadora() {
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Figura getF() {
		return f;
	}

	public void setF(Figura f) {
		this.f = f;
	}
	
	public Calculadora(String nombre) {
		this.nombre = nombre;
	
        }
        
           public int suma(int a, int b){

        int rest = a+b;
        return rest;

}
   public int resta(int a, int b){

        int rest = a-b;
        return rest;

}
   public void pascal(int pasc){
    
    
     System.out.println("Triangulo de pascal \n\n\n");

        int[] a = new int[1];

        int arrg = pasc;

        for (int i = 1; i <= arrg; i++) {

            int[] x = new int[i];

            for (int j = 0; j < i; j++) {

                if (j == 0 || j == (i - 1)) {
                    x[j] = 1;

                } else {
                    x[j] = a[j] + a[j - 1];

                }

                System.out.print(x[j] + " ");
            }
            a = x;
            System.out.println("");
        }
    
    
    }
    
        
}
