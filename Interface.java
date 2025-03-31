interface shape{
    void draw();
}
class Circle implements shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

public class Interface {
    public static void main(String[] args){
        shape circleShape = new Circle();
        shape rectangleShape = new Rectangle();
        circleShape.draw();
        rectangleShape.draw();
    }
    
}
