class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int index = 0;
        int n = nums.size();

        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i=index;i<n;i++)
        {
            nums[i]=0;
        }

        for(int i=0;i<n;i++)
        {
            cout<<nums[i];
        }
        
    }
};