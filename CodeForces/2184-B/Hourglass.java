//not accepted 
import java.util.*;
public class Hourglass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int s=sc.nextInt();
            int k=sc.nextInt();
            int m=sc.nextInt();
            int time =m%k;
            int remaining=Math.min(s,k);
            int ans =remaining-time;
            if(ans<0) ans=0;
            System.out.println(ans);
        }
    }
}