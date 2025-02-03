import java.util.Scanner;
public class Solution {
    public static int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];
        for (char c : allowed.toCharArray()) {
            allowedChars[c - 'a'] = true;
        }

        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;

            for (char c : word.toCharArray()) {
                if (!allowedChars[c - 'a']) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allowed = scanner.next();

        int n = scanner.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        int result = countConsistentStrings(allowed, words);
        System.out.println(result);
    }
}
