package array;

public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,-4,-5,1,-3,5,6,4};
        int currentSum=0,maxSum=0,s=0,e=0;

        for (int i = 0; i < a.length; i++) {
            currentSum = currentSum + a[i];
            if(maxSum < currentSum){
                maxSum = currentSum;
                e=i;
            }
            if(currentSum < 0){
                currentSum = 0;
                s=i+1;
                e=i+1;
            }
        }

        System.out.println("Largest Sum: "+maxSum);
        System.out.println("start index: "+s+"   end index: "+e);
        for (int i = s; i <= e ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
