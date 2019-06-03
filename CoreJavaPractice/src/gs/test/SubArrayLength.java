package gs.test;

public class SubArrayLength {

	public static int minSubArrayLen(int s, int nums[]) {
		int n = nums.length;

		if (nums.length == 0)
			return 0;

		int end = 0, start = 0;
		int sum = 0, len = 0;
		int min = nums.length + 1;

		while (true) {

			sum += nums[end];
			len = end - start + 1;

			if (sum >= s) {
				if (min > len)
					min = len;
				sum -= nums[start++] - nums[end];
			} else {
				end++;
			}
 
			if (end == nums.length)
				break;
		}
		return (min == nums.length + 1) ? 0 : min;
	}

	public static void main(String[] args) {
		boolean result = true;
		int[] arr = { 1, 2, 3, 4,5 ,6,7,8 };

		//System.out.println(minSubArrayLen(6, arr));
		System.out.println("Shortest Lengh SubArray size: " + recMinSubArrayLen(7, arr));
		//System.out.println(recMinSubArrayLen(12, arr));

	}
	
	
	public static int recMinSubArrayLen(int target, int arr[]) {
		
		int finallength  = -1;
				int len = 0;
		for (int counter = 0; counter < arr.length; counter++) {
			
			
			len = SubArrayLen(counter, target, arr);
			if (finallength  != -1) {
			if (len!=0 &&   len < finallength )
				finallength = len;
			}
			else if (len!=0 &&   len > finallength )
				finallength = len;
				
			
		}
		return finallength;
	}
	

	public static int SubArrayLen(int start, int target, int arr[]){
	
		int tot = arr[start];
		int length = 0 ;
		
		
		int end=start;
		for ( int scntr = start; scntr < arr.length; scntr++)
		{
			if(tot == target) {
				length =1; 
			} else if (target > tot && scntr+1 < arr.length)
			{
				tot +=  arr[scntr+1];
				end = scntr+1;
			}
			
			
			if(scntr == arr.length || target <= tot) {
				length = end - start+1;
				for (int subArr = start ; subArr <= end; subArr++)
				System.out.print("  " + arr[subArr]);
				
				System.out.print("  Length:  " + length);
				
				break;
			}
			
		
		}
		
		System.out.println();
		
		return length;
		
	}
	
}
