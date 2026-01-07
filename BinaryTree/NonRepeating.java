import java.util.*;
public class NonRepeating{
    public static char check(String s){

        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return '#';
    }
    public static void main(String[] args){
        String s ="aabbc";
        System.out.println(check(s));
    }
}