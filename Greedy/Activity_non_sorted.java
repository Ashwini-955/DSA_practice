import java.util.Arrays;
public class Activity_non_sorted{
    public static void printMaxActivities(int[][] activity, int n) {
        int s=activity[0][0];
        int e=activity[0][1];
        int count =0;
        for(int i =1;i<n;i++){
            if(activity[i][0]<e){
                continue;
            }else{
                System.out.println("Activity "+activity[i][2]);
                s=activity[i][0];
                e=activity[i][1];
                count++;

            }
        }
        System.out.println("Total activities selected: "+(count+1));
    }
    public static void main(String[] args) {
        int start[] = {1, 0, 3, 8, 5, 5};
        int finish[] = {2, 6, 4, 9, 7, 9};
        int n = start.length;
        System.out.println("Following activities are selected: ");
        System.out.println("Activity 0");
        int[][] activity =new int[n][3];
        for(int i=0;i<n;i++){
            activity[i][0]=start[i];
            activity[i][1]=finish[i];
            activity[i][2]=i;
        }
        Arrays.sort(activity,(a,b)->a[1]-b[1]);
        printMaxActivities(activity, n);
    }
}