import java.util.*;
class Solution {
    public static int countSubarrays(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-2;i++)
        {
            if((nums[i] + nums[i+2] ) == (nums[i+1]/2.0))
            {
                count++;
            }
        }
        return count;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }

        System.out.print(countSubarrays(nums));
    }
}