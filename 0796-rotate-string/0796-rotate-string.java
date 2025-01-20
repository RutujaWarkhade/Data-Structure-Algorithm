import java.util.*;

public class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if (n != goal.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            
            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(firstChar);

            if (sb.toString().equals(goal)) {
                return true;
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String goal = sc.nextLine();

        Solution solution = new Solution();
        boolean result = solution.rotateString(s, goal);
        System.out.println( result);

        sc.close();
    }
}
