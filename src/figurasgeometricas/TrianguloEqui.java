package figurasgeometricas;



import PerimetroFIguras.CalPerimetroTriaEqui;
import figurasgeometricas.AreaFiguras.CalAreaTrian;

/**
 *
 * @author Oscar
 */
public class TrianguloEqui extends FiguraGeometrica{

    public TrianguloEqui(double lado_1, double lado_2) {
        super(lado_1, lado_2);
        calArea=new CalAreaTrian();
        calPerimetro=new CalPerimetroTriaEqui();

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
    }

    @Override
    public void mostrar() {
        System.out.println("triangulo Equilatero "+"lado: "+lado_1+" lado 2 "+lado_2+" posicion("+ubicacion.getX()+","+ubicacion.getY()+")"); 
    }
    
}
