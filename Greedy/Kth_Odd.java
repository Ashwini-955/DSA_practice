public class Kth_Odd {
    public static void main (String[] args){
        int L=-3;
        int R=3;
        int k=2;
        int ans=0;
        // for(int i=R;i>=L;i--){
        //     if(i%2!=0){
        //         k--;
        //     }
        //     if(k==0){
        //         System.out.println(i);
        //         break;
        //     }
        // }
        if(R%2==0){
            R=R-1;
        }
        ans=R-(k-1)*2;
        if(ans >L) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}
