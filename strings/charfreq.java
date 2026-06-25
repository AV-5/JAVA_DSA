package strings;

import java.util.HashMap;
import java.util.Scanner;

public class charfreq {
    public static void charcount(String s){
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), 1);
            }
            else{
                m.put(s.charAt(i), m.get(s.charAt(i))+1);
            }
        }
        System.out.println(m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        charcount(s);
    }
}
