public class Duplicate {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicate(int idx,String str,String newstr){
        if(idx==str.length()){
            System.out.println(newstr); 
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicate(idx+1,str,newstr);
        }else{
            newstr+=currChar;
            map[currChar-'a']=true;
            removeDuplicate(idx+1,str,newstr);
        }
    }
    public static void main(String[] args) {
        String str="abbccda";
        removeDuplicate(0,str,"");

    }
}
