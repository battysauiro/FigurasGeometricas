/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import PerimetroFIguras.CalPerimetroLineal;
import figurasgeometricas.AreaFiguras.CalAreaPara;

/**
 *
 * @author Oscar
 */
public class  Rectangulo extends FiguraGeometrica{

    public Rectangulo(double lado_1, double lado_2,double dimensiones[]) {
        super(lado_1, lado_2,dimensiones);
        calArea=new CalAreaPara();
        calPerimetro=new CalPerimetroLineal();

    }

    @Override
    public double getLado1() {
        return lado_1;
    }

    @Override
    public void setLado1(double lado1) {
        lado_1=lado1;
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
    public void girar(char direccion) {
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
        System.out.println("rectangulo "+"lado: "+lado_1+" lado 2 "+lado_2+" posicion("+ubicacion.getX()+","+ubicacion.getY()+")"); 
    }
    
}
