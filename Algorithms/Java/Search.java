public class Search{
    
    // Binary search works only on sorted linear data structures
    public int BinarySearch(int[] Array, int SearchKey) {
		
        int ArrayLength = Array.length;
        int LowPivot = 0; 
        int HighPivot = ArrayLength; 
        int MidPivot; 
		
		while(LowPivot <= HighPivot) {
			MidPivot = (LowPivot + HighPivot) / 2;

			if(Array[MidPivot] < SearchKey) LowPivot = MidPivot + 1;          //In the right half of the array
			else if(Array[MidPivot] > SearchKey) HighPivot = MidPivot - 1;    //In the left half of the array
			else return Array[MidPivot];                                      //Item has been found
		}		
		return -1;  //Item not found
	} 
}