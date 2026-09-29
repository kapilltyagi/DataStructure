package arrays;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5 };
		int n = a.length;
		int totalsum = n * (n + 1) / 2;
		System.out.println(totalsum - Arrays.stream(a).sum());
	}

}
