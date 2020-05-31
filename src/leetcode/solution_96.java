package leetcode;

public class solution_96 {

    public static void main(String[] args) {
        System.out.println(numTrees(4));
    }

    public static int numTrees(int n) {
        if(n<=1) return n;
        int [] dp = new int [n];
        dp[0] = 1;
        dp[1]  =2;
        for(int nn=2;nn<=n;nn++){
            dp[nn-1] = 2*dp[nn-2];
            for(int i =2 ;i < nn ; i++ ){
                dp[nn-1] += dp[i-2]*dp[nn-i-1];
            }
        }
        return dp[n-1];
    }
}
