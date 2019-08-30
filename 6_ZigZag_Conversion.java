class Solution {
    public String convert(String s, int numRows) {

        int len = s.length();
        if (len < 3 || numRows == 1) return s;
        
        int cyc = 2*numRows-2;

        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Integer> p = new LinkedHashSet<>(); 
        
        
        for (int i = 0; i < (len-1)/cyc+1; i++) {
            p.add(i*cyc);
            sb.append(s.charAt(i*cyc));
        }  
        
        if (len%cyc == 0) p.add(len);
        else p.add(len+cyc-len%cyc);


        for (int t = 1; t < numRows; t++) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>(); 
            for (int po : p) {         
                if (po-t < len && po-t > -1) set.add(po-t); 
                if (po+t < len && po+t > -1) set.add(po+t);
            }
            for (int i: set) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString(); 
    }
    
    
}
