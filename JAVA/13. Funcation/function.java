import java.util.Scanner;

public class function {
    public static void helloworld(){
        System.out.println("hello5454655 ");     // functiion 
    }

    /////////


    public static void calculatesum ( int a, int b ){
        int sum = a + b;
        System.out.println(sum);


    }
    public static void main(String args[]){
      // helloworld();       // call the function


       /////

       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
        calculatesum();
        
    }
}
