
interface inter{
    public void display();
    final int var1 = 10;
}
interface inter1{
    public void message();
}
class A implements inter,inter1{
    public void display(){
        System.out.println("display method in class a");
    }
    public void message(){
        System.out.println("message method in class a");
    }
}
    
class B implements inter,inter1{
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
        // B obj1 = new B();
        obj.message();
        // A obj2 = new A();
        // obj2.display();
        System.out.println(obj.var1);
    }

}