//in this question we are given the array which repreasent -1 for empty space , we have to replace -1 .
// replace -1 with such a number that the absolute sum of adjacent numbres in aaray b is minimum . 
// we will have four cases in that , all the ans depends on first and last digit of arrray .
// if both first and last are not equal to -1 then we will print the absolute difference of both .
// if both first and last are equal to -1 then we will replace both with 0 and print 0
// if first is not equal to -1 and last is equal to -1 then we will replace last with first and print 0
// if first is equal to -1 and last is not equal to -1 then we will replace first with last and print 0
import java.util.*;
public class MinimumAbsoluteSum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0){
        int length=sc.nextInt();
        int arr[] =new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        if(arr[0]!=-1&&arr[length-1]!=-1){
            System.out.println(Math.abs(arr[0]-arr[length-1]));
        }else if(arr[0]==-1&&arr[length-1]==-1){
            arr[0]=0;
            arr[length-1]=0;
            System.out.println(0);
        }else if(arr[0]!=-1&&arr[length-1]==-1){
            arr[length-1]=arr[0];
            System.out.println(0);
       }else if(arr[0]==-1&&arr[length-1]!=-1){
            arr[0]=arr[length-1];
            System.out.println(0);
         }
         for(int i=0;i<length;i++){
            if(arr[i]==-1){
                arr[i]=0;
            }
        }
         for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
         }
} 
}
}