package datastructure;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Spiderman");
        queue.add("Igetyou");
        queue.add("Yesman");
        System.out.println(queue.poll());

        }
    }
