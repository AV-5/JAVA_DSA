package strings;
import java.util.*;
public class palindrome {
    public static boolean pal(String s){
        StringBuilder sb=new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String s1=sb.toString();
        if(s.equals(s1)){
            return true;
        }
        else{
             return false;
        }
   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println("Is the given string plaindrome: "+pal(s));
        
    }
}
