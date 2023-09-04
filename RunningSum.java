import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            nums[i+1]=nums[i]+nums[i+1];
        }
        return nums;
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
        System.out.println(Arrays.toString(nums));
        return nums;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int []nums;
        int j=0;
        String s=sc.nextLine();
        nums=toArr(s);
        assert nums != null;
        runningSum(nums);
        System.out.println(Arrays.toString(nums));
        System.out.print("[");
        for (int i = 0; i < nums.length-1; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.print(nums[nums.length-1]+"]");
        sc.close();
    }
}