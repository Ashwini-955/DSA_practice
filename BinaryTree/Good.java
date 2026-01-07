import java.util.*;
public class Good{
    public static int check(int[] arr){
        int element=0;int maxFreq=Integer.MIN_VALUE;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                element = e.getKey();
            }
    }
        return element;
    }
    public static void main(String args[]){
        int[] arr={1,1,2,2,3,2,4,4,5,3};
        int result=check(arr);
        System.out.println(result);
    }
}