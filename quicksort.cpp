#include<iostream>

using namespace std;

int partition(int arr[],int s,int e){
    int pivot = arr[s];
    int count = 0;
    for (int i = s + 1; i <=e;i++){
        if(arr[i]<pivot){
            count++ ;
        }
    }
    int pivotidx = s + count;
    swap(arr[pivotidx], arr[s]);

    int i = 0;
    int j = e;
    while(i<pivotidx && j>pivotidx){
        while(arr[i]<=pivot){
            i++;
        }
        while(arr[j]>pivot){
            j--;
        }
        if(i<pivotidx && j>pivotidx){
            swap(arr[i], arr[j]);
        }
    
    }
    return pivotidx;
}

void quicksort(int arr[],int s, int e){
    if(s>=e){
        return;
    }
    int pivot = partition(arr,s,e);

    quicksort(arr, s, pivot - 1);
    quicksort(arr, pivot + 1,e);
}

int main(){
    int arr[7] = {6, 1, 4, 7, 2, 88, 22};
    quicksort(arr, 0, 6);

    for (int i = 0; i < 7; i++)
    {
        cout << arr[i] << "  ";
    }
    return 0;
}