// A bit clearer

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pt = new ArrayList<List<Integer>>();
        if (numRows == 0) return pt;
        List<Integer> layer = new ArrayList<Integer>();
        layer.add(1);
        pt.add(layer);
        for (int n = 1; n < numRows; n++) {
            layer = nextLayer(layer);
            pt.add(layer);
        }
        return pt;
    }
    
    public List<Integer> nextLayer(List<Integer> prev) {
        List<Integer> next = new ArrayList<>();
        next.add(1);
        int i = 0, j = 1;
        while(j < prev.size()) {
            next.add(prev.get(i++)+prev.get(j++));
        }
        next.add(1);
        return next;
    }
}
