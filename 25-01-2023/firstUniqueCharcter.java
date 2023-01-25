class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);  
        }
        for(int i=0;i<len;i++) {
            if(map.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
}
