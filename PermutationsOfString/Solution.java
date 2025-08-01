import java.util.*;

class Main {
    public static void findperm(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String remaining=str.substring(0,i)+str.substring(i+1);
            findperm(remaining,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abcd";
        findperm(str," ");
    }
}