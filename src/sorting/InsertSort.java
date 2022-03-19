package sorting;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] in = { 6, 4, 7, 2, 8, 5, 1, 7 };
		int[] result = sortArray(in);

		print(result);
	}

	private static void print(int[] result) {
		for (int i : result) {
			System.out.print(i + " ");
		}

	}

// 4,6,7,2
// 
	private static int[] sortArray(int[] in) {

		int N = in.length;

		for (int i = 0; i < N ; i++) {			

			int j = 0;

			while (j < N-(i+1)) {

				if (in[j ] > in[j+1]) {
					int temp = in[j+1];
					in[j+1] = in[j ];
					in[j ] = temp;
				}
				j++;
			}
			print(in);
			System.out.println();

		}
		return in;
	}
}
