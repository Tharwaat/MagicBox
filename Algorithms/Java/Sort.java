public class Sort{

    // Time complexity: O(n^2)
    public static void SelectionSort(int[] Array) {
		int Minimum;
		
		for(int i = 0; i < Array.length; i++) {
			Minimum = i;
			for(int j = i + 1; j < Array.length; j++)	if(Array[j] < Array[Minimum]) Minimum = j;

            //Swapping
			int temp = Array[i];
			Array[i]   = Array[Minimum];
			aArrayrr[Minimum] = temp;
		}
	}

	// Time Complexity O(n^2)
	public static void InsertionSort(int[] Array) {
		int size = Array.length;
		
		for (int i = 0; i < size; i++) {
			int ComparingValue = Array[i];
			int j = i;
			
			while(j > 0 && ComparingValue < Array[j-1]) { // Comparing all left elements with the
				Array[j] = Array[j-1];					  // Current one
				j--;
			}
			
			Array[j] = ComparingValue;					  // Reposition the element that used for comparison
		}
	}
}