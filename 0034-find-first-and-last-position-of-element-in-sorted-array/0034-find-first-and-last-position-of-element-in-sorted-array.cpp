class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int first = firstPos(nums, target);
        if (first == -1) return {-1, -1};          // not found at all
        int last  = lastPos(nums, target);
        return {first, last};
    }

private:
    int firstPos(const vector<int>& a, int x) {
        int l = 0, r = (int)a.size() - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] >= x) r = m - 1;
            else l = m + 1;
            if (a[m] == x) ans = m;
        }
        return ans;
    }

    int lastPos(const vector<int>& a, int x) {
        int l = 0, r = (int)a.size() - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] <= x) l = m + 1;
            else r = m - 1;
            if (a[m] == x) ans = m;
        }
        return ans;
    }
};
