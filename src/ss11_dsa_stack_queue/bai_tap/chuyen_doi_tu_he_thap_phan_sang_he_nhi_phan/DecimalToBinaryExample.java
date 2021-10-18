package ss11_dsa_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

public class DecimalToBinaryExample {
    public void converBinary(int num){
        int binary[] = new int[40];
        int index = 0 ;

        while (num > 0){
            binary[index++] = num%2;// chia lấy dư cho 2
            num = num/2;
        }
        for (int i = 0; i < index-1; i--) {
            System.out.print(binary[i]);
        }
    }
}
