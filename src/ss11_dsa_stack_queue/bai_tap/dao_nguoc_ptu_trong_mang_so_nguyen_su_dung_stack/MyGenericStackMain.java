package ss11_dsa_stack_queue.bai_tap.dao_nguoc_ptu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Arrays;
import java.util.Scanner;

public class MyGenericStackMain {
    private static void stackOfIntegers() {
        Scanner scanner = new Scanner(System.in);
        MyGenericStack<Integer> myGenericStack = new MyGenericStack<>();
        System.out.println("Nhập Số Phần Tử Của Mảng");
        int siteOfArray = Integer.parseInt(scanner.nextLine()); // nhập số pt trong mảng
        int[] arrayOfIntegers = new int[siteOfArray]; // khai báo một mảng có số kích thước bằng số ptu
        for (int i = 0; i < siteOfArray; i++) {
            System.out.println("Hãy Nhâp Phần Tử Có Index = " + i + " ; ");
            arrayOfIntegers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng Trước Khi Sắp Xếp Stack Là : " + Arrays.toString(arrayOfIntegers));
        for (int i = 0; i < siteOfArray; i++) {
            myGenericStack.push(arrayOfIntegers[i]);//thêm vào cuối stack
        }
        for (int i = 0; i < siteOfArray; i++) {
            arrayOfIntegers[i] = myGenericStack.pop();
        }
        System.out.println("Mảng Sau Khi Sắp Xếp đảo ngược ptu Stack là : " + Arrays.toString(arrayOfIntegers));

    }

    private static void stackOfStrings() {
        Scanner scanner = new Scanner(System.in);
        MyGenericStack<String> myStackStrings = new MyGenericStack<>();
        System.out.println("Hãy Nhập Vào Một Chuỗi : ");
        String inputString = scanner.nextLine();
        String[] inputStringOfArray = inputString.split("");// tách các phần tử trong chuỗi
        StringBuilder outputString = new StringBuilder();//Tạo ra một Builder chuỗi với chuỗi cụ thể.
        for (String element :
                inputStringOfArray) {
            myStackStrings.push(element);
        }
        while (!myStackStrings.isEmpty()) {
            outputString.append(myStackStrings.pop()).append(" ");// được sử dụng để nối thêm các chuỗi được chỉ định với chuỗi này
        }
        System.out.println("Sau khi lấy ra từ stack, câu nhập vào ban đầu sẽ là: " + outputString);

    }

    public static void main(String[] args) {
        stackOfIntegers();
        System.out.println();
        stackOfStrings();
    }
}


