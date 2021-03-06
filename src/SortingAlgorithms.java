import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SortingAlgorithms {

    public static int insertionSort(int arr[], int n)
    {
        int count = 0;

        for (int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                count++;
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return count;
    }
    public static int insertionSort(Integer arr[], int n)
    {
        int count = 0;

        for (int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                count++;
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return count;
    }

    public static Inte quickSort(int arr[])
    {
        Inte cost = new Inte();
        quickSort(arr,0, arr.length-1, cost);
        return cost;
    }

    private static void quickSort(int arr[], int low, int high, Inte cost)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high, cost);
            quickSort(arr, low, pi-1, cost);
            quickSort(arr, pi+1, high, cost);
        }
    }


    private static int partition(int arr[], int low, int high, Inte cost)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            cost.incrementX();
            if (arr[j] <= pivot)
            {
                i++;

                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static Inte heapSort(int arr[])
    {
        Inte count = new Inte();
        int length = arr.length;

        buildMaxHeap(arr, length, count);
        for(int i = length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, 1, i, count);
        }
        return count;
    }

    private static void buildMaxHeap(int[] array, int heapSize, Inte count) {
        if(array == null) {
            throw new NullPointerException("null");
        }
        if(array.length <=0 || heapSize <= 0) {
            throw new IllegalArgumentException("illegal");
        }
        if(heapSize > array.length) {
            heapSize = array.length;
        }

        for(int i = heapSize/2; i > 0; i--) {
            maxHeapify(array, i, heapSize, count);
        }
    }

    private static void maxHeapify(int[] array, int index, int heapSize,Inte count) {
        int l = index * 2;
        int r = l + 1;
        int largest;

        if(l <= heapSize && array[l - 1] > array[index - 1]) {
            largest = l;
        } else {
            largest = index;
        }

        if(r <= heapSize && array[r - 1] > array[largest - 1]) {
            largest = r;
        }

        if(largest != index) {
            int temp = array[index - 1];
            array[index - 1] = array[largest - 1];
            array[largest - 1] = temp;
            count.incrementX();
            maxHeapify(array, largest, heapSize, count);
        }
    }

    public static Inte mergeSort(int[] array)
    {
        Inte cost = new Inte();
        mergeSort(array, 0, array.length-1, cost);
        return cost;
    }

    private static void mergeSort(int[] array, int low, int high, Inte cost)
    {
        if(low < high){
            int middle = (low + high) / 2;
            mergeSort(array, low, middle, cost);
            mergeSort(array, middle+1, high, cost);
            merge(array, low, middle, high, cost);
        }
    }

   private static void merge(int[] array, int low, int middle, int high, Inte cost){
        int[] helper = new int[array.length];
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle+1;
        int current = low;

        while (helperLeft <= middle && helperRight <=high) {
            cost.incrementX();
            if(helper[helperLeft] <= helper[helperRight]){
                array[current] = helper[helperLeft];
                helperLeft++;

            }else{
                array[current] = helper[helperRight];
                helperRight++;
            }
            current ++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current+i] = helper[helperLeft+ i];
        }
    }

    static Inte radixSort(int arr[], int n)
    {   Inte cost = new Inte();
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, n, exp, cost);
        return cost;
    }

    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    static void countSort(int arr[], int n, int exp, Inte cost)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            cost.incrementX();
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static void bucketSort(Integer[] array, int bucketSize)
    {
        if (array.length == 0)
        {
            return;
        }

        // Determine minimum and maximum values
        Integer minValue = array[0];
        Integer maxValue = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < minValue)
            {
                minValue = array[i];
            } else if (array[i] > maxValue)
            {
                maxValue = array[i];
            }
        }

        // Initialise buckets
        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
        for (int i = 0; i < bucketCount; i++)
        {
            buckets.add(new ArrayList<Integer>());
        }

        // Distribute input array values into buckets
        for (int i = 0; i < array.length; i++)
        {
            buckets.get((array[i] - minValue) / bucketSize).add(array[i]);
        }

        // Sort buckets and place back into input array
        int currentIndex = 0;
        for (int i = 0; i < buckets.size(); i++)
        {
            Integer[] bucketArray = new Integer [buckets.get(i).size()];
            bucketArray = buckets.get(i).toArray(bucketArray);
            insertionSort(bucketArray, bucketArray.length);
            for (int j = 0; j < bucketArray.length; j++)
            {
                array[currentIndex++] = bucketArray[j];
            }
        }
    }

}
