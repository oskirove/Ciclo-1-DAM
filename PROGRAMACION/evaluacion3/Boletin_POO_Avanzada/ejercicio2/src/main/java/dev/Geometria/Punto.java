package dev.Geometria;

public class Punto {
    public double x;
    public double y;

    public Punto(){
        y = 0;
        x = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y +")";
    }
    
}
