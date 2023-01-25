class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int st=0,i=0;
        int maxlen = 0;
        while(i<s.length()) {
            if(set.contains(s.charAt(i))) {
                set.remove(s.charAt(st));
                st+=1;
            }
            else{
                set.add(s.charAt(i++));
                
            }
            maxlen = Math.max(maxlen,set.size());
        }
        return maxlen;
    }
