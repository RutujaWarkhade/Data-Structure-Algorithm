import java.util.*;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
        
    }
    public void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.print(searchInsert(nums, target));
    }
}