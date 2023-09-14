import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<=5;i++){
            int element=sc.nextInt();
            arr[i]=element;
        }
        for(int i=0;i<=5;i++){
            int max=arr[0];
            if(arr[i]>arr[i+1]){
                max=arr[i];
            }
            System.out.println(max);
        }


    }
}
