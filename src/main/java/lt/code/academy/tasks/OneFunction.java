package lt.code.academy.tasks;

import lt.code.academy.stream.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class OneFunction {
    public static void main(String[] args) {

        List<String> names = List.of("Jonas","Algis","Juozapas", "Algimantas", "Arminas");
        List<Integer> numbers = List.of(1,5,6,8,22);
        List<String> surnames = List.of("aJonas","bAlgis","jJuozapas", "lAlgimantas", "uArminas");

        //kurimas naujas list:
        BiFunction<List<String>,List<Integer>,List<String>> function = (list1, list2) -> {
            List<String> items = new ArrayList<>(list1);
            items.addAll(list2.stream().map(String::valueOf).toList());
            Collections.sort(items); //susortino tik stringus

            return items;
        };

        List<String> result = function.apply(names, numbers);
        result.forEach(System.out::println);

        //2 variantas

        BiFunction<List<String>, List<String>, List<String>> function1 = (list1, list2) -> Stream.concat(list1.stream(), list2.stream()).sorted().toList();
        List<String> result2 = function1.apply(names, surnames);
        result2.forEach(System.out::println);


    }
}
