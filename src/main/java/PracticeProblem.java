public class PracticeProblem {

	public static int[] createIntArray() {
		int[] val = new int[5];
		for (int i = 1; i <= 5; i++) {
			val[i-1] = i;
		}
		return val;
	}

	public static String[] createArray(String s1, String s2, String s3, String s4) {
		
		String[] val = new String[4];

		val[0] = s1;
		val[1] = s2;
		val[2] = s3;
		val[3] = s4;
		return val;	
	}

	public static int findValue( int thisInt, int[] thisArray) {
		for (int i = 0; i < thisArray.length; i++ ){
			if (thisArray[i] == thisInt) {
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String thisString, String[] thisArray) {
		int occurrences = 0;
		for (int i = 0; i < thisArray.length; i++ ){
			if (thisArray[i].equals(thisString)) {
				occurrences += 1;
				if (occurrences == 3) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String args[]) {

	}


}


/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18370755)
# Instructions  

  ## Questions

1. Create a function called _createIntArray()_.  It has no parameters. Store the integers 1-5 into an array using a loop.  Return the array.
2. Create a function called _createArray()_.  It has 4 Strings as parameters.  Store the four string in the array in the order of their parameters.   Return the arrays.
3. Create a function called _findValue()_ which takes in an integer and an integer array as parameters.  Return the index of the first occurance of the integer in the array.  return -1 if the integer is not in the array.
4. Create a function called _findThirdValue()_ which take in an String and an String array as parameters.  Return the index of the third occurance of the String in the array.  return -1 if the String is not in the array.
*/