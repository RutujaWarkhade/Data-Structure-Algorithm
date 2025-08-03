/*
Implement the problem of movie all zeros to the end of the array:

given an array of random no's push all zeros of an array to end of an array

*/


#include <iostream>
#include <vector>
using namespace std;

void merge(vector<int>& arr, int left, int mid, int right) {
    vector<int> temp;

    for (int i = left; i <= mid; i++) {
        if (arr[i] != 0) temp.push_back(arr[i]);
    }
    for (int i = mid + 1; i <= right; i++) {
        if (arr[i] != 0) temp.push_back(arr[i]);
    }

    int total = right - left + 1;
    while (temp.size() < total) {
        temp.push_back(0);
    }

    for (int i = 0; i < total; i++) {
        arr[left + i] = temp[i];
    }
}

void mergeSortMoveZeros(vector<int>& arr, int left, int right) {
    if (left >= right) return;

    int mid = left + (right - left) / 2;
    mergeSortMoveZeros(arr, left, mid);
    mergeSortMoveZeros(arr, mid + 1, right);
    merge(arr, left, mid, right);
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Enter " << n << " elements:\n";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    mergeSortMoveZeros(arr, 0, n - 1);

    cout << "Array after moving all zeros to the end:\n";
    for (int num : arr) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}


/*#include<iostream>
using namespace std;
class solution{
    public:
    void MoveZeros(int n,int arr[])
    {
        int index = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
        }

        for(int i =index;i<n;i++)
        {
            arr[i]=0;
        }
        
        for(int i=0;i<n;i++)
        {
            cout<<arr[i];
        }
    }
};

int main()
{
    solution s;
    int n;
    cout << "Enter size of array: ";
    cin >> n;

    int arr[n];
    cout << "Enter array elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

   
    s.MoveZeros(n, arr);
    return 0;
}*/