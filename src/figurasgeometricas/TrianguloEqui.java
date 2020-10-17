package figurasgeometricas;



import PerimetroFIguras.CalPerimetroLineal;
import figurasgeometricas.AreaFiguras.CalAreaTrian;

/**
 *
 * @author Oscar
 */
public class TrianguloEqui extends FiguraGeometrica{

    public TrianguloEqui(double dimensiones[]) {
        super(dimensiones);
        calArea=new CalAreaTrian();
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
    }

    @Override
    public void mostrar() {
        System.out.println("triangulo Equilatero "+"lado: "+lado_1+" lado 2 "+lado_2+" posicion("+ubicacion.getX()+","+ubicacion.getY()+")"); 
    }

    @Override
    public double getLado2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
