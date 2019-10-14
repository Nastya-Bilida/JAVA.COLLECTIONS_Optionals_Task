package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//5.Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.
public class Main {
    static List<Integer> list = new ArrayList<Integer>();

    static void addNumbers(int quantity){
        Random random = new Random();
        for (int i = 0; i<quantity; i++ ) {
            int randomNumber = random.nextInt(40+20)-20;
            list.add(randomNumber);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        addNumbers(5);
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) < 0)
            {
                list.add(list.get(i));
                list.remove(list.get(i));
            }
        }

        System.out.println(list);

    }
}
