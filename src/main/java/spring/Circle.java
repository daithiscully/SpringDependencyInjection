package spring;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    // Spring is using this setter for 'setter injection' to set the values
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Circle drawn with a radius of " + getRadius());
    }
}
