import java.util.Arrays;
import java.util.HashSet;
class Duplicates{
	static int removeDuplicates(int [] arr){
		HashSet<Integer> stored = new HashSet<>();
		
		int idx = 0;
		for(int i=0; i<arr.length; i++){
			if(!stored.contains(arr[i])){
				stored.add(arr[i]);
				arr[idx++] = arr[i];
			}
		}
		return idx;
	}
	
	public static void main(String[] args){
		int[] arr= {2,3,5,7,7,4,3,2,4,7,7,5,5,3,4,5,6};
		
		int result = removeDuplicates(arr);
		
		Arrays.sort(arr, 0, result);
		for(int i=0; i<result; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
