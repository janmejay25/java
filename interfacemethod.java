
interface inter{
    public void display();
    public void message();
}
class A implements inter{
    public void display(){
        System.out.println("display method in class a");
    }
    public void message(){
        System.out.println("message method in class a");
    }
}
    
class B implements inter{
    public void display(){
        System.out.println("display method in class b");
    }
    public void message(){
        System.out.println("message method in class b");
    }
}
class interfacemethod{
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
        B obj1 = new B();
        obj1.message();
    }

}