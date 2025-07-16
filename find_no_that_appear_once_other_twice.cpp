#include<iostream>
#include<vector>
using namespace std;
class solution{
    public:
    int countOnes(vector<int>&nums)
    {
        
        int n=nums.size();
        if(n%2==0)
        {
        cout<<"invalid input"<<endl;
        return -1;
        }
        for(int i=0;i<n;i++)
        {
            int count =0;
            int num = nums[i];
            for(int j=0;j<n;j++)
            {
                if(nums[j]==num)
                {
                    count++;
                }
            }
             if(count==1)
            {
                return num;
            }
        }
    }
};
int main()
{
    solution s;
    int n;
    cout<<"enter size of array : "<<endl;
    cin>>n;
    vector<int> nums(n);
    cout<<"enter array elements :"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>nums[i];
    }
    int a = s.countOnes(nums);
    cout<<a;
}
