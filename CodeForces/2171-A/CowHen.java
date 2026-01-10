import java.util.*;
public class CowHen{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0){
        int num=sc.nextInt();
        if(num%2!=0){
            System.out.println("0");
        }else{
            System.out.println((num/4)+1);
        }

    }
    }
}