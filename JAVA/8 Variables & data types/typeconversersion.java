import java.util.Scanner;

public class typeconversersion{
    public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // int sum = a + b + c / 3 ;

    //     System.out.println(sum);


    // int a = sc.nextInt();
    // int square = a * a ;
    // System.out.println("area of squre " + square );

    float pancil = sc.nextFloat();
    float pan = sc.nextFloat();
    float eraser = sc.nextFloat();

    float total = pancil + pan + eraser ;

    System.out.println("total cost is  "+ total);

    float  alltotal = total + (0.18f  * total );
    System.out.println("18 % gst is "+ alltotal);
    
} 
}
