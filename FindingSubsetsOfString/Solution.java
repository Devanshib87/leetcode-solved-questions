import java.util.*;
class Main {
    public static void findString(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        
        //check
        //yes
        findString(str,ans + str.charAt(i),i+1);
        //No 
        findString(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str= "abc";
        findString(str,"",0);
    }
}