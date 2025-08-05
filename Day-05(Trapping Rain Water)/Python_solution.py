class Solution:
    def trap(self, height: List[int]) -> int:
        list_pre = []
        list_post = []

        max_height = 0
        for i in height:
            max_height = max(max_height, i)
            list_pre.append(max_height)

        max_height = 0

        for i in reversed(height):
            max_height = max(max_height, i)
            list_post.append(max_height)
        
        list_post.reverse()

        result = 0

        for i in range(len(height)):
            result += (min(list_post[i], list_pre[i]) - height[i])

        return result