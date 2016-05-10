/*********************************************************************************************
 * author : Shilpita Roy
 * date   : 21 March 2016
 * purpose: Sorting methods with O(N*N) complexity
 *********************************************************************************************/

public class Sorting {
    static int[] arr = {10,200,78,1,0,-2,19,45};
    
    private static void swap(int a,int b){
    	a= a+b;
    	b= a-b;
    	a= a-b;
    }
    
    private static void printArr(){
    	System.out.println();
    	for(int i=0; i< arr.length; i++ ){
    		System.out.print(arr[i]+"\t");
    	}
    }
    // complexity is O(n*n)
    private static void selectionSort() {
    	printArr();
    	int minInd ; 
    	for(int i =0 ; i< arr.length-1 ; i++){
    		minInd = i;
    		for(int j = i+1; j< arr.length ;j++){
    			if(arr[minInd] > arr[j])
    				minInd = j; // finds the index of min element in each iteration
    		}
    		//swap(arr[minInd],arr[i]);
    		
    		arr[minInd] = arr[minInd]+arr[i];
    		arr[i]		= arr[minInd]-arr[i];
    		arr[minInd] = arr[minInd]-arr[i];
    		
    	}
    	
    	printArr();
    	
    }
    
 // complexity is O(n*n)
    private static void bubbleSort() {
    	printArr();
    	for(int i =0 ; i< arr.length-1 ; i++){
    		 for(int j = 0; j< arr.length-i-1 ;j++){
	    			if(arr[j] > arr[j+1]){
	    				//swap(arr[j+1],arr[j]);
	    				
			    		arr[j] = arr[j+1]+arr[j];
			    		arr[j+1] = arr[j]-arr[j+1];
			    		arr[j] = arr[j]-arr[j+1];
			    		
	    			}
    	     }
    	}
    	printArr();
    	
    }
    
    // complexity is O(n*n)
    private static void insertionSort() {
    	printArr();
    	for(int i =1 ; i< arr.length ; i++){
    		int key = arr[i];
    		int j= i-1;
    		while(j>=0 && key < arr[j]){
    			arr[j+1]= arr[j];
    			j--;
    		}
    			
    		 arr[j+1] = key;
    	}
    	printArr();
    	
    }
    
    
    
    
	public static void main(String[] args) {
		Sorting s = new Sorting();
		//s.selectionSort();
		s.bubbleSort();
		//s.insertionSort();

	}

}
