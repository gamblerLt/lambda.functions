package lt.code.academy;

import java.util.function.Function;

public class CompositionFunctionExample {
    public static void main(String[] args) {
        Function<String, String> function = text -> text.substring(8),
                function1 = text -> text.replace("a", "x"),
                function2 = String::toUpperCase,
                function3 = function.compose(function1).andThen(function2);

        System.out.println(function3.apply("whats my name are a"));
    }
}
