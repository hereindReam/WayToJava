import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DistinctValue {
    /**
    * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    * */
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> dup=new HashMap<>();
        for(int i:nums){
            if(!dup.containsKey(i)){
                dup.put(i,1);
            }else {
                return true;
            }
        }
        return false;
    }

    static int [] toArr(String s){
        if(s.isEmpty())
            return null;
        String[] str=s.split(",");
        int []num=new int[str.length];
        for (int i = 0; i < str.length; i++) {
            num[i]=Integer.parseInt(str[i]);
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(containsDuplicate(toArr(str)));
        scanner.close();
    }
}
