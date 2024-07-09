package LinearSearch02.TestPerformance09;

public class LinearSearch {

    // This class should not be instantiated
    private LinearSearch() {}

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] dataSize = {100000, 1000000, 10000000};
        for (int n: dataSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);

            long startTime = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                LinearSearch.search(data, n);
            }
            long endTime = System.nanoTime();

            double estimatedTime = (endTime - startTime) / 1000000000.0;
            System.out.println("n = " + n + ", 100 runs : " + estimatedTime + "s");
        }
    }
}