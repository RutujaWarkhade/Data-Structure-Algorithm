class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        

        // reverse whole string
        String rev = "";
        for (int i = n - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        String ans = "";

        for (int i = 0; i < n; i++) {

            if(rev.charAt(i)==' ')
            {
                continue;
            }

            String word = "";
            while (i < n && rev.charAt(i) != ' ') {
                word = word + rev.charAt(i);
                i++;
            }

            // reverse word
            String revWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }

            //this will remove first extra space come at starting
            if (ans.length() > 0) {
                ans = ans + " ";
            }
            ans = ans + revWord;
        }

        return ans;
    }
}
