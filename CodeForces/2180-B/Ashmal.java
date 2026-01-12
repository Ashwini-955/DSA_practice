// we will be given the string one by one.
// comapare the cuurent string with previous one . 
// we will have two options either we can add the current string at the start of previous string or at the end of previous string
// we will compare both the strings and take the lexicographically smaller one as our answer.
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