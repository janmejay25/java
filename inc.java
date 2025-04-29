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
    }
}