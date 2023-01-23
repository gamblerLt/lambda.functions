package lt.code.academy;

import java.util.function.Function;
import java.util.function.Predicate;

public class CompositionFunctionExample {
    public static void main(String[] args) {
        Function<String, String> function = text -> text.substring(8),
                function1 = text -> text.replace("a", "x"),
                function2 = String::toUpperCase,
                function3 = function.compose(function1).andThen(function2);

        System.out.println(function3.apply("whats my name are a"));

        Predicate<String> predicate = email -> email != null,
                predicate1 = email -> email.contains("@"),
                predicate2 = email -> email.endsWith("com"),
                predicate3= email -> email.length() >= 10,
                predicate4 = predicate.and(predicate1).and(predicate2).and(predicate3);

        System.out.println(predicate4.test(null));
        System.out.println(predicate4.test("null"));
        System.out.println(predicate4.test("ade@"));
        System.out.println(predicate4.test("kergkw@gmail.com"));
    }
}
