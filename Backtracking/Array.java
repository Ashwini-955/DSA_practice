public class Array{
    public static void changeArr(int i,int val,int[] arr){
        if(i==arr.length){
            return;
        }
        arr[i]=val;
        changeArr(i+1,val+1,arr);
        arr[i]=arr[i]-2;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr=new int [5];
        changeArr(0,1,arr);
        print(arr);
    }
}