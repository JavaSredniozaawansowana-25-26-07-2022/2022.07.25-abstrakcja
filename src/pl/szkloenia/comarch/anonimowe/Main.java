package pl.szkloenia.comarch.anonimowe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Janusz");
        list.add("Adam");
        list.add("Zbyszek");
        list.add("Abelard");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Mateusz", "Bererda"));
        userList.add(new User(3, "Adam", "Kowalski"));
        userList.add(new User(2, "Zbyszek", "Malinowski"));
        userList.add(new User(4, "Abelard", "Giza"));

        System.out.println(userList);

        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getId() - o2.getId();
            }
        });

        /*User user = new User(1, "sadf ", "asdf");
        User user2 = new User(1, "sadf ", "asdf");
        user.compareTo(user2);*/

        System.out.println(userList);

        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(userList);
    }
}
