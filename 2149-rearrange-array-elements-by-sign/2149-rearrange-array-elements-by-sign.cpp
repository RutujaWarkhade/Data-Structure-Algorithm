class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {

        int n = nums.size();
        vector<int> ans(n);
        int posindex = 0;
        int negindex = 1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                ans[posindex] = nums[i];
                posindex+=2;
            }
            else
            {
                ans[negindex] = nums[i];
                negindex+=2;
            }
        }
        return ans;
    }
    };
        /*int n = nums.size();
        vector<int> pos(n/2);
        vector<int> neg(n/2);
        int j=0 , k=0 ;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                pos[j]=nums[i];
                j++;
            }
            else
            {
                neg[k] = nums[i];
                k++;
            }
        }
        for(int i=0;i<n/2;i++)
        {
            nums[2*i]=pos[i];
            nums[(2*i)+1]=neg[i];
        }
        return nums;
        
    */

