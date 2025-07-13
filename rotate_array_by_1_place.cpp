#include<iostream>
#include<vector>
using namespace std;
class solution{
    public:
    void rotateArray(vector<int> &nums)
    {
        int n = nums.size();
        int temp = nums[0];
        for(int i=1;i<n;i++)
        {
            nums[i-1]=nums[i];
        }
        nums[n-1]=temp;
        for(int i=0;i<n;i++)
        {
            cout<<nums[i];
        }
    }


};
int main()
{
    solution s;
    int n ;
    cout<<"enter size of array : "<<endl;
    cin>>n;
    vector<int> nums(n);
    cout<<"enter array ele : ";
    for(int i=0;i<n;i++)
    {
        cin>>nums[i];
    }
    s.rotateArray(nums);
}