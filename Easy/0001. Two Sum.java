class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;
        int[] result = new int[a];
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return result;
    }
}
