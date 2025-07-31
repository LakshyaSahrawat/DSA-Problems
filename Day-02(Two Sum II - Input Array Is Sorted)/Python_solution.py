class Solution:
    def twoSum(self, numbers, target):
        a = [0, 0]
        found_flag = False
        i = 0
        while i < len(numbers):
            j = i + 1
            while j < len(numbers):
                if numbers[i] + numbers[j] == target:
                    a[0] = i + 1
                    a[1] = j + 1
                    found_flag = True
                    break
                j += 1
            if found_flag:
                break
            i += 1
        return a
