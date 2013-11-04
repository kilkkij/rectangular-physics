package logic;

public class Vector { 
    
    private double x;
    private double y;
    
    public Vector() {
        this.x = 0;
        this.y = 0;
    }
    
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void increment(Vector other) {
        x += other.getX();
        y += other.getY();
    }
    
    public double dot(Vector other) {
        return x*other.x + y*other.y;
    }

    public double distance(Vector other) {
        return Math.sqrt(
            Math.pow(getX() - other.getX(), 2) + 
            Math.pow(getY() - other.getY(), 2));
    }
        
    public Vector add(Vector other) {
        return new Vector(x + other.x, y + other.y);
    }
    
    public Vector substract(Vector other) {
        return new Vector(x - other.x, y - other.y);
    }
    
    public Vector multiply(double factor) {
        return new Vector(factor*x, factor*y);
    }
    
    public Vector flipY() {
        return new Vector(x, -y);
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
    
} 