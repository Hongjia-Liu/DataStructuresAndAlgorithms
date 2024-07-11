package SelectionSort03.UsingGenerics03;

// 选择排序
// 每次循环（第i次），先初始化索引minIndex为i
// 找[i, n)区间内的最小值，找到后更新索引minIndex
// 将minIndex位置的元素与i位置的元素交换
// 交换后，arr[0...i]元素都是有序的，索引i之后的元素都是无序的
// 时间复杂度：O(n^2)
public class SelectionSort {

    private SelectionSort() {}

    public static <E extends Comparable<E>> void sort(E[] arr) {

        // arr[0...i) 是有序的；arr[i...n) 是无序的
        for (int i = 0; i < arr.length; i++) {

            // 选择 arr[i...n) 中的最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // 循环结束后，minIndex 是 arr[i...n) 中的最小值的索引
            // 交换 arr[i] 和 arr[minIndex]
            swap(arr, i, minIndex);
            // 交换后，arr[0...i] 是有序的；arr(i...n) 是无序的
        }

    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        Integer[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSort.sort(arr);
        for (Integer e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

}