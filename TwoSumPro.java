public class TwoSumPro {
    public int getSum(int a, int b) {
//        给定两个整数 a 和 b，在不使用运算符 + 和 - 的情况下，返回两个整数之和。
        int sum=0;
        int c;
        int d;
        for(int i=31;i>=0;i--){
            c=a>>>i&1;
        }
        for(int i=31;i>=0;i--){
            d=b>>>i&1;
        }
//        用二进制位运算操作符实现加法

        return sum;
    }
}
