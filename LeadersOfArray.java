import java.util.ArrayList;
class LeadersOfArray{
	static ArrayList<Integer> leader(int [] arr){
		ArrayList<Integer> led = new ArrayList<>();
		
		int n = arr.length;
		for(int i=0; i<n; i++){
			int j;
			for(j=i+1; j<n; j++){
				if(arr[i] < arr[j]){
					break;
				}
			}
			if(j == n){
			    led.add(arr[i]);
		    }
		}
		
		return led;
	}
	
	public static void main(String[] args){
		int[] arr = {45,67,5,3,3,34,3};
		
		ArrayList<Integer> result = leader(arr);
		for(int e: result){
			System.out.print(e+" ");
		}
	}
}
		