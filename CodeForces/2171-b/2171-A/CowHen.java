// in this question we will be  given a number n which represents the total number of legs of cows and hens
// we have to find the number of ways in which we can have cows and hens such that the total number of legs is equal to n
//we will divide the num by 4 because max no . of cows can be num/4 
// add 1 to the result because there is possibility that there are no cows , all are cows .
import java.util.*;
public class CowHen{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0){
        int num=sc.nextInt();
        if(num%2!=0){
            System.out.println("0");
        }else{
            System.out.println((num/4)+1);
        }

    }
    }
}