public class Max_Balanced_Substring {
    public static void main(String[] args){
        String str="LRLRLLRLRR";
        int countL =0;
        int countR =0;
        int maxCount =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='L'){
                countL++;
            }else{
                countR++;
            }
            if(countL==countR){
                maxCount++;
                countL=0;
                countR=0;
            }
        }
        System.out.println(maxCount);
    }
}