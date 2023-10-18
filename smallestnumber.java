import java.util.*;
public class smallestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        smallest(arr);
        }
        public static void smallest(int arr[]){
            int min;
            for(int i=0;i<arr.length;i++){
                min=arr[0];
                if(arr[i]<min){
                    min=arr[i];
                }
                System.out.println(min);
        }

    }
}
