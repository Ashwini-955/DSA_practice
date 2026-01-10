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