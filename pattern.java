
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("enter string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //second method(copilot method)
        // for (int i = 1; i <= s.length(); i++) {
        //     System.out.println(s.substring(0, i));
        // }


        // for(int i=0;i<s.length();i++){
        //     for(int j = 0;j<=i;j++){
        //         System.out.print(" "+s.charAt(j));
        //     }
        //     System.out.println(" ");
        // }



        int even = 2;
        int odd = 1;
        for(int i = 1;i<=6;i++){
            for(int j = 1;j<=i;j++){
                if(i%2==1){System.out.println(odd+"");
                odd+=2;}
                else if(i%2==0){
                    System.out.println(even+"");
                    even+=2;
                }
            }
//            System.out.println();
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

//second method





