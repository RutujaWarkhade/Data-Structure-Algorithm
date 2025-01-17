class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);     
    }
    public void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        System.out.print(strStr(haystack,needle));
    }
}