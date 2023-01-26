package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class LetterCount {

    public static void main(String[] args) {

        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("Asd","Bclcklck","Ccnsms"));

    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .mapToInt(name -> name.length()).sum();
    }
}
