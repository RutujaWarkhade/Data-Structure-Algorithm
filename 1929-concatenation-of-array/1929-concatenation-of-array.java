import java.util.*;

public class Solution {
    public static int[] getConcatenation(int[] nums) {
        int[] newarray = new int[nums.length + nums.length];
        for (int i = 0; i < nums.length; i++) {
            newarray[i] = nums[i];
            newarray[i + nums.length] = nums[i];
        }

        return newarray;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = Solution.getConcatenation(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}