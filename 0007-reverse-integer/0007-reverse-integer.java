import java.util.*;
class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x!=0)
        {
            int digit = x%10;
            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && digit>7))
            {
                return 0;
            }
            if(reverse < Integer.MIN_VALUE/10 || (reverse==Integer.MIN_VALUE/10 && digit<-8))
            {
                return 0;
            }
            
            reverse = reverse*10 + digit;
            x = x/10;
        }
        return reverse;  
    }
    public void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(reverse(x));  
    }
}