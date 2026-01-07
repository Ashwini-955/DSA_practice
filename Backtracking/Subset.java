public class Subset{
    public static void set(String str, String ans , int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes
        set(str,ans+str.charAt(i),i+1);
        //no
        set(str,ans,i+1);
    }
    public static void main(String[] args){
        String str="abc";
        set(str,"",0);
    }
}