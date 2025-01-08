package shivjava;
import java.util.*;

public class st1 {


    static void f1(int n){
        System.out.println("is prime or not");
        int b = 0 ;
        for(int i = 2 ; i * i <= n ; i++){
            int k = n % i ;

            if( n % i == 0  ){
                b++;
                System.out.println(k);
                System.out.println(i);
                break;

            }

        }
        if( b == 0){
            System.out.println("yes it is");
            System.out.println(b);
        }
        else {
            System.out.println("not prime");
            System.out.println(b);
        }
        return ;

    }

    static void f2(int l , int  h){
        for(int n = l ;  n <= h  ; n++){

            int c = 0;
            for(int div = 2 ; div * div <= n ; div++){
                if(n % div == 0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.println(" this is prime : " + n);
            }




        }


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
        int l = sc.nextInt();
        int h = sc.nextInt();
        f2(l , h);
    }


}
