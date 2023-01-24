package lt.code.academy.tasks;

import java.util.List;
import java.util.function.Function;

public class Two {
    public static void main(String[] args) {
        Two two = new Two();

        List<String> items = List.of("vienas", "Du","Trys");


        //cia 2 pvz
        Function<List<String>, List<String>> sortFunction = two.sortFunction(); //iskvieciam metoda kuris grazina sukurta funkcija
        Function<List<String>, List<String>> methodSortFunction = two.sortFunction(); // nekviecia metodo, sukuriama nuoroda i tam tikra metoda

        Function<List<String>, List<String>> upperCaseFunction = two.sortFunction();


    }

    private  void  callFunction(Function<List<String>, List<String >> function, List<String> items) {
        //reikia issikviesti callfunction
        items = function.apply(items);
        items.forEach(System.out::println);

    }
    private List<String> methodSortFunction(List<String> items) {
        return items.stream()
                .sorted()
                .toList();
    }
    private Function<List<String>, List<String>> sortFunction(){
        return items -> items.stream()
                .sorted()
                .toList();
    }
    private Function<List<String>, List<String>> upperCase() {
        return items -> items.stream()
                .map(String::toUpperCase)
                .toList();
    }

}
