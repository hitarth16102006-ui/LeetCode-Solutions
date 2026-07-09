class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int sum=0;
       int sum_a=0;

       for(int i=0;i<=n;i++){
        sum=sum+i;
       }
        for(int i=0;i<n;i++){
            sum_a+=nums[i];
        }
        return sum-sum_a;
    }
}