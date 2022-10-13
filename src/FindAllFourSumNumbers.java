import java.util.*;

public class FindAllFourSumNumbers {

	public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> fans = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < arr.length - 3; i++) {
			for (int j = i + 1; j < arr.length - 2; j++) {
				int start = j + 1;
				int end = arr.length - 1;
				while (start < end) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					int sum = arr[i] + arr[j] + arr[start] + arr[end];
					if (sum == k) {
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[start]);
						temp.add(arr[end]);
						start++;
						end--;
						if (fans.isEmpty()) {
							fans.add(temp);
						} else if (!fans.contains(temp)) {
							fans.add(temp);
						}
					}
					if (sum < k) {
						start++;
					} else {
						end--;
					}
				}
			}
		}
		return fans;
	}

	public static void main(String[] args) {
		int N = 7;
		int K = 23;
		int A[] = { 10, 2, 3, 4, 5, 7, 8 };
		ArrayList<ArrayList<Integer>> fans = fourSum(A, K);
		System.out.println(fans);
	}

}
