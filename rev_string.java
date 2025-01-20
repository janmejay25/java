import java.util.Scanner;

public class rev_string {
    public static void main(String[] args) {
        StringBuilder rev = new StringBuilder();
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();

        //divide into two part and print second part
        String s1 = s.substring(len/2);
        System.out.println("second part of string is "+s1);

        //reverse the string
        for(int i = len-1;i>=0;i--){
            rev.append(s.charAt(i));
        }
        System.out.println("reverse string is "+rev);
        if(s.contentEquals(rev)){
            System.out.println("string is palindrome");
        }
        else{
                System.out.println("string is not palindrome");
            }

    }
}
