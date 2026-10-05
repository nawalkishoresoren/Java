class Solution {
    public int pivotIndex(int[] nums) {
        int prefixSum[] = new int[nums.length];

        int total_sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            prefixSum[i] = total_sum;
            total_sum += nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            if(prefixSum[i] == total_sum - nums[i] - prefixSum[i])
                return i;
        }
        return -1;
    }
}