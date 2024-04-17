// problem link
// https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> s = new HashSet<>();
        int n = A.length, count = 0, prev = 0;
        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            if(s.contains(A[i])){
                count++;
                arr[i] = count;
                prev = count;
            }else{
                s.add(A[i]);
                arr[i] = prev;
            }


            if(s.contains(B[i])){
                count++;
                arr[i] = count;
                prev = count;
            }else{
                s.add(B[i]);
                arr[i] = prev;
            }
        }

        return arr;

    }
}
