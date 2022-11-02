package stepic.java_interview.Ex2_4.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        generateOutOfMemoryError();
    }

    static void generateOutOfMemoryError() {
        //enter your code
        String s = new String("qwe");
        List<String> list = new ArrayList<>();
        while (true) {
            s += "q";
            list.add(new String(s));
        }
    }
}
