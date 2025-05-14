class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Demo {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();  // Output: Drawing a circle

        
        
        s = new Rectangle();
        s.draw();  // Output: Drawing a rectangle
    }
}
