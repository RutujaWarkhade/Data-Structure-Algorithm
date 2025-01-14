import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
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
        int val = sc.nextInt();
        int k = removeElement(nums, val);
        System.out.println(k);
        for(int i=0;i<n;i++)
        {
            if(i<k)
            {
                System.out.print(nums[i]+" ");
            }
            else
            {
                System.out.print("_"+" ");
            }
        }

    }
}