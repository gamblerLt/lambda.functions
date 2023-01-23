package lt.code.academy;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> 50;
        System.out.println(supplier.get());

        Main main = new Main();
        main.testSupplier(supplier);
        main.testSupplier(() -> 60);

        Consumer<String> consumer = value -> System.out.println(value.toUpperCase());
        consumer.accept("Vardas");
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("NAuja reiksme");

        Function<String, Integer> function = text -> text.length() * 10;
        int result = function.apply("Tekstas");
        System.out.println("Rezultatas: " + result);

        Predicate<String> predicate = text -> text != null && !text.isBlank() && text.startsWith("test");

        if(predicate.test("tekstasKazkoks")) {
            System.out.println("Teisinga");
        }else {
            System.out.println("Neteisinga");
        }

        IntConsumer intConsumer = System.out::println;
        Consumer<Integer> secondIntConsumer = System.out::println;
        intConsumer.accept(500);
        secondIntConsumer.accept(800);

        BiConsumer<String, Integer> biConsumer = (val1, val2) -> System.out.println(val1 + "" +  val2);
        biConsumer.accept("Reiksme yra", 500);
        BiPredicate<String, String> biPredicate = (text1, text2) -> text1!= null && text1.equals(text2);
        System.out.println(biPredicate.test(null, "test"));
        System.out.println(biPredicate.test("test", "test"));

        BiFunction<Integer, Integer, String> biFunction = (numb1, numb2) -> String.valueOf(numb1 * numb2);
        String val = biFunction.apply(50, 20);
        System.out.println(val);

        TripleIntConsumer tripleIntConsumer = (a, b, c) -> System.out.println(a + b + c);
        tripleIntConsumer.triple(50,10, 50);

        main.getTripleIntConsumer().triple(50, 700, 40);
        TripleIntConsumer tripleIntConsumer1 = main.getTripleIntConsumer();
        main.testTripleConsumer(tripleIntConsumer1);
        main.testTripleConsumer((a, b, c) -> System.out.println(a * b *c / 2));
        main.testTripleConsumer((a, b, c) -> System.out.println(a * b * c * 10));

        BiFunction<Integer, Integer, Integer> sum = main :: sum;
        System.out.println(sum.apply(50,60));

    }
    private int sum(int a, int b) {
        return a + b;
    }


    private void testSupplier(Supplier<Integer> supplier) {
        System.out.println(supplier.get());
    }
    private TripleIntConsumer getTripleIntConsumer() {
        return (a, b, c) -> System.out.println( a * c - b);
    }

    private void testTripleConsumer(TripleIntConsumer tripleIntConsumer) {
        tripleIntConsumer.triple(50, 10 ,70);
    }
}