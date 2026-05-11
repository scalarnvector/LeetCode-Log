class Solution {
    public int[] runningSum(int[] nums) {
        int rslt[] = new int[nums.length];

        rslt[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            rslt[i] = rslt[i - 1] + nums[i];
        }

        return rslt;
    }
}