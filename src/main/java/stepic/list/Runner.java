package stepic.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String allElements = reader.readLine();
        List<Integer> bigList = createBigList(allElements);

        ArrayList<Integer> div2list = new ArrayList<>();
        ArrayList<Integer> div3list = new ArrayList<>();
        ArrayList<Integer> otherlist = new ArrayList<>();

        //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists
        div2list = (ArrayList<Integer>) bigList.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        div3list = (ArrayList<Integer>) bigList.stream()
                .filter(e -> e % 3 == 0)
                .sorted()
                .collect(Collectors.toList());
        otherlist = (ArrayList<Integer>) bigList.stream()
                .filter(e -> e % 3 != 0 && e % 2 != 0)
                .sorted()
                .collect(Collectors.toList());

        //get result list from createListOfLists
        List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

        //call printInLine() for resultList
        printInLine(resultList);
    }

    public static List<Integer> createBigList(String str) {
        List<Integer> bigList = new ArrayList<Integer>();
        String[] strarr = str.split(" ");

        for (String s : strarr) {
            //convert(using Integer.parseInt(s) or Integer.valueOf(s)) and add all elements from srtarr to bigList
            bigList.add(Integer.parseInt(s));
        }
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list, List<Integer> otherList) {
        //add all lists like items in resultList(list of lists) and return it, first-div2list, second-div3list, third-otherList
        return Arrays.asList(div2list, div3list, otherList);
    }


    private static void printInLine(List<List<Integer>> resultList) {
        System.out.println(resultList);
    }
}
