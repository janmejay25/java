
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("enter string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" "+s.charAt(j));
            }
            System.out.println(" ");
        }
    }
}
//output
//enter string
//python
//  p
//  p y
//  p y t
//  p y t h
//  p y t h o
//  p y t h o n