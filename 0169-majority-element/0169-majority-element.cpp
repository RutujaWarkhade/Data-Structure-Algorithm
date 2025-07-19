class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        int n = nums.size();
        int count = 0;
        int ele = INT_MIN;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count=1;
                ele = nums[i];
            }
            else if(nums[i]==ele)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==ele)
            {
                count++;
            }
        }
        if(count>(n/2))
        {
            return ele;
        }
        return -1;
        
    } 
};