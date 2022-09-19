public class bubble_sort {
		public static void main(String[] args) {
		int arr[] ={3,52,38,7,45,32,54};
		int temp;
		int n = arr.length;
		for(int i = 0;i < n-1;i++) {
			for(int j= 0;j<n-i-1;j++) {
				if(arr[j]> arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		for(int i = 0;i <n-1;i++) {
			System.out.println(arr[i]);
		}
	
	}
}
