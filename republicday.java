import java.util*;
public class republicdayspecial{
    void printArray(int []a,int n){
        for(int i =0;i<n;i++) {
            System.out.println(a[i]);
        }

    }

    void bubbleSort(int []a,int n) {
        for(int i =0;i<n-1;i++)  {
            for(int j=0; j<n-1-i;j++) {
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }

            }

    }



    }
    public static void main(String[]args) {
        int [] a = {56,80,23,34,11,89,44,21,11,2,8};
        int n = 11;
        bubbleSort(a,n);
        printArray(a,n);

        }

}