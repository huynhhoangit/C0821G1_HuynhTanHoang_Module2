package ss02_loop_java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check;
        check = Boolean.TRUE;
        while (check) {
            System.out.println("Menu");
            System.out.println("1. Hình Chữ Nhật");
            System.out.println("2. Hình Tam Giác Vuông");
            System.out.println("3. Hình Tam Giác Cân");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number == 1) {
                System.out.println("Hình Chữ Nhật");
                System.out.println("* * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * *");

                check = false;
            } else if (number == 2) {
                boolean check2;
                check2 = Boolean.TRUE;
                while (check2) {
                System.out.println("Menu Tam Giác Vuông Cân ");
                System.out.println("1. Hình Tam Giác cân A");
                System.out.println("2. Hình Tam Giác cân B");
                System.out.println("3. Hình Tam Giác cân C");
                System.out.println("4. Hình Tam Giác cân D");
                System.out.println("Enter your choice: ");
                Scanner TCV = new Scanner(System.in);
                int tamvuong = TCV.nextInt();
                switch (tamvuong) {
                    case 1:
                        System.out.println("Hình Tam Giác cân A");
                        System.out.println("* ");
                        System.out.println("* * ");
                        System.out.println("* * * ");
                        System.out.println("* * * * ");
                        System.out.println("* * * * * ");
                        System.out.println("* * * * * * ");
                        check2 = false;
                        break;

                    case 2:
                        System.out.println("Hình Tam Giác cân B");
                        System.out.println("           * ");
                        System.out.println("         * * ");
                        System.out.println("       * * * ");
                        System.out.println("     * * * * ");
                        System.out.println("   * * * * * ");
                        System.out.println(" * * * * * * ");
                        check2 = false;
                        break;
                    case 3:
                        System.out.println("Hình Tam Giác cân c");
                        System.out.println("* * * * * * * ");
                        System.out.println("  * * * * * * ");
                        System.out.println("    * * * * * ");
                        System.out.println("      * * * * ");
                        System.out.println("        * * * ");
                        System.out.println("          * * ");
                        System.out.println("            * ");
                        check2 = false;

                        break;
                    case 4:
                        System.out.println("Hình Tam Giác cân D");
                        System.out.println("* * * * * * * ");
                        System.out.println("* * * * * *   ");
                        System.out.println("* * * * *     ");
                        System.out.println("* * * *       ");
                        System.out.println("* * *         ");
                        System.out.println("* *           ");
                        System.out.println("*             ");
                        check2 = false;
                        break;

                    }
                }
                check = false;


            } else if (number == 3) {
                System.out.println("Hình Tam Giác Cân");
                System.out.println("        *         ");
                System.out.println("       * *        ");
                System.out.println("      * * *       ");
                System.out.println("     * * * *      ");
                System.out.println("    * * * * *     ");
                System.out.println("   * * * * * *    ");
                System.out.println("  * * * * * * *   ");

                check = false;
            } else if (number == 0) {
                System.exit(0);
                check = false;
            }
        }
    }
}
