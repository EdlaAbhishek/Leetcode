class Solution {
    public boolean isPalindrome(int x) {
    String number = String.valueOf(x);
    int left=0,right=number.length()-1;
    while(left<=right)
    {
        if(number.charAt(left)==number.charAt(right))
        {
            right--;
            left++;
        }
        else
        return false;
    }
    return true;    
    }
}