package Formas.geoapp.console.simetrias;

import Formas.geoapp.console.Square;
import Formas.geoapp.console.Rectangle;
import java.util.Scanner;

public class Cuadrado{
    public static void main (String[] Args){
        int opcio = 0;
        double altura = 0;
        double side = 0;
        Scanner scan = new Scanner (System.in);
        do{
        System.out.println("Introduce una opcion de las siguientes \n 1.Square \n 2.Rectangle");
        opcio = scan.nextInt();
        }while(opcio < 1 || opcio > 4);
        switch(opcio){
            case 1:
                side = scan.nextDouble();
                Square c1 = new Square(side);
                c1.setSide(10.0);
                System.out.printf("El costat de c1: %.2f %n", c1.getSide());
                System.out.printf("L'area de c1: %.2f %n", c1.getArea());
                System.out.printf("El perimetre de c1: %.2f %n", c1.getPerimeter());
            case 2:
               Rectangle c2 = new Rectangle(side, altura);
               c2.setAltura(2.0);
               side = scan.nextDouble();
            case 3:
                
            case 4:
        }
        side = scan.nextDouble();
        
        Square c1 = new Square(side);
        c1.setSide(10.0);
        System.out.printf("El costat de c1: %.2f %n", c1.getSide());
        System.out.printf("L'area de c1: %.2f %n", c1.getArea());
        System.out.printf("El perimetre de c1: %.2f %n", c1.getPerimeter());
}
}