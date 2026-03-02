public class Square extends Rectangle {
    
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide(){
        if(super.getLength() != super.getWidth()){
            return 0;
        }
        return super.getLength();
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public String toString(){
        return "Square[" + super.toString()+ "]";
    }
    
    @Override
    public double getArea(){
        return getSide()*getSide();
    }
    
    @Override
    public double getPerimeter(){
        return 4 * getSide();
    }
    
}
