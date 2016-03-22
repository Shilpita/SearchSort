import java.util.Scanner;

public class BinarySearch {
	private static int iterativeFindBinary(int[] arr, int low, int high, int x){	
		int m ;
		while (low <= high){
			m = (high + low)/2;
		if(arr[m] == x)
			return m;
		else if (arr[m] < x)
			//return findBinary(arr , m+1 , high , x);
			low = m+1;
		else
		   // return findBinary(arr , low , m-1 ,x);
			high = m-1;
		}
		return -1;
	}
 
	private static int recursiveFindBinary (int[] arr , int low ,int high , int x){
		if(low <= high){
			int m = (high + low)/2;
			if(arr[m] == x) return m;
			else if (arr[m] < x) return recursiveFindBinary( arr , m+1 , high , x);
			else return recursiveFindBinary(arr , low , m-1 ,x);
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={0, 4, 11, 22, 46, 56, 61, 89, 99, 101, 234, 876, 900};
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter x :");
		 int x = in.nextInt();
		int foundX = iterativeFindBinary(arr, 0, arr.length-1 , x);
		
		if(foundX >= 0)
			System.out.println("\n The x "+ x +" is at the index "+ foundX + " using iterative approach.");
		else
			System.out.println("\n The x "+ x +" is not found in array using iterative approach.");

		 System.out.println("Enter y :");
		 int y = in.nextInt();
		int foundY = recursiveFindBinary(arr, 0, arr.length-1 , y);
		
		if(foundY >= 0)
			System.out.println("\n The y "+ y +" is at the index "+ foundY + " using recursive approach.");
		else
			System.out.println("\n The y "+ y +" is not found in array using recursive approach.");
		
	}

}
