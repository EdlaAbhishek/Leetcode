class Solution {
    public int[] leftRightDifference(int[] nums) {
      int right =0;
      for(int curr : nums)
      {
        right+=curr;
      }
      int res[]=new int[nums.length];
      int leftSum=0;
      for(int i=0;i<nums.length;i++)
      {
        right-=nums[i];
        res[i]=Math.abs(leftSum-right);
        leftSum+=nums[i];
      }
      return res;
    }
}