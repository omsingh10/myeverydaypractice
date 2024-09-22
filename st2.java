package shivjava;
import java.util.*;

public class st2 {

    static void fb( int n){
        //fibonacci = 0 1 1 2 3 5 8 13 21
        int x = 0 ;
        int y = 1 ;
        int z = 0 ;


     for( int i = 0 ; i<= n ;i++ ){

         if(z < n-1) {
             z = x + y ;
             x = y;
             y = z;


             System.out.println(x);
         }




        }

    }

    static void count(int n){

        int c = 0 ;
        while(n != 0){

            n = n / 10 ;
             c++;

        }
        System.out.println(c);

    }



public  static void dig(int n){
    int rem = 0;


        while (n != 0){
         rem = n % 10 ;
           n = n / 10 ;

            System.out.println(rem);


        }




    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ro;

        int n = sc.nextInt();



        //fb(n);
        // count(n);
        dig(n);
    }

}
