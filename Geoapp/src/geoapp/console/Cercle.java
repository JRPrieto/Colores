package geoapp.console;


public class Cercle {
   //<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
    private double side;
    
    //</editor-fold>
    //<editor-fold defaultstate="collpased" desc="Comportament: Mètodes">
    public double getSide(){
       return side;
    }
    public void setSide(double side){
        if(side <= 0.0){
            throw new IllegalArgumentException(
                String.format("Valor %f no valid.", side));
        }
        this.side = side;
    }
    public double getPerimeter(){
        return getSide() * 4;
    }
    public double getArea(){
        return Math.pow(getSide(), 2);
    }
    public Cercle(double side){
    this.setSide(side);
}
    //</editor-fold>
    
}
