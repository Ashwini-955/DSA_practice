import java.util.*;
public class Prefix{
    public static int max(int[] arr){
        int[] helper=new int[arr.length];
        int[] prefixsum=new int[arr.length];
        int j=0,count=0,maxnum=0;
        while(arr[j]<0){
            count++;
            j++;
        }
        int index=0;
        for(int i=count;i<arr.length;i++){
            helper[index++]=arr[i];
        }
        for(int i=count-1;i>=0;i--){
            helper[index++]=arr[i];
        }
        for(int num:helper){
            System.out.println(num);
        }
        prefixsum[0]=helper[0];
        for(int i=1;i<helper.length;i++){
            prefixsum[i]=helper[i]+prefixsum[i-1];
        }
        for(int i=0;i<prefixsum.length;i++){
            if(prefixsum[i]>0) maxnum++;
        }
        return maxnum;
    }
    public static void main(String[] args){
        int arr[] ={-9,-2,7,6};
        Arrays.sort(arr);
        System.out.println(max(arr));
    }
}