package extra;

import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter a number- ");
        int a= sc.nextInt();
        System.out.println(a);


        if(a>0){
            System.out.println("number is Positive");
        } else if(a<0) {
            System.out.println("number is Negative");
        } else if(a==0){
            System.out.println("Greatest number is Zero" );
        }



    }
}
