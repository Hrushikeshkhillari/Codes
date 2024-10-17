import java.util.Scanner;

public class contnuestatement {
    public static void main(String[] args) {
        // for (int i = 1 ; i <= 5 ; i ++ ){
        //     if ( i == 3 ){  // 3 is skip heare 
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        Scanner  sc = new Scanner(System.in);

        do {
            System.out.print( " enter your number :");
            int n = sc.nextInt();
            if (n % 10 == 0 ) {
                continue;
            }
            System.out.println(" number is : "+ n);
        } while ( true);
    }
    
}
