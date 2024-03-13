class BinarySearchExample {

    int binarySearch(int[] arr, int target) {
        int low = 0, arrayLength = arr.length - 1;
        while (low <= arrayLength) {
            int mid = low + (arrayLength - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == target)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < target)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                arrayLength = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    // Driver code
    public static void main(String[] args) {

        // binary search example
        System.out.println("Binary search example" );
        BinarySearchExample ob = new BinarySearchExample();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
/*
        int n = arr.length;
*/

        int x = 5000;

        long startTimeBinary = System.nanoTime();
        int result = ob.binarySearch(arr, x);
        long endTimeBinary = System.nanoTime();

        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
        System.out.println("Execution time of binary search in nanoseconds: " + (endTimeBinary - startTimeBinary));


        // linear search example
        System.out.println("Linear search example" );
        int[] arr2 = new int[10000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        int x2 = 5000;

        long startTimeLinear = System.nanoTime();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == x2) {
                System.out.println("Element is present at "
                        + "index " + i);
                break;
            }
        }
        long endTimeLinear = System.nanoTime();
        System.out.println("Execution time of linear search in nanoseconds: " + (endTimeLinear - startTimeLinear));
    }
};