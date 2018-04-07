package datastructure;

import java.util.List;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> item = new Stack();
        item.push("A");
        item.push("B");
        item.push("C");
        System.out.println(item.pop());

    }
}
