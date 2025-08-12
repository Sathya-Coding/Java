abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }
public double getRadius(){

        return radius;
    }
    public void setRadius(double radius){
    this.radius=radius;
    }
    public void draw(){


        System.out.println("Drawing a circle with radius"+radius);
    }
}
public class oopsencapsulationandabstraction {
    public static  void main(String[]args){
        Circle c=new Circle(5.0);
        c.draw();
        System.out.println("Radius"+c.getRadius());
        c.setRadius(7.5);
        System.out.println("Updated radius"+c.getRadius());

        }
    }

