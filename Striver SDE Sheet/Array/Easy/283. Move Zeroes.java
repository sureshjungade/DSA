class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        
       int i = 0;
       int j = 1;

       while(i<n && j<n){
           if(arr[i]==0){
               if(arr[j]!=0){
                   arr[i] = arr[j];
                   arr[j] = 0;
                   i++;
                   j++;
               }else{
                   j++;
               }
           }else{
               i++;
               j++;
           }
       }
        

       //optimized version :

       int n = arr.length;
         int i = 0;
        for(int num : arr){
            if(num!=0) arr[i++] = num;
        }
        while(i<n){
            arr[i++] = 0;
        }
 
    }

    
}