package problem.solving;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class FibonacciSeries {
    public static void main(String[] args) {

    int prev = 0; int next = 1;
        for(int i=0; i<30; i++){
        System.out.println(prev);
        prev = next - prev;
        next = next + prev;
        }

        }
        }
