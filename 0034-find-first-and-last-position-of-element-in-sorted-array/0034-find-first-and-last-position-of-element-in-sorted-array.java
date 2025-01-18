import java.util.*;
class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        // find first occurence
        for(int i=0;i<nums.length;i++)
        {
            if(target == nums[i])
            {
                first = i;
                break;
            }
        }
        //find last occurence
        for(int i=nums.length-1;i>=0;i--)
        {
            if(target==nums[i])
            {
                last = i;
                break;
            }
        }
        //if not found then print [-1, -1]
        if(first==-1)
        {
            return new int[]{-1,-1};
        }
        return new int[]{first, last};
        
    }
    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = searchRange(nums, target);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}