import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int counter = 0;
        // while (counter < 5) {
        //     System.out.println("hello ");
        //     counter ++ ;
            
        // }



        // int z = sc.nextInt();
        // int counter = 0 ;
        // while (counter <= z ) {
        //     System.out.print(counter + " ");
        //     counter ++;
        // }


        int n = sc.nextInt();
        int sum = 0;
        int i = 1 ;
        while (i <= n) {
            sum = sum + i ;
            i++;
        }
        System.out.println(sum);
        
    }
}
