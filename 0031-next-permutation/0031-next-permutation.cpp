class Solution {
public:
    void nextPermutation(vector<int>& nums) {
       int n = nums.size();
       int ind = -1;
       //find break point i.e grater ele but from back side
       for(int i=n-2;i>=0;i--)
       {
        if(nums[i]<nums[i+1])
       {
        ind = i;
        break;
       }
       }
       //if not found i.e ind=-1
       if(ind==-1)
       {
        reverse(nums.begin(),nums.end());
        return;
       }
    //if found then swap it
    for(int i=n-1;i>=0;i--)
    {
        if(nums[i]>nums[ind])
        {
            swap(nums[i], nums[ind]);
            break;
        }
    }
    //reverse array from ind+1 to n
    reverse(nums.begin()+ind+1, nums.end());
    }

};