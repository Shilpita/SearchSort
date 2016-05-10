/*********************************************************************************************
 * author : Shilpita Roy
 * date   : 6 May 2016
 * purpose: Merge Sort
 *********************************************************************************************/

public class MergeSort {
	static int[] arr ={10,200,78,1,20,-2,19,45};
	
	   private static void printArr(int[] arr){
	    	System.out.println();
	    	for(int i=0; i< arr.length; i++ ){
	    		System.out.print(arr[i]+"\t");
	    	}
	    }
	   
	   private static void merge(int[] arr ,int left ,int right){
		   int mid = 0;
		   if (arr == null || arr.length == 0) 
	            return;
		   if(left < right){
		     mid = (left+right)/2;
		     merge(arr, left , mid);
		     merge(arr, mid+1, right);
		     mergesort(arr, left, mid ,right);  
		   }
	   }
	   private static void mergesort(int[] arr , int low, int mid , int high){
		   int i =0 , j =0 , k= low;
		   int l1 = mid-low +1;
		   int l2 = high - mid;
		   int a1[] = new int[l1];
		   int a2[] = new int[l2];
		   for(i =0 ; i< l1 ;i++)
			   a1[i] = arr[low+i];
		   for(j=0; j <l2 ; j++)
			   a2[j] = arr[mid+1+j];
		   i=0;
		   j=0;
		   while(i< l1 && j< l2 ){
			   if(a1[i]< a2[j]){
				   arr[k]=a1[i];
				   i++;
			   }else{
				   arr[k]= a2[j];
				   j++;
			   }
				 k++;  
		   }
		   while(i< l1 ){
			   arr[k]= a1[i];
			   i++;
			   k++;
		   }
		   
		   while(j< l2){
			   arr[k]= a2[j];
			   j++;
			   k++;
		   }
	   }
	   
	   
	   
	public static void main(String[] args) {
		MergeSort m = new MergeSort();
		System.out.println("Unsorted array");
		m.printArr(arr);
		
		m.merge(arr,0 , arr.length-1 );
		System.out.println("\nSorted array");
		m.printArr(arr);

	}

}
