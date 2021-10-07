package ss03_array_java.them_pt_trong_mang;

//import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: "); // hiển thì cho người dùng nhập
        int n = Integer.parseInt(input.nextLine());  // n là số phần tử được nhập vào


        int[] array = new int[n + 1];  // khai báo độ dài của mảng

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập Vào Phần Tử Thứ : " + i + " Của Mảng !");
            array[i] = Integer.parseInt(input.nextLine());

        }
        System.out.print("Mảng Có Cách Phần Tử Là :");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);

        }
        System.out.print("\n");
        System.out.println("Nhập Giá Trị Muốn Thêm :");
        int number;
        number = Integer.parseInt(input.nextLine());

        boolean check = true;

        while (check) {
            System.out.println("Nhập Vị trí Index Muốn Thêm :");
            int index;
            index = Integer.parseInt(input.nextLine());
            if (index < 0 || index > array.length - 1) {
                System.out.println("Bạn Đã Nhập Sai Vị trí Index Muốn Thêm :");
                System.out.println("Xin Vui Lòng Nhập Lại ViTri 0 Đến " + n);

            } else {
                for (int i = array.length - 1; i > index; i--) {
                    array[i] = array[i - 1];
                }
                array[index] = number;
                System.out.print("Mảng sau khi chèn phần tử " + number + " là: " + Arrays.toString(array));
                check = false;
            }
        }
    }


}

