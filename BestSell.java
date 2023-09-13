import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BestSell {
    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * */
    public static int maxProfit(int[] prices) {
        int diff=0;
        int lst=Integer.MAX_VALUE;
        int profit=0;
        for (int i = 0; i < prices.length; i++) {
            if(lst>prices[i])
                lst=prices[i];
            diff=prices[i]-lst;
            if(diff>profit)
                profit=diff;
        }
        return profit;
    }
//所以说输入数组只能通过字符串转化吗？
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> nums=new ArrayList<>();
        boolean takeInput=true;
        while (takeInput){
            if(scanner.hasNextInt()) nums.add(scanner.nextInt());
            else takeInput=false;
        }
        int[] num=new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            num[i]= nums.get(i);
        }
        System.out.println(maxProfit(num));
        scanner.close();
    }
}
