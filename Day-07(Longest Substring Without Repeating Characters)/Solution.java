class Solution {
    public int lengthOfLongestSubstring(String s) {
         int l = 0;
         int r = 0;
         int max_len = 0;

         Set sSet = new HashSet<Character>();

         while(r < s.length()){
            while(sSet.contains(s.charAt(r))){
                sSet.remove(s.charAt(l));
                l++;
            }

            sSet.add(s.charAt(r));
            max_len = Math.max(max_len, r-l+1);
            r++;
        }
        return max_len;
    }
}