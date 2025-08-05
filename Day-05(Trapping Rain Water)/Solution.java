import java.lang.Math;

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] pre_arr = new int[n];
        int[] post_arr = new int[n];

        int max_num = 0;

        for(int i=0; i<n; i++){
            max_num = Math.max(max_num, height[i]);
            pre_arr[i] = max_num;
        }

        max_num = 0;

        for(int i=n-1; i>=0; i--){
            max_num = Math.max(max_num, height[i]);
            post_arr[i] = max_num;
        }

        int result = 0;

        for(int i=0; i<n; i++){
            result += (Math.min(pre_arr[i], post_arr[i]) - height[i]);
        }

        return result;
    }
}