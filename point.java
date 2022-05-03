import java.util.Scanner;

public class point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t= sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            // CALCULATE THE POWER .....
            double power = Math.pow(0.143*n, n);
            // TO CONVERT IN TO INT...
            int x = (int)power;
            if(power-(int)power<0.5){
                System.out.println(+x);
            }
            else{
                System.out.println(+(x+1));
            }

            t--;

        }
    }
}
