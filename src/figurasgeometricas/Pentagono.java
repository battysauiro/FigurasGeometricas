/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import PerimetroFIguras.CalPerimetroLineal;
import figurasgeometricas.AreaFiguras.CalAreaPoligonosRegulares;

/**
 *
 * @author Oscar
 */
public class Pentagono extends FiguraGeometrica {

    

    public Pentagono(double dimensiones[]) {
        super(dimensiones);
        calArea=new CalAreaPoligonosRegulares();
        calPerimetro=new CalPerimetroLineal();

    }

   @Override
    public double[] getLado1() {
        return dimensiones;
    }

    @Override
    public void setLado1(double[] lado1) {
        dimensiones=lado1;
    }

    @Override
    public double getLado2() {
        return lado_2;
    }

    @Override
    public void setLado2(double lado2) {
        lado_2=lado2;
    }

    

    @Override
    public void girar() {
        double lt=lado_1;
        lado_1=lado_2;
        lado_2=lt;
        mostrar();
    }

    @Override
    public void trasladar(Punto p) {
        ubicacion.setX(p.getX());
        ubicacion.setY(p.getY());
    }

    @Override
    public void escalar(double prop) {
        lado_1=lado_1*prop;
        lado_2=lado_2*prop;
    }

    @Override
    public void mostrar() {
        System.out.println("pentagono "+"lado: "+lado_1+" lado 2 "+lado_2+" posicion("+ubicacion.getX()+","+ubicacion.getY()+")"); 
    }    

   
    
    
}
