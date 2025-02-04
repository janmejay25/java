public class try_catch {
    public static void main(String[] args) {

        try {
            int result = 10 / 0; // Change to 10 / 0 to trigger an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("This will always execute.");
        }
    }
}


