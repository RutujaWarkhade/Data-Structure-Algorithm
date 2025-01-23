import java.util.*;
class Solution {
    public static boolean isBalanced(String num) {
        int sume=0;
        int sumo=0;
        for(int i=0;i<num.length();i++)
        {
            int integer = num.charAt(i)-'0';//convert character to integer
            if(i%2==0)
            {
                sume = sume+integer;
            }
            else
            {
                sumo = sumo+integer;
            }
        }
        if(sume==sumo)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        System.out.print(isBalanced(num));
    }
}