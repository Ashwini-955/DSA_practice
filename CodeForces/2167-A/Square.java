// to find whether the given four sides can form a square or not
import java.util.*;
public class Square{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        while(n-->0){
            int a =sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if((a!=b||b!=c||c!=d)){
                System.out.println("NO");
                continue;
            }else{
                System.out.println("YES");
        }
    }
}
}