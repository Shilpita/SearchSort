/*********************************************************************************************
 * author : Shilpita Roy
 * date   : 3 May 2016
 * purpose: Quicksort
 *********************************************************************************************/

public class Quicksort {
	 static int[] arr ={10,200,78,1,20,-2,19,45};
	 
    private static void printArr(int[] arr){
    	System.out.println();
    	for(int i=0; i< arr.length; i++ ){
    		System.out.print(arr[i]+"\t");
    	}
    }
    /*
    public void sort(int[] inputArr) {
        
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.arr = inputArr;
         int length = inputArr.length;
        quickSort(0, length - 1);
    }
*/
    private static void quickSort(int[]arr, int left , int right){
    	int pivot =arr[(left +right )/2];
    	int temp=0;
    	int i = left;
    	int j = right;
    	while(i <= j){
    		while(arr[i] < pivot)
    			i ++;
    		while(arr[j] > pivot)
    			j --;
    		
    		if(i <= j){
    			temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    			i++;
    			j--;
    			
    		}
    		
    	}
    	 if (left < j)
    		 quickSort(arr,left, j);
         if (i < right)
             quickSort(arr,i, right);
         
    }
    
  
    
	public static void main(String[] args) {
		Quicksort q = new Quicksort();
	//	q.arr= {10,200,78,1,20,-2,19,45};
		System.out.println("Unsorted array");
		q.printArr(arr);
		
		q.quickSort(arr,0 , arr.length-1 );
		System.out.println("Sorted array");
		q.printArr(arr);

	}

}
