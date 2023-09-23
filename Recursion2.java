public class Recursion2 {
    public static void sumNumbers(int i,int n,int s ){
        if(i==n){
            s+=i;
            System.out.println(s);
            return;
        }
        s+=i;
        sumNumbers(i+1,n,s);
    }
    public static void main(String[] args) {
        sumNumbers(1,5,0);
    }
}
