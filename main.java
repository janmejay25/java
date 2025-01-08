import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        System.out.println("enter age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("you can`t vote");
        }

    }
}
