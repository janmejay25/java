public class recursion {
    public static int factorial(int n){
        if (n == 0)  // Base case
        return 1;
    return n * factorial(n - 1);
        
    }
    public static void main(String[] args) {
      System.out.println(factorial(5));
    }
    
}
