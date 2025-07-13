#include<iostream>
#include<vector>
using namespace std;
class solution{
    public:
    void leftRotate(int k, vector<int>&nums)
    {
        int n = nums.size();
        k = k%n;
        vector<int> temp(k);
        for(int i=0;i<k;i++)
        {
            temp[i]=nums[i];
        }
        for(int i=k;i<n;i++)
        {
            nums[i-k]=nums[i];
        }
        for(int i=n-k;i<n;i++)
        {
            nums[i]=temp[i-(n-k)];
        }
        for(int i=0;i<n;i++)
        {
            cout<<nums[i];
        }
    }

};
int main()
{
    solution s;
    int n, k;
    cout<<"enter size of array : "<<endl;
    cin>>n;
    vector<int> nums(n);
    cout<<"enter array elements : "<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>nums[i];
    }
    cout<<"enter k : "<<endl;
    cin>>k;
    s.leftRotate(k, nums);
}



/*#include<bits/stdc++.h>
#include<vector>
using namespace std;
class solution{
    public:
    void leftRotate(int k, int n, int nums[])
    {
        reverse(nums, nums+k);
        reverse(nums+k,nums+n);
        reverse(nums, nums+n);

        for(int i=0;i<n;i++)
        {
            cout<<nums[i];
        }
    }

};
int main()
{
    solution s;
    int n, k;
    cout<<"enter size of array : "<<endl;
    cin>>n;
    int nums[n];
    cout<<"enter array elements : "<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>nums[i];
    }
    cout<<"enter k : "<<endl;
    cin>>k;
    s.leftRotate(k, n, nums);
}*/