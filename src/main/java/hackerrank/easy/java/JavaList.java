package hackerrank.easy.java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class JavaList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = Integer.parseInt(in.nextLine());
        List<Integer> list = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int q = Integer.parseInt(in.nextLine());
        for (int i = 0; i < q; i++) {
            String query = in.nextLine();
            if (query.equals("Insert")) {
                String line = in.nextLine();
                int index = Integer.parseInt(line.split(" ")[0]);
                int el = Integer.parseInt(line.split(" ")[1]);
                list.add(index, el);
            } else {
                int index = Integer.parseInt(in.nextLine());
                list.remove(index);
            }
        }
        for (Integer integer : list) {
            System.out.printf("%s ", integer);
        }
    }
}
