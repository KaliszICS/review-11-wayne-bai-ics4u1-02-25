
class Notes {
	public static void main(String[] args) {
		
		//declare an array

		int[] numArray;
		int numArray1[];

		//create an array with a size of 5

		numArray = new int[5]; //fills the array with default values

		//prebuilt array - filled with values

		numArray = new int[]{1, 3, 5};

		int[] numArray2 = {1, 3, 5}; //new int[] can only be omitted when declaring on the same line as assignment

		//re-assigning a value in an array
		numArray[0] = 5;

		// System.out.println(numArray); //Does not work, outputs the reference

		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = numArray[i] + 8;
			System.out.println(numArray[i]);
		}

		int num = 13; //number we are searching for
		int index = -1; //default value for our index

		//find the last occurance of the value we are looking for
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == num) {
				index = i;
				//either line below will make you find the FIRST occurance
				//break;
				//i = numArray.length;
			}
		}
		System.out.println(index);

		String[] arr = {"z", "b", "c"};
		firstElementA(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void firstElementA(String[] arr) {
		//any array modifications made inside a function, affect the array outside of it
		//altering an array? don't return anything
		arr[0] = "a";
	}

	public static int[] arrayReturn() {
		int[] arr = {};
		return arr;
	}
}
