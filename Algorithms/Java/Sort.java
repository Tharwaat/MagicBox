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
}