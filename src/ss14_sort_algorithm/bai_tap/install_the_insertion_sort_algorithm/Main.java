package ss14_sort_algorithm.bai_tap.install_the_insertion_sort_algorithm;

import java.util.Arrays;

public class Main {
    public static void insertSort(int[] list) {
        int key;
        int j;
        for (int i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 6, -4, 8, 4, 1, 6};
        insertSort(list);
        System.out.println(Arrays.toString(list));

    }
}
