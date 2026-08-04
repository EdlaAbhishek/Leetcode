class Solution {
    public int numIdenticalPairs(int[] nums) {
         int pairs=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int key:nums){
            pairs+=freq.getOrDefault(key,0);
            freq.put(key,freq.getOrDefault(key,0)+1);
            
        }
       return pairs;

        
    }
}