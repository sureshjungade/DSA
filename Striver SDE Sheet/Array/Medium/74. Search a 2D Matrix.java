// we are dividing middile with m because in which row index is, depend on column, so we are dividijbg and then for j
//also we are getting reminder.

class Solution {
    
    public boolean searchMatrix(int[][] arr, int target) {
        int ind = 0;
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        int count1 = 0;
        int i = 0;
        int j = (n*m)-1;

        while(i<=j){
            int mid = (i + j)/2;
            if(arr[mid/m][mid%m]==target){
                return true;
            }else if(arr[mid/m][mid%m]<target){
                i = mid+1;
                
                
            }else{
                j = mid -1;
            }
        }

        return false;
        // for(int i=0; i<n; i++){
        //     if(arr[i][0]<=target && arr[i][arr[i].length-1]>=target){
                
        //         for(int j=0; j<arr[i].length; j++){
        //             if(arr[i][j]==target){
        //                 //System.out.println(true);
        //                 count++;
        //                 break;
        //             }
        //         }
        //     }
            
            
        // }if(count==0){
        //            return false;
                   
        // }else{
        //     return true;
        // }
    }
}