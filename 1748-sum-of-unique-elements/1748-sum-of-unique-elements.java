class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int key : nums) {
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }

        for (int key : freq.keySet()) {
            if (freq.get(key) == 1) {
                sum += key;
            }
        }
        return sum;

    }
}