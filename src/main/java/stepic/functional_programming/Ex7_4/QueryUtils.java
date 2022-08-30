package stepic.functional_programming.Ex7_4;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

class QueryUtils {

    public static <R> Map<String, R> execute(List<String> tables, Function<String, R> query, R defaultValue) {
        Map<String, R> tableToResultMap = new ConcurrentHashMap<>();

        CompletableFuture<?>[] futures = tables.stream()
                .map(table -> CompletableFuture
                        .supplyAsync(() -> tableToResultMap.put(table, query.apply(table))))
                .toArray(CompletableFuture[]::new);

        CompletableFuture.anyOf(futures).join();

        return tableToResultMap;
    }
}
