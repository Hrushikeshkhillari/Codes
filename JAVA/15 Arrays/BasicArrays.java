import java.util.Scanner;

public class BasicArrays {

    public static void update(int marks[]) {
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       

// basic of array program
         int marks [] = new int [3];

        marks [0] = sc.nextInt(); 
        marks [1] = sc.nextInt();
        marks [2] = sc.nextInt();
        marks [3] = sc.nextInt();

        System.out.print("  phy :" + marks [0]);
        System.out.print("  chem :" + marks [1]);
        System.out.print("  Math :" + marks [2]);
        System.out.println(" not a vlue  " + marks [3]);

        // int parsantage = (marks [0] + marks [1] + marks [2] + marks [ 3]) / 3 ;
        // System.out.println("parsantage  : " + parsantage + "%");
        System.out.println(marks [3]);



      //  System.out.println( " length of array : " + marks.length );
    }
}



