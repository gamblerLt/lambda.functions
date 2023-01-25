package lt.code.academy.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Third {
    public static void main(String[] args) {
        Third third = new Third();
        List<String> names = List.of(); //tuscias listas ()

        //nuskaityti failo eilutes: 222, vardas, pavarde (id vardas, pavarde
        try (BufferedReader br = new BufferedReader(new FileReader("third.txt"))) {
            names = br.lines()
                    .filter(l -> !l.startsWith("id"))
                    .map(third::collectName)
                    .filter(Objects::nonNull)
                    .distinct()
                    .sorted()
                    .toList();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //reikia prafiltruoti pirm,a eilute
        names.forEach((System.out::println));

        }
        private String collectName(String line) {
            String[] items = line.split(", ");
            if (items.length < 3) {
                return null;
            }
            return items[1];
        }
}


