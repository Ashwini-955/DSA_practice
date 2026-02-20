import java.util.Arrays;
public class Coins{
    public static void main(String[] args){
        int coins[]={2000,1000,500,100,50,20,10,5,2,1};
        Arrays.sort(coins);
        int value =590;
        int count=0;
        for(int  i=coins.length-1;i>=0;i--){
            while(value>= coins[i]&&value!=0){
                System.out.println(coins[i]);
                value=value-coins[i];
                count++;
            }
        }
        System.out.println("Total coins used: "+count);
    }
}