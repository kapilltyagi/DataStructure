package array;

public class PrintAllSubArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        printAllSubArray(a);
    }

    private static void printAllSubArray(int[] a) {
        for (int s = 0; s < a.length ; s++) {
            for (int e = s; e < a.length ; e++) {
                printArray(a,s,e);
            }
        }
    }

    private static void printArray(int[] a, int s, int e) {
        for (int i = s; i <= e ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
