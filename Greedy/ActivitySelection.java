public class ActivitySelection{
    public static void printMaxActivities(int start[], int finish[], int n) {
        int s=start[0];
        int e=finish[0];
        int count =0;
        for(int i =1;i<start.length;i++){
            if(start[i]<e){
                continue;
            }else{
                System.out.println("Activity "+i);
                s=start[i];
                e=finish[i];
                count++;

            }
        }
        System.out.println("Total activities selected: "+(count+1));
    }
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        System.out.println("Following activities are selected: ");
        System.out.println("Activity 0");
        printMaxActivities(start, finish, n);
    }
}