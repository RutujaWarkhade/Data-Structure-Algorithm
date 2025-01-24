import java.util.*;
public class Solution {
    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
            {
                return true;
            }
        }
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print(threeConsecutiveOdds(arr));

    }
}