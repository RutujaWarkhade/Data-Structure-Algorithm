class Solution {
public:
    int lowerbound(vector<int>& nums, int target)
    {
        int n = nums.size();
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]==target)
            {
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return ans;
    }

    int upperbound(vector<int>& nums, int target)
    {
        int n = nums.size();
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;

            if(nums[mid]==target)
                {
                    ans = mid;
                    low = mid+1;
                }
            else if(nums[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return ans;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        int first = lowerbound(nums, target);
        if(first==-1)
        {
            return {-1, -1};
        }
        int last = upperbound(nums, target);
        return {first, last};
        
    }
};