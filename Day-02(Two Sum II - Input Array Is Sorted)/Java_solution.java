//brute force solution

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        int i = 0;
        Boolean found_flag = false;
        while(i < numbers.length){
            int j = i + 1;
            while(j < numbers.length){
                if(numbers[i] + numbers[j] == target){
                    a[0] = i + 1;
                    a[1] = j + 1;
                    found_flag = true;
                    break;
                }
                j++;
            }
            if (found_flag){
                break;
            }
            i++;
        }
        return a;
    }
}



//two pointer optimized solution

class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                a[0] = ++left;
                a[1] = ++right;
                break;
            }
            else if(sum < target){
                left++;
            }
            else if(sum > target){
                right--;
            }
        }
        return a;
    }
}