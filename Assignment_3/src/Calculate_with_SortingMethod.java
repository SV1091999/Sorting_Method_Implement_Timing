import java.util.Random;


public class Calculate_with_SortingMethod {

	   public static void main(String[] args) {
	        Random random = new Random();
	        int[] array;
	        long start, end, Timetaken;
	        
	        // for 100,1000,10000,100000
	        for (int n = 100; n <= 100000; n *= 10) {
	            array = new int[n];
	            
	            // making random array
	            for (int i = 0; i < n; i++) {
	                array[i] = random.nextInt(1000000);
	            }
	            
	            // insertion sort
	            int[] arr1 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr1[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.insertionSort(arr1);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Input size n = " + n + " (random array of size " + n + ")");
	            System.out.println("Insertion sort running time to sort array in ascending order: " + Timetaken + " ms");
	            
	            // bubble sort
	            int[] arr2 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr2[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.bubbleSort(arr2);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Bubble sort running time to sort array in ascending order: " + Timetaken + " ms");
	            
	            // selection sort
	            int[] arr3 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr3[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.selectionSort(arr3);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Selection sort running time to sort array in ascending order: " + Timetaken + " ms");
	            
	            // merge sort
	            int[] arr4 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr4[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.mergeSort(arr4, 0, arr4.length - 1);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Merge sort running time to sort array in ascending order: " + Timetaken + " ms");
	            System.out.println("");
	            
	            
	            
	            //sorted ascending array
	            for (int i = 0; i < n; i++) {
	                array[i] = i;
	            }
	            
	            // insertion sort
	            arr1 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr1[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.insertionSort(arr1);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Input size n = " + n + " (sorted ascending array of size " + n + ")");
	            System.out.println("Insertion sort running time to sort array in ascending order: " + Timetaken + " ms");
	            
	            // bubble sort
	            arr2 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr2[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.bubbleSort(arr2);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Bubble sort running time to sort array in ascending order: " + Timetaken + " ms");
	            
	            // selection sort
	            arr3 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr3[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.selectionSort(arr3);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Selection sort running time to sort array in ascending order: " + Timetaken + " ms");
	            
	            //merge sort
	            arr4 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr4[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.mergeSort(arr4, 0, arr4.length - 1);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Merge sort running time to sort array in ascending order: " + Timetaken + " ms");
	            System.out.println("");
	            
	            
	            
	            // sorted descending array
	            for (int i = 0; i < n; i++) {
	                array[i] = n - i - 1;
	            }
	            
	            // insertion sort
	            arr1 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr1[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.insertionSort(arr1);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Input size n = " + n + " (sorted descending array of size " + n + ")");
	            System.out.println("Insertion sort running time to sort array in ascending order: " + Timetaken + " ms");
	            
	            // bubble sort
	            arr2 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr2[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.bubbleSort(arr2);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Bubble sort running time to sort array in ascending order: " + Timetaken + " ms");
	            
	            // selection sort
	            arr3 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr3[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.selectionSort(arr3);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Selection sort running time to sort array in ascending order: " + Timetaken + " ms");
	            
	            // merge sort
	            arr4 = new int[n];
	            for (int i = 0; i < array.length; i++) {
	                arr4[i] = array[i];
	            }
	            start = System.currentTimeMillis();
	            SortMethod.mergeSort(arr4, 0, arr4.length - 1);
	            end = System.currentTimeMillis();
	            Timetaken = end - start;
	            System.out.println("Merge sort running time to sort array in ascending order: " + Timetaken + " ms");
	            System.out.println("");
	        }
	    }
	}
