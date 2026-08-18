class Solution {
    public boolean isSameAfterReversals(int num) {
         String str = Integer.toString(num);
        int len= str.length();
        if(len > 1 && num%10 == 0){
            return false;
        }
        return true;
    }
}