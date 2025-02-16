//print numbers in decreasing order for three integer
import java.util.*;
public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        System.out.println("enter num3");
        int num3 = sc.nextInt();
        System.out.println("numbers are "+num1 +num2 +num3);
        if(num1>num2 && num1>num3){
            if(num2>num3){
            System.out.println(num1 +" " + num2+" "  + num3);
            }
            else{
                System.out.println(num1+" "  + num3+" "  + num2);
            }
        }
        if(num2>num1 && num2>num3){
            if(num1>num3){
            System.out.println(num2 +" " + num1+" "  + num3);
            }
            else{
                System.out.println(num2+" "  + num3 +" " + num1);
            }
        }
        if(num3>num1 && num3>num2){
            if(num1>num2){
            System.out.println(num3+" "  + num1+" " + num2);
            }
            else{
                System.out.println(num3+" "  + num2+" " + num1);
            }
        }
    }
}
//output 
// import java.util.Scanner;

// public class StringPyramid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input the string
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         // Print pyramid pattern
//         for (int i = 0; i < str.length(); i++) {
//             System.out.println(str.substring(0, i + 1));
//         }

//         sc.close();
//     }
// }
