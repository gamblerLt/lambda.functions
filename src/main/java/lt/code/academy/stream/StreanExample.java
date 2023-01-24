package lt.code.academy.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreanExample {
    public static void main(String[] args) {
        List<String> names = List.of("Vardas1", "Vardas2", "3 vardas");

        //stream is collection

        Stream<String> streamOfNames = names.stream();

        //2 naudojant stream metoda
        Stream<Integer> integerStream = Stream.of(4,5,8,6);

        // 3 is aray

        /*int[] mas = {5,8,9,6,5,7,8};
        String[] mas2 = {"test1", "test2"};
        IntStream integerStream1 = Arrays.stream(mas2);
        Stream<Integer> integerStreamMas = Arrays.stream(mas);*/
    }

}
