class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> m1 = new HashMap<>();
        String res = "";
        for(char c:t.toCharArray())
        {
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        int fixLen = t.length();
        HashMap<Character,Integer> m2= new HashMap<>();
        int i=0,j=0,count=0;
        while(true)
        {
            boolean flag = true;
            while(i<s.length() && count!=fixLen)
            {
                char curr = s.charAt(i);
                m2.put(curr,m2.getOrDefault(curr,0)+1);
                if(m1.containsKey(curr) && m1.get(curr)>=m2.get(curr))
                {
                    count++;
                }
                i++;
                flag = false;
            }
            while(j<i && count==fixLen)
            {
                if(res.length()>i-j || res.equals(""))
                {
                    res = s.substring(j,i);
                }
                char c = s.charAt(j);
                if(m2.get(c)==1){
                    m2.remove(c);
                }
                else{
                    m2.put(c,m2.get(c)-1);
                }
                if(m1.containsKey(c) && m2.getOrDefault(c,0)<m1.get(c))
                {
                    count--;
                }
                j++;
                flag = false;
                
            }
            if(flag)
            {
                break;
            }
        }
        return res;

    }
}
