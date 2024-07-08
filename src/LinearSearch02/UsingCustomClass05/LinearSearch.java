package LinearSearch02.UsingCustomClass05;

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

        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};

        int res = LinearSearch02.UsingGeneric04.LinearSearch.search(data, 16); // Expect 4
        System.out.println(res);

        int res2 = LinearSearch02.UsingGeneric04.LinearSearch.search(data, 666); // Expect -1
        System.out.println(res2);

        Student[] students = {
                new Student("Alice"),
                new Student("Bobo"),
                new Student("Charles")
        };

        Student bobo = new Student("Bobo");
        int res3 = LinearSearch.search(students, bobo); // Expect 1
        System.out.println(res3);

    }
}
