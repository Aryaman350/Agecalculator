public class Reverse {
    public static void reverseString(int n,String s){
        if(n==0){
            System.out.println(s.charAt(n));
            return;

        }
        System.out.println(s.charAt(n));
        reverseString(n-1,s);
    }
    public static void main(String[] args) {
        String s="abcd";
        int n=s.length()-1;
        reverseString(n,s);

    }
}
