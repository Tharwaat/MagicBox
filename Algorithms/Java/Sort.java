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

	//Time Complexity O(n Log (n) ), Space complexity O(n)
	public static void MergeSort(int[] array, int ArraySize) {

		if(ArraySize < 2) return;		// Base case
		
		// Creating Dividing current array into 2 arrays
		int MidPivot = ArraySize / 2;		
		int[] LeftArray  = new int[MidPivot];
		int[] RightArray = new int[ArraySize - MidPivot];
		
		// Filling the 2 arrays
		for (int i = 0; i < MidPivot; i++) LeftArray[i] = array[i];
		for (int i = MidPivot; i < ArraySize; i++) RightArray[i - MidPivot] = array[i];
		
		// Dividing each Array recursively
		MergeSort(LeftArray, MidPivot);
		MergeSort(RightArray, ArraySize - MidPivot);
		
		// Merging each 2 halves
		Merge(array, LeftArray, MidPivot, RightArray, ArraySize - MidPivot);
	}
	
	public static void Merge(int[] MainArray, int[] LeftArray, int LeftArraySize, int[] RightArray, int RightArraySize) {
		
		//Initializing pivots
		int LeftPivot = 0, RightPivot = 0, MainPivot = 0;
		
		// Overwriting the main array
		while( LeftPivot < LeftArraySize && RightPivot < RightArraySize) {
			if(LeftArray[LeftPivot] < RightArray[RightPivot]) MainArray[MainPivot++] = LeftArray[LeftPivot++];
			else MainArray[MainPivot++] = RightArray[RightPivot++];
		}
		
		// Filling remaining parts
		while (LeftPivot < LeftArraySize) MainArray[MainPivot++] = LeftArray[LeftPivot++];
		while (RightPivot < RightArraySize) MainArray[MainPivot++] = RightArray[RightPivot++];
	}




}