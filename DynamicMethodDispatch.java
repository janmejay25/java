class Parent {
    void show() {
        System.out.println("Show method in Parent");
    }
}

class Child extends Parent {
 
    void show() {
        System.out.println("Show method in Child");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
