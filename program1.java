import java.util.HashSet;
import java.util.Arrays;
class Duplicates {
    static int removeDuplicate(int [] arr){
	HashSet<Integer> remove = new HashSet<>();
    int idx = 0;
    for(int i=0; i<arr.length; i++)){
        if(!remove.contains(arr[i]){
           remove.add(arr[i]);
           arr[idx++] = arr[i];
        }		   
	 }
	 return idx;
	 
	public static void main(String[] args){
	   int[] arr = {2,3,4,5,7,6,5,4,3,2,3,5,6,8,8,6,5,4,23,56,7,56,45};
	   int result = removeDuplicate(arr);
	   Arrays.sort(arr, 0, result);
	   
	    for(int i=0; i<result; i++){
	     System.out.print(arr[i]+" ");
	    }
	}
}