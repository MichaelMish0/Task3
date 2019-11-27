package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            list.add(random.nextInt(100));
        }

        ArrayList<Integer> copy = new ArrayList<>(list);
        int a = 0;
        for (Iterator i=copy.iterator(); i.hasNext();){
            i.next();
            if (a%2==0){
                i.remove();
            }
            a++;
        }
        Collections.sort(list);
        Collections.sort(copy);

        System.out.println("Task 1"+list);
        System.out.println("Task 1"+copy);

        ArrayList<Integer> list2 = new ArrayList<>();
        Random r = new Random();
        ArrayList<Integer> copy2 = new ArrayList<>(list2);
        for (int i = 0; i < 12; i++) {
            list2.add(r.nextInt(6) + 5);
        }
        for (int i = 4; i < 12 + 4; i += 4) {
            copy2.add(i, r.nextInt(6) + 20);
        }

        System.out.println("Task 2"+list2);
        System.out.println("Task 2"+copy2);


    }
}
