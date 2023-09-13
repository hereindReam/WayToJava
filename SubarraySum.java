import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarraySum {
    /** Given an integer array nums, find the subarray with the largest sum, and return its sum.*/
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int ans=nums[0];
        for (int i = 1; i < nums.length; i++) {
            max=Math.max(max+nums[i],nums[i]);
            if(max>ans)
                ans=max;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> nums=new ArrayList<>();
        boolean takeInput=true;
        while (takeInput){
            if(scanner.hasNextInt()){
                nums.add(scanner.nextInt());
            }else {
                takeInput=false;
            }
        }

    }
}
