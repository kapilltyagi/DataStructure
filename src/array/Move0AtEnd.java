package array;

public class Move0AtEnd {
	public static void main(String[] args) {
		int[] a = {1,0,2,0,5,0,9,0,1,0,17,0,1};
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != 0) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
