import java.util.*;
class MaximumSubarrayOfSizeK{
    public static int maxsum(int[] arr,int k){
        int i=0,j=0,sum=0,max=0;
        while(j<arr.length){
            sum+=arr[j];
            if((j-i+1)<k){
                j++;
            }else if((j-i+1)==k){
                max=Math.max(sum,max);
                sum-=arr[i];
                j++;
                i++;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr ={2,5,1,8,2,9,1};
        int k=3;
        System.out.println(maxsum(arr,k));
    }
}