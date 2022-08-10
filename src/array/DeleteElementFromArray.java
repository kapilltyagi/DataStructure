package array;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,99,5,6,7};
        int index=-1,item=99;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == item){
                index = i;
                break;
            }
        }

        for (int i = index; i < a.length-1; i++) {
           a[i] = a[i+1];
        }

        for (int i = 0; i < a.length-1 ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
