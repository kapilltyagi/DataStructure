package array;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,1,2,3,5,4,1,2,3,4};
        sort(a);
        int[] temp = new int[a.length];
        int j =0;
        for (int i = 0; i < a.length-1 ; i++) {
            if(a[i] != a[i+1]){
               temp[j] = a[i];
               j++;
            }
        }
        temp[j] = a[a.length-1];
        for (int i = 0; i < temp.length ; i++) {
            System.out.print(temp[i]+" ");
        }
    }

    private static void sort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
