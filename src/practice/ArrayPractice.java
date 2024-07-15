package practice;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 7, 9, 0, 24, 78 };
		for (int i = 0; i < (a.length); i++) {
			System.out.println(a[i]);
		}
		System.out.println("HI");
System.out.println("Hello");
		int b[][] = { { 2, 8, 10 }, { 5, 9, 10 }, { 1, 8, 4 } };
		System.out.println(b.length);
		for (int j = 0; j < (b.length); j++) {
			for (int k = 0; k < (b.length); k++) {
				System.out.println(b[j][k]);
			}
		}
	}
}
