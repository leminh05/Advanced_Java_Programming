package Lab1_Java_Refresher_Setup.Task1;

public class DigitsDescending {
	public static int sortDigitsDescending(int num) {
		if (num < 0){
			num = Math.abs(num);
		}
		// Convert the number to a character array
        char[] digits = String.valueOf(num).toCharArray();
		// Sort the character array in descending order using bubble sort
		for (int i = 0; i < digits.length - 1; i++){
			for(int j = 0; j <digits.length - 1 - i; j++){
				if(digits[j] < digits[j+1]){
					char temp = digits[j];
					digits[j] = digits[j+1];
					digits[j+1] = temp;
				}
			}
		}
		// Convert the sorted character array back to a string
		String sortedStr = new String(digits);
		// Convert the string back to an integer
			return Integer.parseInt(sortedStr);
            // Return max value or handle the error as appropriate
        }
}