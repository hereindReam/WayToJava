public class Minimum {
    public int findMin(int[] nums) {
//        二分查找但是略微无序版
        int low=0;
        int high= nums.length-1;

        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<nums[low])
            {
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }

            else{
                ans=Math.min(ans,nums[low]);
                low = mid+1;
            }
        }
        return ans;
    }
}
