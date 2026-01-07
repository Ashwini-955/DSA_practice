import java.util.*;
class FirstNegativeInSubarray{
    public static List<Integer> negative(int[] arr,int k){
        int i=0,j=0;
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        while(j<arr.length){
            if(arr[j]<0){
                q.add(arr[j]);
            }
            if((j-i+1)<k){
                j++;
            }else if((j-i+1)==k){
                if(q.isEmpty()){
                    result.add(0);
                }else{
                    result.add(q.peek());
                }
                if(!q.isEmpty()&& arr[i]==q.peek()) q.poll();
                i++;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int arr[]={12,-1,-7,8,-16,30,16,28};
        int k=3;
        System.out.println(negative(arr,k));
    }
}