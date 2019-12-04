package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static List<Integer> list = new ArrayList<Integer>();

    static void addNumbers(int quantityNumbers) {
        Random random = new Random();
        for (int i = 0; i < quantityNumbers; i++) {
            int randomNumber = random.nextInt(40 + 20) - 10;
            list.add(randomNumber);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        addNumbers(5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(list.get(i));
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }
}
