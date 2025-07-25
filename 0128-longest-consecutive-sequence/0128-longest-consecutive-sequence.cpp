class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if (nums.empty()) return 0;

        unordered_set<int> s(nums.begin(), nums.end());
        int best = 0;

        for (int x : s) {
            // Only start counting if x is the beginning of a sequence
            if (!s.count(x - 1)) {
                int cur = x;
                int len = 1;
                while (s.count(cur + 1)) {
                    cur++;
                    len++;
                }
                best = max(best, len);
            }
        }
        return best;
        
    }
};