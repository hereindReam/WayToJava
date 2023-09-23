import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.*;

public class TriSum {
    /**
    * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

*/
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplet=new ArrayList<>();

        Set<List<Integer>> tmp=new HashSet<>();
        sort(nums);
        for (int i = 0; i < nums.length-2; i++) {

            /*if(nums[i]==nums[i+1])
                continue;*/
//            本来是希望跳过重复元素，结果在测试中就不能通过，因为有如{-1,-1,2}的组合
            
            for(int j=i+1, k=nums.length-1;j<k;){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)
                    j++;
                else if (sum>0) {
                    k--;
                }
                else{
                    tmp.add(asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
            }
        }
        triplet.addAll(tmp);
        return triplet;
    }

}
