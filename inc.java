class logical{
    int x= 5;
    int y= 10;
    
    boolean result =(x>4)||(y<11);
    boolean not2 = !(x>4);
}
class inc{
    public static void main(String[] args){
        int a;
        int b;
        a = 5;
        b = a++;
        System.out.println("a = " + a); // 6
        System.out.println("b = " + b); // 5
        a = 5;
        b = ++a;
        System.out.println("a = " + a); // 6
        System.out.println("b = " + b); // 6


        logical not = new logical();
        System.out.println(not.result); // 5
        System.out.println(not.not2); // false
    }
}