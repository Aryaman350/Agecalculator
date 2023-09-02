public class factorial {
    public static int calculateFactorial(int n){
        if(n==1||n==0){
            return 1;
        }
        int nmf=calculateFactorial(n-1);
        int n_fact=n*nmf;
        return n_fact;
    }
    public static void main(String[] args) {
        int ans=calculateFactorial(5);
        System.out.println(ans);

    }
}
