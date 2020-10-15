/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerimetroFIguras;

/**
 *
 * @author Oscar
 */
public class CalPerimetroCirculo implements FormaCalPerimetro{

    @Override
    public double perimetro(double[] dimensiones) {
        return 2*Math.PI*Math.sqrt((Math.pow(dimensiones[0], 2)+Math.pow(dimensiones[1], 2))/2);
    }
    
}
