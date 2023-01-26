package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

    }

    public static List<String> transform(List<List<String>> collection) {

       return collection.stream().flatMap(newCollection -> newCollection.stream()).collect(Collectors.toList());
     /*   List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;*/
    }
}
