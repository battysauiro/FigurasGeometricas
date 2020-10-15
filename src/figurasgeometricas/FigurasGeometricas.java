/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Oscar
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------Rectangulo---------");
        Punto p=new Punto();
        p.setX(4);
        p.setY(5);
        FiguraGeometrica rec= new Rectangulo(4,6);
        rec.ubicacion=p;
        
        rec.trasladar(p);
        //rec.setLado1(4);
        //rec.setLado2(6);
        System.out.println("area: "+rec.CalculoArea());
        System.out.println("perimetro: "+rec.CalculoPerimetro());
        rec.mostrar();
        
        System.out.println();
        System.out.println("------circulo---------");
        Punto p2=new Punto();
        p2.setX(1);
        p2.setY(7);
        FiguraGeometrica cir= new Circulo(3,3);
        cir.ubicacion=p;
        cir.trasladar(p);
        //cir.setLado1(3);
        //cir.setLado2(12);
        System.out.println("area: "+cir.CalculoArea());
        System.out.println("perimetro: "+cir.CalculoPerimetro());
        cir.mostrar();
        System.out.println();
        System.out.println("------Triangulo Equilatero---------");
        Punto p3=new Punto();
        p3.setX(12);
        p3.setY(6);
        FiguraGeometrica tri= new TrianguloEqui(5,4);
        tri.ubicacion=p3;
        tri.trasladar(p3);
        //tri.setLado1(5);
        //tri.setLado2(4);
        System.out.println("area: "+tri.CalculoArea());
        System.out.println("perimetro: "+tri.CalculoPerimetro());
        tri.mostrar();
        System.out.println();
        System.out.println("------Triangulo Rectangulo---------");
        Punto p4=new Punto();
        p4.setX(3);
        p4.setY(1);
        FiguraGeometrica triRec= new TrianguloRec(3,4);
        triRec.ubicacion=p4;
        triRec.trasladar(p4);
        //tri.setLado1(5);
        //tri.setLado2(4);
        System.out.println("area: "+triRec.CalculoArea());
        System.out.println("perimetro: "+triRec.CalculoPerimetro());
        triRec.mostrar();
        
        System.out.println();
        System.out.println("------Cuadrado---------");
        Punto p5=new Punto();
        p5.setX(3);
        p5.setY(1);
        FiguraGeometrica cuadrado= new Cuadrado(5,5);
        cuadrado.ubicacion=p5;
        cuadrado.trasladar(p5);
        System.out.println("area: "+cuadrado.CalculoArea());
        System.out.println("perimetro: "+cuadrado.CalculoPerimetro());
        cuadrado.mostrar();
        
        System.out.println();
        System.out.println("------Paralelogramo---------");
        Punto p6=new Punto();
        p6.setX(4);
        p6.setY(7);
        FiguraGeometrica paralelogramo= new Paralelogramo(4,2);
        paralelogramo.ubicacion=p6;
        paralelogramo.trasladar(p6);
        System.out.println("area: "+paralelogramo.CalculoArea());
        System.out.println("perimetro: "+paralelogramo.CalculoPerimetro());
        paralelogramo.mostrar();
        
        System.out.println();
        System.out.println("------Elipse---------");
        Punto p7=new Punto();
        p7.setX(4);
        p7.setY(14);
        FiguraGeometrica elipse= new Elipse(3,2);
        elipse.ubicacion=p7;
        elipse.trasladar(p7);
        System.out.println("area: "+elipse.CalculoArea());
        System.out.println("perimetro: "+elipse.CalculoPerimetro());
        elipse.mostrar();
        
        System.out.println();
        System.out.println("------Rombo Regular---------");
        
        p7.setX(4);
        p7.setY(14);
        FiguraGeometrica rombo= new RomboRegular(3,2);
        rombo.ubicacion=p7;
        rombo.trasladar(p7);
        System.out.println("area: "+rombo.CalculoArea());
        //System.out.println("perimetro: "+rombo.CalculoPerimetro());
        elipse.mostrar();
        
    }
    
}




