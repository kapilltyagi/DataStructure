package sort_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,3,5,6,7,9,10};
        int element = 9;
        int low = 0;
        int high = a.length-1;
        int mid = (low+high)/2;
        boolean flag = false;
        while (low < high){
            if(element == a[mid]){
                System.out.println(element+" found at index position "+mid);
                flag = true;
                break;
            } else if (element < a[mid]) {
                high = mid-1;
            } else if (element > a[mid]) {
                low = mid+1;
            }
            mid = (low+high)/2;
        }
        if(!flag)
            System.out.println("Element not found");
    }
}
