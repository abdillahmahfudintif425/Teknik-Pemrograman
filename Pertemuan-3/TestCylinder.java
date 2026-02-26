public class TestCylinder { // save as "TestCylinder.java"

    public static void main(String[] args) {

        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " luas permukaan=" + c3.getArea());
        
        Circle cir1 = new Circle(2.0);
        System.out.println("Circle:"
                + " radius=" + cir1.getRadius()
                + " luas lingkaran=" + cir1.getArea());
        
                
        Cylinder c4 = new Cylinder("ijo",2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c4.getRadius()
                + " height=" + c4.getHeight()
                + " base area=" + c4.getArea()
                + " color =" + c4.getColor()
                + c4.toString());
                
    }
    
}