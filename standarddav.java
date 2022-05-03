import java.util.*;
public class standarddav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5];
        for(int i=0;i<5;i++ ){
            arr[i] = sc.nextInt();
        }
        double ans = sd(arr);
        System.out.println(ans);
    }
    public static double sd(double arr[]){
        double sum = 0;
        double standarddav = 0;
        int length = arr.length;
        for(double num : arr){
            sum += num;
        }
        double mean = sum/length;
        for(double num : arr){
            standarddav = standarddav+ Math.pow(num - mean,2);
        }
        return Math.sqrt(standarddav/length);
        
    }
}
