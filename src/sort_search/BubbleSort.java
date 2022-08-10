package sort_search;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] a = {1,10,2,9,3,8,4,7,6,5};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static void sort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
	}

}
