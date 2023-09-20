public class Occurence {
    public static int first=-1;
    public static int last=-1;
    public static void findOcc(int idx,String s,char f){
        if(idx==s.length()-1){
            if(s.charAt(idx) == f){
                if(first==-1){
                    first=idx;
                }
                else {
                    last = idx;
                }
            }
            return;

        }
        if(s.charAt(idx) == f){
            if(first==-1){
                first=idx;
            }
            else {
                last = idx;
            }
        }
        findOcc(idx+1,s,f);
    }
    public static void main(String[] args) {
        int idx=0;
        String s="abcdaacdab";
        char f='a';
        findOcc(idx,s,f);
        System.out.println("First :"+first+"Last :"+last);
    }
}
