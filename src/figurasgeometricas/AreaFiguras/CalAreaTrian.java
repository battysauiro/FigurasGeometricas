/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas.AreaFiguras;

/**
 *
 * @author Oscar
 */
public class CalAreaTrian implements FormaCalArea{

    @Override
    public double area(double lado1, double lado2) {
        return (lado1*lado2)/2;
    }
    
}
