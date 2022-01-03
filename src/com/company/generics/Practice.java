package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class Practice<T> {
    private List<T> list = new ArrayList<>();

    //Метод добавления елементов списка
    public void add(T data) {
        list.add(data);
    }

    //Печать елементов списка, в зависимости от параметра (true - нечетные, false - четные)
    void printList(boolean isOdd) { //isOdd - это нечетный
        int start = 0;
        if (isOdd) {
            start = 1;
        }
        for (int i = start; i < list.size(); i += 2) {
            System.out.println(list.get(i).toString());
            System.out.println();
        }
    }
}

