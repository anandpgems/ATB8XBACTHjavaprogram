package extra;

import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter angle One- ");
        int a= sc.nextInt();
        System.out.println(a);

        System.out.print("Enter angle two- ");
        int b= sc.nextInt();
        System.out.println(b);

        System.out.print("Enter angle three- ");
        int c= sc.nextInt();
        System.out.println(c);

        if(a+b+c==180){
            System.out.println("Triangle has correct angles" );
        } else {
            System.out.println("Triangle has incorrect  angles");
        }


    }
}
