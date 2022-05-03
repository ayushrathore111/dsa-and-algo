import java.util.*;
class CodeChef {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        int b = sc.nextInt();
         int c = sc.nextInt();
          double x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
         double x2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
         System.out.printf("%6f\n", x1);
		System.out.printf("%6f\n", x2);
      
       
    }
}