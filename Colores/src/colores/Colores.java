package colores;

import java.util.Random;
/**
 *
 * @author alumne
 */
public class Colores {
    //<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
    public static final int MAX_VALUE=255;
    public static final int MIN_VALUE=0;
    private static int counter = 0;
    private int red;
    private int green;
    private int blue;
    //</editor-fold>
    //<editor-fold defaultstate="collpased" desc="Comportament: Mètodes">
    public int getRed(){
        return red;
    }
    public void setRed(int red){
        if(red< 0 || red > 255){
            throw new IllegalArgumentException(
            String.format("Valor %d no valido para la cordenada R", red));
        }
        this.red = red;
    }
    
    public int getGreen(){
        return green;
    }
    public void setGreen(int green){
        if(green< 0 || green > 255){
            throw new IllegalArgumentException(
            String.format("Valor %d no valido para la cordenada G", green));
        }
        this.green = green;
    }
    
    public int getBlue(){
        return blue;
    }
    public void setBlue(int blue){
        if(blue< 0 || blue > 255){
            throw new IllegalArgumentException(
            String.format("Valor %d no valido para la cordenada B", blue));
        }
        this.blue = blue;
    }
    public static int getCounter(){
        return counter;
    }
        public String toRGBString(){
        throw new UnsupportedOperationException("Not yet implemented!");
    }
    public String toHexString(boolean upper){
        return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x", 
                getRed(), getGreen(), getBlue());
    }
    public String toHexString(){
        return toHexString(true);
    }
    public String toRGB(boolean upper){
        return String.format(upper ? "RGB(%d,%d,%d)" : "rgb(%d,%d,%d)", getRed(), getGreen(), getBlue());
    }
    public String toRGB(){
        return toRGB(false);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collpased" desc="Comportament: Constructores">
    public Colores (int red, int green, int blue){
        counter++;
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }
    public Colores(){
        this(MIN_VALUE, MIN_VALUE, MIN_VALUE);
    }
    public static Colores fomHexString(String color){
        if (color == null){
            throw new NullPointerException("Es obligatori indicar una "
                    + "cadena de text");
        }
        if(!color.matches("^#[0-9A-Fa-f]{6}$")){
            throw new IllegalArgumentException(String.format("El text %s no te format hexadecimal", color));
        }
        return new Colores(Integer.parseInt(color.substring(1, 3), 16),
                           Integer.parseInt(color.substring(3, 5), 16),
                           Integer.parseInt(color.substring(5, 7), 16));
    }
    
    public static Colores getRandom(){
        Random rand = new Random();
        return new Colores(rand.nextInt(256),  rand.nextInt(256),  rand.nextInt(256)) ;
    }
    //</editor-fold>
    
}
