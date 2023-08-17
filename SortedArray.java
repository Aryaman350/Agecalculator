public class SortedArray {
    public static boolean checkSorted(int idx,int[] arr){
        if(idx== arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return checkSorted(idx+1,arr);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int idx=0;
        int[] arr={1,2,3,4,5};
        boolean ans=checkSorted(idx,arr);
        System.out.println(ans);
    }
}
