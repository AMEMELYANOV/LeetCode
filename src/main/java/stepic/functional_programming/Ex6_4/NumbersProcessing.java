package stepic.functional_programming.Ex6_4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

class NumbersProcessing {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .sorted()
//                .map(n -> n * 2)
//                .parallel()
//                .forEachOrdered(System.out::println);


        CompletableFuture<List<String>> actionsFuture =
                CompletableFuture.supplyAsync(() -> List.of("Run", "Debug", "Build", "Cancel"));

        CompletableFuture<Void> printActionsFuture = actionsFuture
                .thenApply(actions -> actions.subList(0, 2)) // line A
                .thenApply(actions -> actions.size()) // line B
                .thenAccept(System.out::println); // line C
    }
}
