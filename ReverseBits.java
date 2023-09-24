package Binary;

public class ReverseBits {
    public int reverseBits(int n) {
        int ans=0;
        for (int i = 0; i < Integer.SIZE; i++) {
            if((n&1)==1){
                ans+=(int)(1<<(31-i));
            }
            n=n>>>1;
        }
        return ans;
    }
}
