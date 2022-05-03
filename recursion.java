import java.util.*;
public class recursion{
    public static int calcFxn( int n, int a, int b) {
        if(n==0) {
            return (a);
        }
        if(n==1) {
            return (b);
        }
       int n1 = calcFxn(n-1,a , b);
        int n2 = calcFxn(n-2,a , b);
        return n1^n2;
        
        
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         
        while(t>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int ans = calcFxn(n%3, a, b);
            System.out.println(ans);
             
          
            
            t--;
        }
        
    }
}