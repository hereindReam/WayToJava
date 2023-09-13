import java.util.Scanner;
    /** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.**/
import java.util.Arrays;
import java.util.Scanner;

public class TwoSUm {
    public static int[] twoSum(int[] nums, int target) {
        //返回等于target的两个数的下标
        int []sum = new int[2];
        for(int i=0;i<nums.length;i++)
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        return sum;
                
    } 
    public static int[] toArr(String s){
        if(s.isEmpty())
            return null;
        String []str=s.split(",");
        int []nums=new int[str.length];
        for (int i = 0; i < str.length; i++) {
            try{
                nums[i]=Integer.parseInt(str[i]);
            }catch (NumberFormatException e){
                e.printStackTrace();
                return nums;
            }
        }
        return nums;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int []nums;
        int j=0;
        String s=sc.nextLine();
        nums=toArr(s);
        assert nums != null;
        int target=sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
        sc.close();
    }
}
/**
* public class Morse {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        for (String line = scanner.nextLine(); !line.isEmpty(); line = scanner.nextLine()) {
            System.out.println(line);
        }
    }
}**/