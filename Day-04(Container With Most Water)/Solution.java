class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_num = 0;

        while(left < right){
            int left_num = height[left];
            int right_num = height[right];

            int min_num = Math.min(left_num, right_num);

            max_num = Math.max(max_num, min_num * (right - left));

            if(left_num > right_num){
                right--;
            }
            else{
                left++;
            }
        }
        return max_num;
    }
}