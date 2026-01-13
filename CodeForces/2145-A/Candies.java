import java.util.*;
public class Candies{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            if(a%3==0){
                System.out.println("0");
            }else{
                System.out.println(3-(a%3));
            }
        }
    }
}