package stream;

import java.util.*;
import java.util.stream.Collectors;

public class UpperCase {

    public static void main(String[] args) {

    ArrayList<String> array = (ArrayList<String>) mapToUpperCase("A","B","C");
        System.out.println( array.toString());

    }

    public static Collection<String> mapToUpperCase(String... names){
      return  Arrays.asList(names).stream().map(name -> name.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
    }
}
