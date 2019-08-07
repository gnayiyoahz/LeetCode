// using StringBuilder

class Solution {
    public String countAndSay(int n) {      
        
        StringBuilder ret = new StringBuilder("1"); 
        StringBuilder temp;
    
        for (int i = 0; i < n-1; i++) {
            
            temp = new StringBuilder();
            int j = 0, k = 0;
            
            while (k < ret.length()) {
                if (ret.charAt(j) == ret.charAt(k)) k++;
                else {
                    temp.append(k-j);
                    temp.append(ret.charAt(j));
                    j = k;
                }
            }  
            
            temp.append(k-j);
            temp.append(ret.charAt(j));
            ret = temp;
            
        }

        return ret.toString();

    }
        
    
}
