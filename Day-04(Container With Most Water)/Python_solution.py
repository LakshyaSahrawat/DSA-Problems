class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        max_num = 0

        while(right > left):
            left_num = height[left]
            right_num = height[right]
            
            min_num = min(left_num, right_num)
            max_num = max(max_num, min_num * (right - left))

            if left_num > right_num:
                right -= 1
            
            else:
                left += 1


        return max_num