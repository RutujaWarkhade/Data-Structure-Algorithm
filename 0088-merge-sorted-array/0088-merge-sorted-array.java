import java.util.*;
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged[] = new int[m+n];
        int idx1 = 0;
        int idx2 = 0;
        int x =0;

        //merged both array elements
        while(idx1<m && idx2<n)
        {
            if(nums1[idx1]<=nums2[idx2])
            {
                merged[x++] = nums1[idx1++];
            }
            else
            {
                merged[x++] = nums2[idx2++];
            }
        }

        //merged remaning element of nums1 array
        while(idx1<m)
        {
            merged[x] = nums1[idx1];
            x++;
            idx1++;
        }

        //merged remaining element of nums2 array
        while(idx2<n)
        {
            merged[x] = nums2[idx2];
            x++;
            idx2++;
        } 

        //copy merged array back into nums1 array
        int count =0;
        for(int i=0;i<merged.length;i++)
        {
            nums1[count] = merged[i];
            count++; 
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        for(int i=0;i<m;i++)
        {
            nums1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);
        for(int i=0;i<m+n;i++)
        {
            System.out.print(nums1[i]+" ");
        }
        
    }
}