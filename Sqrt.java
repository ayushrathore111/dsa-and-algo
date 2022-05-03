
import java.util.*;
class Sqrt {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int a = sc.nextInt();
            // for round figure intger .....
           int ans  = (int)Math.sqrt(a);
           
            System.out.println(ans);
            t--;
        }
        
    }
}