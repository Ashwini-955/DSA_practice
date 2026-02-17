import java.util.Arrays;
public class Knapsack{
    public static void main(String[] args){
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int capacity = 50;
        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)value[i]/weight[i];
        }
        Arrays.sort(ratio,(a,b)->Double.compare(b[1],a[1]));
        double total =0;
        for(int i=0;i<value.length;i++){
            int idx=(int)ratio[i][0];
            if(weight[idx]<=capacity){
                total+=value[idx];
                capacity-=weight[idx];
                System.out.println("Added item "+idx+" with value "+value[idx]+" and weight "+weight[idx]);
            }else{
                total+=ratio[i][1]*capacity;
                System.out.println("Added item "+idx+" with value "+(ratio[i][1]*capacity)+" and weight "+capacity);
                System.out.println("Total value in knapsack: "+total);
                break;
            }
    }
}
}