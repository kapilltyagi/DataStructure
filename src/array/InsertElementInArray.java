package array;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7,8};
        int index = 4, element = 5;
        for (int i = a.length-1; i > index ; i--) {
            a[i] = a[i-1];
        }
        a[index] = element;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
