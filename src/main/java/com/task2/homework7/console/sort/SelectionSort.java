package com.task2.homework7.console.sort;

import com.task2.homework7.console.entity.User;


import java.util.ArrayList;

public final class SelectionSort {

    private SelectionSort() {

    }

    public static void sort(ArrayList<User> users) {

        for (int left = 0; left < users.size(); left++) {
            int minInd = left;
            for (int i = left; i < users.size(); i++) {
                if (users.get(i).compareTo(users.get(minInd)) < 0) {
                    minInd = i;
                }
            }
            Utility.swap(users, left, minInd);
        }
    }
}
