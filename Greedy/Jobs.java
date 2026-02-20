import java.util.Arrays;

public class Jobs {
    public static void main(String[] args){
        int jobs[][]={{4, 20}, {1, 10}, {1,40},{1,30}};
        Arrays.sort(jobs,(a,b)->b[1]-a[1]);
        int profit =0;
        int deadline=0;
        for(int i=0;i<jobs.length;i++){
            if(jobs[i][0]>deadline){
                profit+=jobs[i][1];
                deadline++;
            }
        }
        System.out.println(profit);
    }
}