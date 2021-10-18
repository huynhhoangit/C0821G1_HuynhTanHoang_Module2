package ss11_dsa_stack_queue.bai_tap.dao_nguoc_ptu_trong_mang_so_nguyen_su_dung_stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<K> {
    private LinkedList<K> stack;

    public MyGenericStack() {
       stack = new LinkedList<K>();
    }
    public void push(K element){
        stack.addFirst(element);
    }
    public int size () {
        return stack.size();
    }



    boolean isEmpty() {
        return stack.size() == 0;
    }
    public K pop () {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
}
