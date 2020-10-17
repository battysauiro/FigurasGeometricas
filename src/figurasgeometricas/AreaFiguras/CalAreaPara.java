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
public class CalAreaPara implements FormaCalArea{

    @Override
    public double area(double arre[]) {
        return arre[0]*arre[1];
    }
    
}
