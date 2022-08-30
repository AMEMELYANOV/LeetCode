package stepic.functional_programming.Ex7_2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        executeFuture();

    }

    static private void executeFuture() throws ExecutionException, InterruptedException {
        CompletableFuture<String> data = CompletableFuture.supplyAsync(() -> {
            error();
            return "some data";
        });

        CompletableFuture<String> handleFuture = data.handle((result, throwable) -> {
            if (throwable != null) {
                return "No data";
            } else {
                return result.toUpperCase();
            }
        });

        System.out.println(handleFuture.get());
    }

    static private void error() {
        throw new RuntimeException("Ooops, something went wrong");
    }

}
