class x{
    public void myM1(){
        System.out.println("hello");
    }
}
class y extends x{
    public void myM2(){
        System.out.println("good morning");
    }
}
class z extends y{
    public void myM3(){
        System.out.println("how are you");
    }
}
public class multilevel{
    public static void main(String[] args){
        z obj = new z();
        obj.myM1();
        obj.myM2();
        obj.myM3();

    }
}
// ```
// Output:
// hello
// good morning
// how are you
// ```

