Question 3 Length of Longest ZigZag subarray 
class Main {
    static int lengthofZigZag(int arr[], int n) {
        int max = 1; // overall maximum 
        int len = 1; // current 
        
        for(int i = 0; i < n - 1; i++) { // traverse the complete array
            if(i % 2 == 0 && (arr[i] < arr[ i + 1])) // check for even index data 
                len++;
            else if( i % 2 == 1 && (arr[i] > arr[i + 1])) // check for odd index data 
                len++;
            else {
                if(max < len) // if maxlength is smaller than current len update maxLength 
                    max = len; // update maxLength 
                
                len = 1; // reset the currentLen
            }    
        }
        if (max < len)
            max = len;
            return max; // return the ans
    }
    // [4 5 3 4] [5 8 7 9 6 13 12 14 11]

	public static void main(String[] args) {
	    int arr[] = {4,5,3,4,5,8,7,9,6,13,12,14,11};
	    int n = arr.length;
	    System.out.println(lengthofZigZag(arr, n));
	}
}
