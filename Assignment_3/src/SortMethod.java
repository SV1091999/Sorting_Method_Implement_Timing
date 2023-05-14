
public class SortMethod {
	
	//Insertion Sort
	public static void insertionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 1; i < n; i++) {
	        int key = arr[i];
	        int j = i - 1;

	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	    }
	}

	//Selection Sort
	public static void selectionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        int minindex = i;
	        for (int j = i + 1; j < n; j++)
	            if (arr[j] < arr[minindex])
	            	minindex = j;
	        int temp = arr[minindex];
	        arr[minindex] = arr[i];
	        arr[i] = temp;
	    }
	}

	
	//Bubble Sort
	public static void bubbleSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	}


	
	//Merge Sort
	
	public static void mergeSort(int[] arr, int leftindex, int rightindex) {
	    if (leftindex < rightindex) {
	        int m = (leftindex + rightindex) / 2;
	        mergeSort(arr, leftindex, m);
	        mergeSort(arr, m + 1, rightindex);
	        merge(arr, leftindex, m, rightindex);
	    }
	}

	public static void merge(int[] arr, int leftindex, int middleindex, int rightindex) {
	    int n1 = middleindex - leftindex + 1;
	    int n2 = rightindex - middleindex;

	    int L[] = new int[n1];
	    int R[] = new int[n2];

	    for (int i = 0; i < n1; i++)
	        L[i] = arr[leftindex + i];
	    for (int j = 0; j < n2; j++)
	        R[j] = arr[middleindex + 1 + j];

	    int i = 0, j = 0;
	    int k = leftindex;
	    while (i < n1 && j < n2) {
	        if (L[i] <= R[j]) {
	            arr[k] = L[i];
	            i++;
	        } else {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}
}
