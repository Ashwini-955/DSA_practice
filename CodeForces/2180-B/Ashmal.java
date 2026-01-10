import java.util.*;
public class Ashmal{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        while(n!=0){
            int length=sc.nextInt();
            String ans="";
            for(int i=0;i<length;i++){
                String temp =sc.next();
                String firstAdd=temp+ans;
                String lastAdd=ans+temp;
                if(firstAdd.compareTo(lastAdd)<0){
                    ans=firstAdd;
                }else{
                    ans=lastAdd;
                }
            }
            System.out.println(ans);
            n--;
        }
        sc.close();
    }
}