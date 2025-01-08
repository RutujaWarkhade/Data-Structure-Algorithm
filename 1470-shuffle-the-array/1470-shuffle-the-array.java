import java.util.*;
public class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int index=0;
        for(int i=0;i<2*n;i++)
        {
            if(i%2==0)
            {
                result[i]=nums[index];
            }
            else
            {
                result[i]=nums[index+n];
                index++;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2*n];
        for(int i=0;i<2*n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int[] result = shuffle(nums,n);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}