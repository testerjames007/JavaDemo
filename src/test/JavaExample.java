package test;

public class JavaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2nd largest num in array
				int arr[] = {78,120,98,80,96,72,19,100};
				int max = arr[0], secmax = arr[0];
				
				for(int i=1;i<arr.length;i++){
					
					if(arr[i]>max)
					{
						secmax = max;
						max=arr[i];
					}
					
					if(arr[i]<max && arr[i]>secmax)
						secmax = arr[i];
						
				}
				
				System.out.println(max+"\n"+secmax);

	}

}
