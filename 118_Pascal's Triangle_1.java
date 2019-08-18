// A little bit confusing

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pt = new ArrayList<List<Integer>>();
        if (numRows == 0) return pt;
        
        for (int n = 0; n < numRows; n++) {   
            List<Integer> layer = new ArrayList<>();
            layer.add(1);
            if (n > 0)
                for (int i = 1; i < n+1; i++) {
                    if (i >= pt.get(n-1).size()) layer.add(1);
                    else layer.add(pt.get(n-1).get(i)+pt.get(n-1).get(i-1));
                }
            pt.add(layer);
        }
        return pt;
    }
}
