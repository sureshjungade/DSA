//overflow error 2^31 to 2^31-1, when we convert most negative to poistive it will be mor than one of most posistive number in integer. so will give overflow error.
class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn =n;
        if (nn<0) nn = nn*(-1);
        while(nn>0){
            if(nn%2==0){
                x = x * x;
                nn = nn/2;
            }else{
                ans = ans * x;
                nn = nn-1;
            }
        }
        if(n<0) ans = (double) (1.0)/ (double) (ans);
        return ans;

    }
}