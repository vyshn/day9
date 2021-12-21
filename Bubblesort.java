public class Bubblesort
{  
    static void bubbleSort(int[] arr)
     {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arr[j-1] > arr[j])
                          {  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
    public static void main(String[] args) {  
        int arr[] ={3,4,8,0,6,7,2,1,9,5};  
         
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

}  
} 
OUTPUT:
D:\vyshnavi>javac Bubblesort.java

D:\vyshnavi>java Bubblesort
Array Before Bubble Sort
3 4 8 0 6 7 2 1 9 5
Array After Bubble Sort
0 1 2 3 4 5 6 7 8 9