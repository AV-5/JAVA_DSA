package recursion;
//time complexity=O(n)
public class reverse_string {
    public static void rev(String str,int idx){
        if (idx < 0) {
            return;
        }
           System.out.print(str.charAt(idx));
           rev(str, idx-1);
        
    }
    public static void main(String[] args) {
        String s1="apple";
        rev(s1, s1.length()-1);
    }
}
