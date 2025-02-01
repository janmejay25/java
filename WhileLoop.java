public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 3) {
                i++;
                continue; // Skip the rest of the loop when i is 3
            }
            System.out.println("Hello World " + i);
            i++;
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
        }
    }
}
