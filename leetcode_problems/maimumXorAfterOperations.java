// problwm link
// https://leetcode.com/problems/maximum-xor-after-operations/description/

// approach - 1
class Solution {
    public int maximumXOR(int[] nums) {
        int count = 0, n = nums.length;
        int total = 0;


        for(int i = 0;i < 31;i++){
            count = 0;
            for(int j = 0;j < n;j++){
                if((nums[j] & 1) != 0){
                    count++;
                }
                nums[j] >>= 1;
            }

            if(count > 0){
                total += 1 << i;
            }
        }

        return total;

    }
}


// approach - 2

class Solution {
    public int maximumXOR(int[] nums) {
        int count = 0, n = nums.length;
       for(int i = 0;i < n;i++){
        count = nums[i] | count;
       }

       return count;

    }
}
