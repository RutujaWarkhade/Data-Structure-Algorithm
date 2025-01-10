import java.util.*;
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0;i<n/2;i++)
        {
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
        return;
        
    }
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = new char[n];
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next().charAt(0);
        }

        reverseString(s);
        for(char c : s)
        {
            System.out.print(c+" ");
        }
        
    }
}