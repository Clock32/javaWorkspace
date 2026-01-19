package HW_01;
public class hw {
	public static void main(String[] args) {

		String[] arr = { "java", "lambda", "hi", "functional", "wow" };
		printString(arr, (str) -> str.length() <= 3);
		printString(arr, (str) -> str.contains("a"));
		printString(arr, (str) -> str.toUpperCase().charAt(0) == 'W');
		printString(arr, (str) -> str.length() % 2 == 0);
	}
	public static void printString(String[] arr, StringChecker cheker) {
		for (String str : arr) {
			if (cheker.check(str)) {

				System.out.println(str);
			}
		}
	}

	@FunctionalInterface
	interface StringChecker {
		boolean check(String str);
	}
}
