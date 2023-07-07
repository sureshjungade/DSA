class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ab = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ab.add(temp);
        List<Integer> temp1 = new ArrayList<>();
        if(numRows==1) return ab;
        temp1.add(1);
        temp1.add(1);
        ab.add(temp1);
        for(int i=2; i<numRows; i++){
            List<Integer> bc = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    bc.add(1);
                }else{
                    int sum = ab.get(i-1).get(j)+ab.get(i-1).get(j-1);
                    bc.add(sum);
                }
            
            }
            ab.add(bc);
        }
        
        return ab;
    }
}