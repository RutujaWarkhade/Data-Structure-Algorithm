import java.util.*;
public class Solution {
    public static int[] sortedSquares(int[] nums) {

        int count = 0;
        int[] newarr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            newarr[count] = nums[i]*nums[i];
            count++;
        }


        for(int i=0;i<newarr.length;i++)
        {
            for(int j=i+1;j<newarr.length-1;j++)
            {
                if(newarr[i]>newarr[j])
                {
                    int temp = newarr[i];
                    newarr[i] = newarr[j];
                    newarr[j] = temp;
                }
            }
        }
        return newarr;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int[] result = sortedSquares(nums);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}