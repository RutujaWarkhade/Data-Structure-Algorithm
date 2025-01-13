import java.util.*;
public class Solution{
    public static int removeDuplicates(int[] nums)
    {
        if(nums.length==0)
        {
            return 0;
        }
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter elements = ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int k = removeDuplicates(nums);
        System.out.println(k);
        for(int i=0;i<nums.length;i++)
        {
            if(i<k)
            {
                System.out.print(nums[i]+" ");
            }
            else
            {
                System.out.print("-"+" ");
            }
        }
        

    }
}