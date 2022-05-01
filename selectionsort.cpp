#include<iostream>

using namespace std;
// selection sorting... time complexicity = O(n^2) and space complexicity O(1);
void selectionsort(int arr[],int size){
    for (int i = 0; i < size- 1;i++){
        int minIndex = i;
        for (int j = i + 1; j < size;j++){
            if(arr[j]<arr[minIndex]){
                minIndex = j;
            }
        }
        swap(arr[minIndex], arr[i]);
    }
}

int main(){
    int arr[9] = {29, 72, 98, 13, 87, 66, 52, 51, 36};
    selectionsort(arr, 9);
    cout << "the sorted array is :\n";
    for (int i = 0; i < 9;i++){

        cout<< arr[i] << "  ";
    }
    return 0;
}
