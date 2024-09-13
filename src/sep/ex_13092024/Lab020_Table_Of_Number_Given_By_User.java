package sep.ex_13092024;
import java.util.Scanner;

public class Lab020_Table_Of_Number_Given_By_User {

    public static void main(String[] Anand) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter number- ");
        int a= sc.nextInt();
        System.out.println("Table of " + a + " is as follows:" );
        System.out.println("_________________________________" );
        for( int i= 1; i <=10 ; i++)
    {
        System.out.println(a + "*" + i + "=" + a * i);
    }
        System.out.println("_________________________________" );
    }
}
