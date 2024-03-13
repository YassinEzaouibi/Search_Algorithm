public class BinarySearchCharacters {

    int binarySearch(char[] arr, char target) {
        int low = 0, arrayLength = arr.length - 1;
        while (low <= arrayLength) {
            int mid = low + (arrayLength - low) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target greater, ignore left half
            if (arr[mid] < target)
                low = mid + 1;

                // If target is smaller, ignore right half
            else
                arrayLength = mid - 1;
        }

        // If we reach here, then element was not present
        return -1;
    }

    // Driver code
    public static void main(String[] args) {
        BinarySearchCharacters ob = new BinarySearchCharacters();
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char x = 'e';
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}