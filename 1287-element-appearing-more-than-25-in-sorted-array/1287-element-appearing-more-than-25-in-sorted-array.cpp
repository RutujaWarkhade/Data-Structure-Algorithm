class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        int n = arr.size();
        int span = n / 4;                 // distance to check
        for (int i = 0; i + span < n; ++i) {
            if (arr[i] == arr[i + span])  // same value across a quarter-span => occurs > 25%
                return arr[i];
        }
        return -1; // problem guarantees existence, but keep for completeness
    }
};
