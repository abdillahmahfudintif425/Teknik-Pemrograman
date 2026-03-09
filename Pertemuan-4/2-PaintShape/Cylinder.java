public class Cylinder extends Shape 
{ 
    private double radius;  //radius in feet 
    private double height;

   public Cylinder(double r, double h) 
   {   
      super("Cylinder"); 
      radius = r;
      height = h;
      
   } 
 
   public double area() 
   { 
       return height * Math.PI* radius * radius; 
   }
   
   public String toString() 
   { 
       return super.toString() + " of radius " + radius + " and of height" + height; 
   } 
 
}
