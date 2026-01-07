public class Missing{
    public static int missing(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i!=arr[i]) return i;
        }
        return 0;
}
    public static void main(String[] args){
        int arr[] ={0,1,2,4,5};
        System.out.println(missing(arr));
    }
}