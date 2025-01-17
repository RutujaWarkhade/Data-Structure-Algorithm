import java.util.*;
class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x!=0)
        {
            int digit = x%10;
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