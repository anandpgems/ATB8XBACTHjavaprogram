package extra;

import java.util.Scanner;

public class EX001 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter number- ");
        int a= sc.nextInt();
        System.out.println(a);


        if (a%2 == 0) {
                System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }



    }
}
