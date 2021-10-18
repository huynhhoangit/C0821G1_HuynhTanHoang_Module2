package ss11_dsa_stack_queue.thuc_hanh.trien_khai_stack_su_dung_lop_linkedList_trong_thu_vien_javautil;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {  // Cài đặt phương thức push()
        stack.addFirst(element);
    }

    public T pop() { //Cài đặt phương thức pop()
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    //Cài đặt phương thức size()
    public int size() {
        return stack.size();
    }

    //Cài đặt phương thức isEmpty()
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
