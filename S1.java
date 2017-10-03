package program;

import java.util.*;
import java.util.Collections;
import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("To Find Largest Even Number From The Given Number");
		System.out.println("Enter the Number");
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a[] = new int[(int) Math.log10(n) + 1];
		int b[] = new int[a.length];
		int k = 0;
		int f = 0;
		int e = 0;
		int temp = 0;
		while (n != 0) {
			a[k++] = n % 10;
			n = n / 10;
		}
		Arrays.sort(a);
		int h = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[h++] = a[i];
		}
		if (b[b.length - 1] % 2 != 0) {
			for (int j = b.length - 1; j >= 0; j--) {
				if (b[j] % 2 == 0) {
					f = 1;
					temp = b[j];
					e = j;
					break;
				}
			}
		}
		if (f == 1) {
			for (int i = e; i < b.length - 1; i++) {
				b[i] = b[i + 1];
			}
			b[b.length - 1] = temp;
		}
		System.out.println("Largest Even Number");
		for (int s = 0; s < b.length; s++) {

			System.out.print(b[s]);
		}
	}
}