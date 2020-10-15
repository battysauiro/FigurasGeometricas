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
public class CalPerimetroLineal implements FormaCalPerimetro{

   

    @Override
    public double perimetro(double[] dimensiones) {
        double perimetro=0;
        for(double dim:dimensiones)perimetro+=dim;
        return perimetro;
    }
    
}
