
package com.beeva.app.spring.core.figures;

public class Triangulo implements Figura{
    
    int base;
    int altura;
    String name;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public int CalcularArea(){
    
        return base*altura/2;
    
    }
    
    
}
