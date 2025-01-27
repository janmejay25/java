class area_measure{
    public void area(int x,int y){
        System.out.println("Area of rectangle is "+x*y);
    }
    public void area(double r){
        System.out.println("Area of circle is "+3.14*r*r);
    }
}


public class area_overloading {
    public static void main(String[] args) {
        area_measure ob = new area_measure();
        ob.area(10,20);
        ob.area(4);

    }
}
