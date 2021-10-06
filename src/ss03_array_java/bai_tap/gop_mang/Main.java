package ss03_array_java.gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // dùng chung cho 2 mảng khải báo
        // nhập mảng 1
        System.out.println("Nhập vào số phần tử của mảng A: "); // hiển thì cho người dùng nhập
        int n = Integer.parseInt(input.nextLine());  // n là số phần tử được nhập vào
        int[] arrayA = new int[n];  // khai báo độ dài của mảng
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Nhập Vào Phần Tử Thứ : " + i + " Của Mảng A !");
            arrayA[i] = Integer.parseInt(input.nextLine());
        }
        // nhập mảng 2
        System.out.println("Nhập vào số phần tử của mảng B: "); // hiển thì cho người dùng nhập
        int m = Integer.parseInt(input.nextLine());  // n là số phần tử được nhập vào
        int[] arrayB = new int[m];  // khai báo độ dài của mảng
        for (int y = 0; y < m; y++) {
            System.out.println("Nhập Vào Phần Tử Thứ : " + y + " Của Mảng B !");
            arrayB[y] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Mảng A Có Cách Phần Tử Là :" + Arrays.toString(arrayA));
        System.out.println("Mảng B Có Cách Phần Tử Là :" + Arrays.toString(arrayB));
        int[] array = new int[m + n];
        for (int k = 0; k < arrayA.length; k++) {
            array[k] = arrayA[k];
        }
        for (int z = 0; z < arrayB.length; z++) {
            array[arrayA.length+z] = arrayB[z];
        }
        System.out.println("Mảng Sau Khi Gộp Có Cách Phần Tử Là :");
        System.out.print(Arrays.toString(array));
    }

}

