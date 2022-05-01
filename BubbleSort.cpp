#include<iostream>

using namespace std;
//bubblesort time complexicity O(n^2)..and space complexicity O(1)
void bubbleSort(int arr[],int size){
    bool swaped = false;
    for (int i = 0; i < size-1;i++){
        for (int j = 0; j < size - i ;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swaped = true;
            }
        }
        if(swaped ==false){
            break;
        }
    }
}

int main(){
    int arr[6] = {10, 1, 7, 6, 14, 9};
    bubbleSort(arr, 6);
    for (int i = 0; i < 6;i++){

        cout<< arr[i] << "  ";
    }
    return 0;
}