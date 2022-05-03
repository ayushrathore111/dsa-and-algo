import java.util.*;


public class Sumofdigit {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int a = sc.nextInt();
            int sum =0;
            while(a>0) {
                sum = sum +a%10;
                a = a/10;
            }
            System.out.println(sum);
            
        }
   
       }
    }

