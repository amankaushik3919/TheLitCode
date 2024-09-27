class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            
            for (int j = 1; j < prevRow.size(); j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            newRow.add(1);
            res.add(newRow);
        }
        
        return res;
    }
}