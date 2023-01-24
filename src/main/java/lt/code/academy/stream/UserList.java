package lt.code.academy.stream;

import java.util.List;
import java.util.function.Consumer;

public class UserList {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Vardenis", "Pavardenis"),
                new User("Petdro", "Alberto"),
                new User("Onute", "Onaityte"),
                new User("NAglis", "Sulija"),
                new User("Petras", "Kurmelis"));


        //users.stream()


    /*    Consumer<User> consumer = example.print();
        Consumer<User> consumer2 = example.print();*/

   //     users.forEach(consumer2);

    }
    private Consumer<User> print() {
        return user -> System.out.println(user.vardas() +""+ user.surname());
    }
}
