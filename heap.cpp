#include<iostream>

using namespace std;


class heap{
    public:
        int arr[100];
        int size = 0;

        heap(){
            arr[0] = -1;
            size = 0;
        }
        void insert(int val){
            size++;
            int index = size;
            arr[index] = val;

            while(index>1){
                int parent = index / 2;
                if(arr[parent]<arr[index]){
                    swap(arr[parent], arr[index]);
                    index = parent;
                    }
                else{
                    return;
                    }
                }
            
        }

void print(){
    for (int i = 1; i <= size;i++){
        cout << arr[i] << " ";

    }
    cout << endl;
}
};
int main(){
    heap h;
    h.insert(3);
    h.insert(2);
    h.insert(5);
    h.insert(52);
    h.insert(54);
    h.insert(511);
    h.insert(325);
    h.insert(5343);
    h.print();

    return 0;
}