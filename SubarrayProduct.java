public class SubarrayProduct {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int max=nums[0];
        int min=nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tmp=max;
            max=Math.max(Math.max(nums[i]*max,nums[i]*min),nums[i]);
            min=Math.min(Math.min(nums[i]*tmp,nums[i]*min),nums[i]);
            if(max>ans)
                ans=max;

        }
        return ans;
    }
}
