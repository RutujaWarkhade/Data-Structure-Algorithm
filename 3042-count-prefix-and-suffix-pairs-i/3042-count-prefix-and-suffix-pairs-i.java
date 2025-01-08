import java.util.*;
class Solution {
    public boolean isPrefixAndSuffix(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
        if(l1>l2)
        {
            return false;
        }
        boolean prefix = str2.startsWith(str1);
        boolean suffix = str2.endsWith(str1);
        return prefix && suffix;
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count =0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(isPrefixAndSuffix(words[i],words[j] ))
                {
                    count++;
                }
            }
        }
        return count;
        
    }
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++)
        {
            words[i] = sc.next();
        }
        int result = countPrefixSuffixPairs(words);
        for(int i=0;i<words.length;i++)
        {
            System.out.print(words[i]);
        }

    }
}