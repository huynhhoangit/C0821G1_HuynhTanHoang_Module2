package ss10_dsa_list.thuc_hanh.trien_khai_lop_linked_list_don_gian_assignment;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("Mảng in ra là");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.add(4, 9);
        myLinkedList.add(4, 8);
        myLinkedList.add(2, 15);
        myLinkedList.printList();
    }
}