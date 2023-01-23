package lt.code.academy;

@FunctionalInterface
interface MyFunction {
    String sayHi(String text);
}

//visada nautoti anotacijas jeigu tai
// funkcinis interfeisas, nes ne visi mato tai, ir kad i6vengti, kad kas ko neprirasytu
@FunctionalInterface
interface MyNonFunction {
    String sayHi(String text);
}

public class FunctionMethodReference {
    public static void main(String[] args) {
        FunctionMethodReference reference = new FunctionMethodReference();
        MyFunction myFunction = reference::myStringMethod;
        MyNonFunction myNonFunction = reference::myStringMethod;
        System.out.println(myFunction.sayHi("Labas 1 "));
        System.out.println(myNonFunction.sayHi(" 2 labas "));

        MyFunction mySeconfFunction = String::toUpperCase;
        System.out.println(mySeconfFunction.sayHi("mazosios raides i didziasias"));

    }

    private String myStringMethod(String text) {
        return "My string method " + text;
    }

}
