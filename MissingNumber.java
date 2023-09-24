package Binary;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[nums.length+1];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        ans[nums.length]=0;
        for (int i = 0; i < ans.length ; i++) {
            if(ans[i]!=i)
                return i;
        }
        return -1;
    }
}
