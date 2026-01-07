import java.util.*;
public class Unique{
    public static int check(int[] arr){
        int sum=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
               if(e.getValue()==1){
                sum+=e.getKey();
               } 
            }
        return sum;
    }
    
    public static void main(String args[]){
        int[] arr={1, 2, 2, 3, 4, 4, 5};
        int result=check(arr);
        System.out.println(result);
    }
}