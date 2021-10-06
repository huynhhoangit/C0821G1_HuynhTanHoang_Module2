package ss03_array_java.tim_max_trong_mang_hai_chieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // dùng chung cho 2 mảng khải báo

        // nhập mảng 1
        System.out.println("Nhập vào số phần tử của mảng A: "); // hiển thì cho người dùng nhập
        int n = Integer.parseInt(input.nextLine());  // n là số phần tử được nhập vào
        int[] arrayA = new int[n];  // khai báo độ dài của mảng
        // nhập mảng 2
        System.out.println("Nhập vào số phần tử của mảng B: "); // hiển thì cho người dùng nhập
        int m = Integer.parseInt(input.nextLine());  // n là số phần tử được nhập vào
        int[] arrayB = new int[m];  // khai báo độ dài của mảng

        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.println("Hãy nhập phần tử ở index: " + i + ", " + j);
                array[i][j] = Integer.parseInt(input.nextLine());
            }

        }
        System.out.println("Mảng 2 chiều vừa tạo là: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j]);

            }

        }
        //tim max
        int max = array[0][0];
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.print("Số lớn nhất trong Mảng là " + max + " ở vị trí " + a + ", " + b);
    }

    }
