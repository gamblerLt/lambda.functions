package lt.code.academy;

class TestClass {

    //bus teste +++++++++++++++++++++++++++++++++++++++++++++
    public String testMethod(String value) {
        return  "Labas testMethod" + value;
    }

    public static  String secondTestMethod(String value) {
        return "SECOND METHOD" + value;
    }
}

interface Transform {
    String transform(TestClass testClass, String value);

    default String testDefaultTransformMethod(String value) {
        return "transformDefaultValue" + value;
    }
}

interface SecondTransform {
    String getValue(String value);
}

public class Unbounded {

    public static void main(String[] args) {

        Transform transform = TestClass::testMethod;
        System.out.println(transform.testDefaultTransformMethod("Test value"));

        TestClass testClass = new TestClass();
        System.out.println(transform.transform(testClass, "Test second value"));

        SecondTransform secondTransform = testClass::testMethod;
        System.out.println(secondTransform.getValue("Kazkas naujo???"));

        SecondTransform secondTransform1 = TestClass::secondTestMethod;
        System.out.println(secondTransform1.getValue(";)"));

    }

}
