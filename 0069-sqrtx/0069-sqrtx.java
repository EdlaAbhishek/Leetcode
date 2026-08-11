class Solution {
    public int mySqrt(int x) {
        long s=1;
        long e=x;
        while(s<=e){
            long mid=s+(long)(e-s)/2;
            long val=mid*mid;
            if(val<=x){
                s=mid+1;
            }
            else
            e=mid-1;
        }
        return(int)e;
    }
}