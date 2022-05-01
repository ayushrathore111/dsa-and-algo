#include<iostream>

using namespace std;
//space complexicity O(1) and time complexicity O(n^2)....
void InsertionSort(int arr[],int n){
    for (int i = 1; i < n;i++){
        int min = arr[i];
        int j = i - 1;
        for (;j >= 0;j--){
            if (arr[j] > min)
            {
                arr[j + 1] = arr[j];
            }
            else{
                break;
            }
        }
        arr[j + 1] = min;
    }
}

int main(){
    int arr[8] = {8, 2, 6, 1, 5, 3, 7, 9};
    InsertionSort(arr, 8);
    cout << "the sorted array is :\n";
    for (int i = 0; i < 8;i++){
        cout<< arr[i] << "  ";
    }
    return 0;
}