public class BestTBS {
    public int maxProfit(int[] p) {
        int i=p[0];
        int res=0;
        for(int k=1;k<p.length;k++){
             i=Math.min(i,p[k]);
             res=Math.max(res,p[k]-i);       
        }
        return res;          
    }
}
