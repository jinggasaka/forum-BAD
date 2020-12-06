package com.company;
import java.util.ArrayList;
import java.util.List;

public class RemoveArrayListItem {
    public static void main(String[] args) {
        List<Integer> element = new ArrayList<>();
        element.add(42);
        element.add(78);
        element.add(70);
        element.add(44);
        element.add(98);

        System.out.println("isi array" + element.toString());

        element.remove(2);

        System.out.println("isi array setelah hapus" + element.toString());
    }
}
