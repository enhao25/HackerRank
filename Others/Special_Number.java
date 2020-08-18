import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Special_Number {
	public static void main(String[] args) {
		System.out.println(specialNumbersStreams(1, 132));
	}

	// public static ArrayList<Integer> specialNumbers(int left, int right) {
	// 	ArrayList<Integer> arr = new ArrayList<>();
	// 	// code here
	// 	outerloop:
	// 	for (int i = left; i <= right; i++) {
	// 		int value = i;
	// 		while(value > 0) {
	// 			int digit = value % 10;
	// 			if (digit == 0 || i % digit != 0) {
	// 				// Not a special number, break current loop and continue at the outer loop
	// 				continue outerloop;
	// 			} 
	// 			value = value / 10;
	// 		}
	// 		// Means the i value is a special number, add to the answer arr
	// 		arr.add(i);
	// 	}
	// 	return arr;
	// }

	public static ArrayList<Integer> specialNumbersStreams(int left, int right) {
		ArrayList<Integer> arr = new ArrayList<>();
		// code here
		IntStream stream = IntStream.range(left, right + 1).filter(x -> {
			// Only return true for special numbers
			int value = x;
			while(value > 0) {
				int digit = value % 10;
				if (digit == 0 || x % digit != 0) {
					return false;
				} 
				value = value / 10;
			}
			return true;
		});
		// Convert stream back to array list
		arr = (ArrayList<Integer>) stream.boxed().collect(Collectors.toList());
		return arr;
	}
}
