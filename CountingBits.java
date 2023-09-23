public class CountingBits {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for (int i = 0; i <= n; i++) {
            ans[i]=count(i);
        }
        return ans;
    }
    int count(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n%2==0) return count(n/2);
        else return 1+count(n/2);
    }
}
