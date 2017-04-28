/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beeva.app.figures;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author administradorcito
 */
@Component
public class Triangulo implements Figura {

    @Value("${name}")
    String name;

    @Value("${altura}")
    int altura;

    @Value("${base}")
    int base;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int area(){

        return (base * altura)/2;

    }
    @Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", name=" + name + "]";
	}

}
