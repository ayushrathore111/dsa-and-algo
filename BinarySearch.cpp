#include<iostream>

using namespace std;
//it is work only when the values are in increasing order or decreasingorder.....😱😱😱

int binarySearch(int arr[],int size, int key){
    int start = 0;
    int end = size - 1;
    int mid = start+ (end-start) / 2;
    while(start<=end){
        if(arr[mid]==key){
            return mid;
            }
    
        if(arr[mid]<key){
            start = mid + 1;

        }
        else{
            end = mid - 1;
        }
        mid = start+ (end-start) / 2;
        }
    return -1;
}


int main() {
    int arr[7]={29, 38, 56, 77, 88, 94, 220};
    int ans = binarySearch(arr, 7, 88);
    cout << "the index of 88 is:  " << ans << endl;
    return 0;
}
//complexicity O(logn) in 1000 elements binary seach takes 10 comparision and linear search takes 1000 comparisions...😱😱