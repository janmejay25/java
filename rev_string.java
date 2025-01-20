import java.util.Scanner;

public class rev_string {
    public static void main(String[] args) {
        String rev = "";
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        for(int i = len-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("reverse string is "+rev);
        if(s.equals(rev)){
            System.out.println("string is palindrome");
        }
        else{
                System.out.println("string is not palindrome");
            }

    }
}
