package extra;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Ex002 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter any integer- ");
        int a= sc.nextInt();
        System.out.println(a);
        a=abs(a);
        System.out.println("Absolute value is " + -a);

    }
}
