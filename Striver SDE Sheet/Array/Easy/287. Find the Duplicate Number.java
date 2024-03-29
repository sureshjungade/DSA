class Solution {
    public int findDuplicate(int[] nums) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i)>1){
                return i;
            }
        }
        //System.out.println(x);

        return -1;
    }
}