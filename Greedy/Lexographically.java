public class Lexographically {
    public static void main(String[] args){
        int n=3;
        int k=25;
        int result[]=new int[n];
        for(int i=0;i<result.length;i++){
            result[i]='a';
        }
        int remaining=k-n;
        for(int i=n-1;i>=0&&remaining>0;i--){
            int add =Math.min(remaining, 25);
            result[i]+=(char)add;
            remaining-=add;
        }
        for(int i=0;i<result.length;i++){
            System.out.print((char)result[i]);
        }
    }    
}
