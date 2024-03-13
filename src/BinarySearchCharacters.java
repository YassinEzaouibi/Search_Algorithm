import java.util.Arrays;

public class BinarySearchCharacters {

    int binarySearch(String[] arr, String target) {
        int low = 0, arrayLength = arr.length - 1;
        while (low <= arrayLength) {
            int mid = low + (arrayLength - low) / 2;

            // hna kan9lbo 3la target dyalna li hwo tinghir wach kayn f l mid
            if (arr[mid].equals(target)) return mid;

            // ila kan l mid kbir mn target (ASCII code) les donnes les fjnb lyssed ma kanchofoch fihom
            if (arr[mid].compareTo(target) < 0) {
                low = mid + 1;
            }

                // ama ila kan l mid saghir mn target (ASCII code) les donnes les fjnb lyman ma kanchofoch fihom
            else arrayLength = mid - 1;
        }

        // ama ila makanch kanrj3o b -1 o kansaliw
        return -1;
    }

    // Driver code
    public static void main(String[] args) {
        BinarySearchCharacters ob = new BinarySearchCharacters();
        String[] cities = {
                "Casablanca", "Rabat", "Tangier",
                "Al-Hoceima", "Ouazzane", "Fes",
                "Meknes", "Taza", "Tetouan",
                "Chefchaouen", "Larache",
                "Ksar El-Kebir", "Asilah",
                "Kenitra", "Sidi Kacem",
                "Sidi Slimane", "Sidi Yahya El-Gharb",
                "Souk El-Arbaa", "Taounate", "Ouezzane",
                "Boulemane", "Sefrou", "El Hajeb",
                "Ifrane", "Khénifra", "Midelt",
                "Azrou", "Errachidia", "Moulay Ali Cherif",
                "Taza", "Tinghir", "Zagora", "Ouarzazate",
                "Beni Mellal", "Fquih Ben Salah",
                "Khouribga", "Kasba Tadla", "Berrechid",
                "Settat", "El Jadida", "Safi",
                "Youssoufia", "Marrakech", "Essaouira",
                "Chichaoua", "El Kelaa des Sraghna",
                "Khemisset", "Benguerir", "Khouribga",
                "Ben Slimane", "Berrechid", "Settat",
                "El Jadida", "Safi", "Youssoufia",
                "Marrakech", "Essaouira", "Chichaoua",
                "El Kelaa des Sraghna", "Khemisset",
                "Benguerir", "Khouribga", "Ben Slimane",
                "Berrechid", "Settat", "El Jadida",
                "Safi", "Youssoufia", "Marrakech",
                "Essaouira", "Chichaoua",
                "El Kelaa des Sraghna", "Khemisset",
                "Benguerir", "Khouribga", "Ben Slimane",
                "Berrechid", "Settat", "El Jadida",
                "Safi", "Youssoufia", "Marrakech",
                "Essaouira", "Chichaoua", "El Kelaa des Sraghna",
                "Khemisset", "Benguerir", "Khouribga",
                "Ben Slimane", "Berrechid", "Settat"
        };

        Arrays.sort(cities);
        System.out.println("we are looking for Tinghir in the array of cities.");
        String target = "Tinghir";
        String target2 = "Tinghir";

        long startTimeWithArrays = System.nanoTime();
        int index = Arrays.binarySearch(cities, target);
        long endTimeWithArrays = System.nanoTime();

        long startTime = System.nanoTime();
        int result = ob.binarySearch(cities, target2);
        long endTime = System.nanoTime();

        System.out.println("Binary search example with Arrays.binarySearch() method");
        if (index == -1) System.out.println("Element is not present in array");
        else System.out.println("Element is present at index " + index);
        System.out.println("Execution time of binary with Arrays Binary search in nanoseconds: " + ( endTimeWithArrays - startTimeWithArrays ));

        System.out.println("=====================================================================================================");

        System.out.println("Binary search example with custom binary search method");
        if (result == -1) System.out.println("Element is not present in array");
        else System.out.println("Element is present at index " + index);
        System.out.println("Execution time of binary search with my custom in nanoseconds: " + ( endTime - startTime ));
    }
}