public class Cylinder extends Circle { // Save as "Cylinder.java"

    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        this.height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(radius)
        this.height = height;
    }
    
    public Cylinder(String warna, double radius, double height){
        super(radius, warna);
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    @Override
    public double getArea() {
        return (super.getArea()*2) + (super.getRadius() * 2 * Math.PI * height) ;
    }
    
    @Override
    public String toString(){
        return " Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
