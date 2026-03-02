public class Uji {
    public static void main(String[] args){
        Shape s1 = new Shape();
        System.out.println(
            s1.toString());
     
        Shape s2 = new Shape("Blue Dongker", true);
        System.out.println(s2.toString());
        
        s2.setColor("Red");
        s2.setFilled(false);
        System.out.println(s2.toString());
        System.out.println(s2.getColor() + " " +s2.isFilled() + "\n");
        
        Circle c1 = new Circle(7.0,"Black Jack", true);
        System.out.println(c1.toString());
        
        Rectangle r1 = new Rectangle(8.0, 3.0, "Maroon", true);
        System.out.println(r1.toString() + "\n");
        
        Square sq1 = new Square();
        System.out.println(sq1.toString());
        
        Square sq2 = new Square(5.0);
        System.out.println(sq2.toString());
        
        Square sq3 = new Square(8.0, "Grey", false);
        System.out.println(sq3.toString());
        
    }
}
