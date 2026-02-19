import java.util.Arrays;
import java.util.Comparator;
public class MaxChain{
    public static void main(String[] args){
        int pairs[][]={{5, 24}, {15, 25}, {27, 40}, {50, 60}};
        Arrays.sort(pairs,Comparator.comparingInt(a -> a[1]));
        int count=1;
        int lastEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastEnd){
                count++;
                lastEnd=pairs[i][1];
        }

        }
        System.out.println(count);
    }

}