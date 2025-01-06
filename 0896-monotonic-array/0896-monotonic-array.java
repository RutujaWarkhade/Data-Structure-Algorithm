class Solution {
    public static boolean isMonotonic(int[] nums) {
        boolean increment = true;
        boolean decrement = true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                decrement = false;
            }
            if(nums[i]>nums[i+1])
            {
                increment = false;
            }
        }
        return increment||decrement;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }
        boolean result = isMonotonic(nums);
        System.out.print(result);
    }
}