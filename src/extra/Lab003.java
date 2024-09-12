package extra;

import java.util.Scanner;

public class Lab003 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.println(a);

        System.out.print("Enter second number- ");
        int b= sc.nextInt();
        System.out.println(b);

        System.out.print("Enter third number- ");
        int c= sc.nextInt();
        System.out.println(b);

        if((a>b) & (a>c)){
            System.out.println("Greatest number is" +a);
        } else if((b>a) & (b>c)) {
            System.out.println("Greatest number is" +b);
        } else {
            System.out.println("Greatest number is" +c);
        }



    }
}
