/*********************************************************************************************
 * author : Shilpita Roy
 * date   : 9 May 2016
 * purpose: Heap Sort
 *********************************************************************************************/


public class HeapSort {

	static int[] arr ={10,200,78,1,20,-2,19,45};
	static int l;
    private static void printArr(int[] arr){
    	System.out.println();
    	for(int i=0; i< arr.length; i++ ){
    		System.out.print(arr[i]+"\t");
    	}
    }
	 
    private static void swap(int a,int b){
    	int temp;
    	temp = arr[a];
    	arr[a] = arr[b];
    	arr[b] =temp;
    }
    
    
    private void sort() {  
		
        buildHeap();   
		for(int i = l; i> 0 ; i--){
			swap(0,i);
			l=l-1;
			maxheap(arr,0);
			
		}		
	}
    
    public void buildHeap() {  
        l = arr.length-1;
        
 		for(int i = l/2; i>= 0 ; i--)
 			maxheap(arr,i);
 		
     }
    
	public void maxheap(int[] arr, int i) {
		int left_child = 2*i;
		int right_child = 2*i+1;
		int largest =i;
		
		
		if(left_child <= l && arr[left_child] > arr[i] )
			largest = left_child;
	
		
		if(right_child <= l && arr[right_child] > arr[largest])
			largest = right_child;
		
		if( largest != i){
			swap(i,largest);
			
			maxheap(arr, largest);
		}	
		
	}

	public static void main(String[] args) {
    	HeapSort h = new HeapSort();
		System.out.println("Unsorted array");
		h.printArr(arr);
		
		h.sort();  //arr);
		
		System.out.println("\nSorted array");
		h.printArr(arr);

	}

	

}
