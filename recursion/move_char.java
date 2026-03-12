package recursion;
//Move all occurence of a particular element to the end of a string
public class move_char {
    public static String s2="";
    public static int count=0;
    public static void move(String s1,char ch,String s2,int idx,int count){
        if(idx==s1.length()){
            for(int i=1;i<=count;i++){
                s2=s2+ch;
            }
            System.out.println(s2);
            return;
        }
        if(s1.charAt(idx)==ch){
            count++;
        }
        else{
            s2=s2+s1.charAt(idx);
        }
        move(s1, ch,s2,idx+1,count);
    }
    public static void main(String[] args) {
        String s1="apple";
        char ch='p';
        move(s1, ch, s2, count, count);
    }
}
