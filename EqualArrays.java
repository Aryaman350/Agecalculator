import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array1 and array2");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        System.out.println("Enter the elements of array1");
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            arr1[i]=element;
        }
        System.out.println("Enter the elements of array2");
        for(int i=0;i<m;i++){
            int element=sc.nextInt();
            arr2[i]=element;
        }
        if(arr1.length==arr2.length){
            check(arr1,arr2);
        }
        else {
            System.out.println("Arrays are not equal");
        }

    }
    static void check(int arr1[], int arr2[]){
        int flag=0;
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    flag++;
                }
            }
        }
        if(flag==0){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }

}
