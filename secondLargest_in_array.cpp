
#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
    int secondLargestElement(vector<int>& nums) {
        int n = nums.size();
        int largest = nums[0];
        int secLargest = -1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>largest)
            {
                secLargest = largest;
                largest = nums[i];
            }
            else
            {
                if(nums[i]<largest && nums[i]>secLargest)
                {
                    secLargest = nums[i];
                }
            }
        }
        return secLargest;
        
      
    }
};

int main()
{
    Solution s;
    int n ;
    cout<<"enter size of array : "<<endl;
    cin>>n;
    vector<int> nums(n);
    cout<<"enter array ele : ";
    for(int i=0;i<n;i++)
    {
        cin>>nums[i];
    }
    int a = s.secondLargestElement(nums);
    cout<<a;
}