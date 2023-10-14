public class Move {
    public static void moveAll(int idx,int count,String str,String newstr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr=newstr+'x';
            }
            System.out.println(newstr);
            return;

        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAll(idx+1,count,str,newstr);
        }
        else{
            newstr=newstr+currChar;
            moveAll(idx+1,count,str,newstr);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAll(0,0,str,"");
    }
}
