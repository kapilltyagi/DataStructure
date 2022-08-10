package array;

public class KthLargestInArray {
    public static void main(String[] args) {
        int[] a ={1,10,2,9,3,8,4,7,6,5};
        int kth = 4;
        boolean flag = false;
        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if(i==kth){
                    System.out.println(a[kth-1]);
                    flag =true;
                    break;
                }
            }
            if(flag)
                break;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
