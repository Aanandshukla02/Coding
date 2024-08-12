public class mergesort {
    // Method to print the elements of the array
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); // Print each element followed by a space
        }
        System.out.println(); // Move to the next line after printing all elements
    }
    
    // Method to perform merge sort
    public static void sorting(int arr[],int start,int end) {
        if (start>=end) {
            return; // If there is only one element or less, return
        }
        int mid = start+(end-start)/2; // Calculate the middle index
        sorting(arr,start,mid); // Recursively sort the left half
        sorting(arr, mid+1,end); // Recursively sort the right half
        merge(arr,start,mid,end); // Merge the sorted halves
    }
    
    // Method to merge two sorted arrays
    public static void merge(int arr[],int start,int mid,int end) {
        int temp[ ]=new int [end-start+1] ; // Create a temporary array to store merged elements
        int i =start; // Initialize index for the left subarray
        int j = mid+1; // Initialize index for the right subarray
        int k=0; // Initialize index for the temporary array
        
        // Merge elements from both subarrays into the temporary array
        while((i<=mid) && (j <=end)) {
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++]; // If element from left subarray is smaller, add it to temporary array
            }else{
                temp[k++]=arr[j++]; // If element from right subarray is smaller, add it to temporary array
            }
        }
        
        // Add remaining elements from left subarray to temporary array
        while(i<=mid) {
            temp[k++]=arr[i++];
        }
        
        // Add remaining elements from right subarray to temporary array
        while(j<=end) {
            temp[k++]=arr[j++];
        }
        
        // Copy elements from temporary array back to original array
        for(int l=0;l<temp.length;l++) {
            arr[start+l]=temp[l];
        }
    }
    
    // Main method
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};  //given array
        sorting(arr, 0, arr.length-1); // Perform merge sort on the array
        printarray(arr); // Print the sorted array
    }
}
