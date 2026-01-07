public class Mincost{
    public static int getcost(int[] arr){
        int n=arr.length; int sum=0;
        int[] helper=new int[n+1];
        int first=0,last=0,max=0;
        int diff=0;
        for(int i =1;i<arr.length;i++){
            diff=(int)Math.pow((arr[i]-arr[i-1]),2);
            if(diff>max){
                first=i-1;
                last=i;
                System.out.println(first+" "+last);
                max=diff;
            }
        }
        int mid=(arr[first]+arr[last])/2;
        for(int i=0;i<=first;i++){
            helper[i]=arr[i];
        }
        helper[first+1]=mid;
        for(int i=last;i<n;i++){
            helper[i+1]=arr[i];
        }
        for(int num:helper){
            System.out.print(num+" ");
        }
        for(int i=1;i<n+1;i++){
            sum+=Math.pow((helper[i]-helper[i-1]),2);
        }
        
        return sum;
    }
    public static void main(String[] args){
        int[] arr={1,3,5,2,10};
        System.out.println(getcost(arr));
        return;
    }
}