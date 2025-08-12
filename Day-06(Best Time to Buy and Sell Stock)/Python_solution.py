class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        #brute force solution
        # max_profit = 0

        # for idx, val in enumerate(prices):
        #     for i in range(idx, len(prices)):
        #         if prices[i] - val > max_profit:
        #             max_profit = prices[i] - val
        
        # return max_profit

        l, r = 0, 1
        max_profit = 0

        while r < len(prices):
            if prices[l] < prices[r]:
                max_profit = max(max_profit, prices[r] - prices[l])
            else:
                l = r
            r += 1
        
        return max_profit