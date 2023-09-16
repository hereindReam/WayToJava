import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WaterContainer {
    /*int max=0;
    //        int subMax=0;
            int index=0;
    //        int subIndex=0;
            int maxArea=0;
            for (int i = 0; i < height.length; i++) {
                if(height[i]>max){
                    max=height[i];
                    index=i;
                }
                maxArea=Math.max(height[i]*(i-index),maxArea);
            }
            return maxArea;*/
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int temp = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, temp);
            if (height[left] < height[right]) {
                left++;
            } else right--;

        }
        return maxArea;
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
        int[] num=new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            num[i]= nums.get(i);
        }
        System.out.println(maxArea(num));
    }
}
