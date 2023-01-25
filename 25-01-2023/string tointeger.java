class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.equals("")){
            return 0;
        }
        long res = 0;
        int ind = 0;
        int low = Integer.MIN_VALUE,high = Integer.MAX_VALUE;
        boolean neg = false;
        if(s.charAt(ind)=='-') {
            ind++;
            neg = true;
        }
        else if(s.charAt(ind)=='+') {
            ind++;
        }
        
        while(ind<s.length() && Character.isDigit(s.charAt(ind))) {
            res = (res*10)+(s.charAt(ind++)-'0');
            if(neg) {
                if(-res<low){
                    return low;
                }
            }
            else{
                if(res>high){
                    return high;
                }
            }
        } 
        if(neg) {
            if(res<low) {
                return low;
            }
            return -(int)res;
        }
        if(res>high) {
            return high;
        }
        return (int)res;  
    }
}
