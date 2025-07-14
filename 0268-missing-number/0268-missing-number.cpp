class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int xor1 = 0, xor2 = 0;
        int N = nums.size();

        for (int i = 0; i < N; i++) {
            xor1 ^= nums[i];
            xor2 ^= i;
        }

        xor2 ^= N; 
        return xor1 ^ xor2;
    }

};