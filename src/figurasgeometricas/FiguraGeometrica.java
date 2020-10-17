/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import PerimetroFIguras.FormaCalPerimetro;
import figurasgeometricas.AreaFiguras.FormaCalArea;

/**
 *
 * @author Oscar Aragon Garcia 
 * clase abstracta que contiene los metodos basicos de una figura geometrica 
 */
public abstract class FiguraGeometrica {
    protected double lado_1;
    protected double lado_2;
    protected double dimensiones[];//guardara todos los lados de cada figura 
    protected Punto ubicacion;
    protected FormaCalArea calArea;
    protected FormaCalPerimetro calPerimetro;
    public FiguraGeometrica(double dimensiones[]){
        this.lado_1=lado_1;
        this.lado_2=lado_2;
        this.dimensiones=dimensiones;
        
    }
    public abstract double[] getLado1();
    public abstract void setLado1(double lado1[]);
    public abstract double getLado2();
    public abstract void setLado2(double lado2);

    public double CalculoArea(){
        return calArea.area(dimensiones);
    }
    public double CalculoPerimetro(){
        return calPerimetro.perimetro(dimensiones);
    }
    public abstract void girar();
    public abstract void trasladar(Punto p);
    public abstract void escalar(double prop);
    public abstract void mostrar();
}
