import java.util.*;
class VariableSizeWindow{
    public static int minLength(int[] arr, int target){
        int j=0 , sum=0, minLength=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=target){
                minLength=Math.min(minLength,i-j+1);
                sum-=arr[j];
                j++;
            }
        }
        if(minLength==Integer.MAX_VALUE) return 0;
        return minLength;
        }

    public static void main(String[] args){
        int[] arr={2,3,1,2,4,3};
        int target =7;
        System.out.println(minLength(arr,target));
    }
}