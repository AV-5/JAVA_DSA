package recursion;
//find first and last occurance of a n element in string
//TOC=O(n)
public class find_char {
    public static int first=-1;
    public static int last=-1;
    public static void occur(String str,char ch,int idx){
        
        if(idx==str.length()-1){
            System.out.println("First occurence of "+ch+" is "+first);
            System.out.println("Last occurence of "+ch+" is "+last);
            return;
        }
        char curr=str.charAt(idx);
        if(curr==ch){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        idx++;
        occur(str,ch,idx);
    }
    public static void main(String[] args) {
        String str="abcabc";
        char ch='a';
        occur(str, ch,0);
    }
}
