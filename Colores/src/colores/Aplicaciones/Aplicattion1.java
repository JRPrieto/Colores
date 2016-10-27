package colores.Aplicaciones;

import colores.Colores;
//import colores.Square;//no se esta usando aun

public class Aplicattion1 {
    public static void main(String[] args) {
        int red = 125;
        int blue = 125;
        int green = 120;
     Colores col = new Colores(red , green , blue);
     System.out.printf("col -> r: %d g: %d b: %d %n", col.getRed(), col.getGreen(), col.getBlue());
     System.out.printf("Colors creats: %d %n", Colores.getCounter());
     System.out.printf("col -> %s %n", col.toHexString(true));
     System.out.printf("col -> %s %n%n", col.toHexString(false));
     System.out.printf("col -> %s %n%n", col.toHexString());
     System.out.printf("col -> %s %n%n", col.toRGB(true));
     System.out.printf("col -> %s %n%n", col.toRGB(false));
     System.out.printf("col -> %s %n%n", col.toRGB());
     
     Colores col2 = Colores.fomHexString("#FFFFFF");
     System.out.printf("col -> r: %d g: %d b: %d %n", col2.getRed(), col2.getGreen(), col2.getBlue());
     System.out.printf("Colors creats: %d %n", Colores.getCounter());
    
     Colores col3 = Colores.getRandom();
     System.out.printf("col -> r: %d g: %d b: %d %n", col3.getRed(), col3.getGreen(), col3.getBlue());
     System.out.printf("Colors creats: %d %n", Colores.getCounter());
    }

}
