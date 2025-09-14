package Lab1_Java_Refresher_Setup;

public class main {
	public static void main(String[] args) {
		int sortedNumber = DigitsDescending.sortDigitsDescending(42145);
		System.out.println("Sorted Number: " + sortedNumber);

		int sortedNumber2 = DigitsDescending.sortDigitsDescending(-145263);
		System.out.println("Sorted Number: " + sortedNumber2);
	}
}
