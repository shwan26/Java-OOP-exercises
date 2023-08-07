package mid;
import java.util.Arrays;

public class ArrayPostiveNegative {
	
	public static int[] positiveNegative(int[] arr) {
		int p = 0, n = 0;
		for (int num: arr) { // for(int i = 0; i<arr.length;i++) { arr[i] < 0}
			if(num < 0) {
				n++;
			}
			else {
				p++;
			}
		}
		
		int[] positive = new int[p];
		int[] negative = new int[n];
		int indexP = 0, indexN = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if(arr[i]<0) {
				negative[indexN] = arr[i];
				indexN++;
			}
			else {
				positive[indexP] = arr[i];
				indexP++;
			}
		}
		
		Arrays.sort(negative);
		Arrays.sort(positive);
		int[] result = new int[arr.length];
		int k = 0;
		for (int j = 0; j < arr.length; j++) {
			if (j<positive.length) {
				result[j] = positive[j];
			}
			else {
				result[j] = negative[k];
				k++;
			}
			
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		int[] arr = {-5, 10, -3, 0, 8, -1};

        int[] result = positiveNegative(arr);
        //System.out.println(result);
        for (int num : result) {
            System.out.print(num + " ");
        }
		
	}
}
