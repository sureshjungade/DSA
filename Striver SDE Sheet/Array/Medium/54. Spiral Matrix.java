class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n -1;
        List<Integer> ans = new ArrayList<>();
        int j = 0;
        int k = 0;
        while(true){

            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            if (left>right || top>bottom) break;

            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if (left>right || top>bottom) break;

            for(int i=right; i>=left; i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            if (left>right || top>bottom) break;

             for(int i=bottom; i>=top; i--){
                ans.add(matrix[i][left]);
            }
            left++;
            if (left>right || top>bottom) break;
        }

        return ans;
    }
}
