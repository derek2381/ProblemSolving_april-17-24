// problem link
// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/

class Solution {
public:
    vector<int> findArray(vector<int>& pref) {
        vector<int> arr;
        int n = pref.size();
        arr.push_back(pref[0]);

        for(int i = 0;i < n-1;i++){
            arr.push_back((pref[i] ^ pref[i+1]));
        }
        return arr;

    }
};
