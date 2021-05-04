package by.course.task.backpack;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Thing thing1 = new Thing(5, 10);
        Thing thing2 = new Thing(7, 7);
        Thing thing3 = new Thing(2, 3);
        Thing thing4 = new Thing(4, 8);
        Thing thing5 = new Thing(9, 11);

        Backpack backpack = new Backpack(20);

        ArrayList<Thing> things = new ArrayList<>();
        things.add(thing1);
        things.add(thing2);
        things.add(thing3);
        things.add(thing4);
        things.add(thing5);

        Collections.sort(things, Collections.reverseOrder(new ThingComparator()));

        ArrayList<Thing> thingsInBackpack = inBackPack(things, backpack.getCarryingCapacity());
        printList(thingsInBackpack);
    }

    private static ArrayList<Thing> inBackPack(ArrayList<Thing> list, int capacity) {
        ArrayList<Thing> backPackList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (capacity - list.get(i).getWeight() >= 0) {
                backPackList.add(list.get(i));
                capacity = capacity - list.get(i).getWeight();
            }
        }
        return backPackList;
    }

    private static void printList(ArrayList<Thing> list) {
        int sumWeight = 0;
        int sumCost = 0;
        System.out.println("В рюкзаке лежат вещи: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("№ " + (i + 1) + " вес " + list.get(i).getWeight() + " стоимость " + list.get(i).getCost());
            sumCost += list.get(i).getCost();
            sumWeight += list.get(i).getWeight();
        }
        System.out.println(" Суммарная стоимость = " + sumCost);
        System.out.println(" Суммарный вес = " + sumWeight);
    }
}

