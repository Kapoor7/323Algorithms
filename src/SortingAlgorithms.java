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





}
