package pl.szkloenia.comarch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("ASDFGASDf");
        list.size();
        list.remove(0);

        metoda1(list);
        metoda2(list);
    }

    public static void metoda1(List<String> list) {
        list.add("ASDF");
        list.size();
    }

    public static void metoda2(List<String> list) {
        list.add("ASDFASDF");
        list.size();
    }
}
