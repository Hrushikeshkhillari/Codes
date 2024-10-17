public class forloop {
    public static void main(String[] args) {
        

        // for(int i = 1 ; i <= 10 ; i ++ ){
        //     System.out.println(i + "  heloo " );
        // }
    



        // for (int i = 1 ; i<= 4 ; i++){
        //     System.out.println("****");
        // }

        // int n = 10899;
        // while (n > 0 ) {
        //     int  lastdigit = n % 10 ;
        //     System.out.print(lastdigit);
        //     n = n /10;
        // }
        // System.out.println();


        // int n = 10899; 
        // int rev = 0 ;
        // while (n > 0 ) {
        //     int lastdigit = n % 10 ;
        //     rev = (rev * 10 )+ lastdigit;
        //     n = n /10 ;
        // }
        // System.out.println(rev);




        // for (int i = 1; i <= 5; i++){
        //     for (int j = 1; j <= 5; j++){
        //         for ( int k = 1; k <= 5; k++){
                    
        //         }
        //         System.out.println();
        //     }
        //     System.out.println( );
        // }
        
        
        
        // int n = 5;
        // for (int  i = 1; i <=5 ; i++){
        //     for (int j= 1; j <=5-i+1; j++){
        //         System.out.print( "*");
        //     }
        //     System.out.println(" ");
        // }


        int n = 6;
        char ch = 'A';
        for(int i = 1; i <= n; i++){              //vraticali           // normal loop 
            for(int j =1; j <=i; j++){          // Horizantal
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}