package it.unibo.collections.sets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Collection<String> treeSet = new TreeSet<>(); 

        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for (int i = 1; i <= UseSet.ELEMS; i++) {
            treeSet.add(String.valueOf(i));
        }

        /*
         * 3) Prints its content
         */
        System.out.println("Print tree content after adding elements: ");
        for (String string: treeSet) {
            System.out.println(string);
        }

        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        System.out.println("Removing elements: ");
        Collection<String> array = new ArrayList<>();

        treeSet.forEach( (String string) -> {
            if (Integer.valueOf(string) % 3 == 0) {
                array.add(string);
            }
        });

        treeSet.removeAll(array);

        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        System.out.println("Print tree content after removing elements: ");
        treeSet.forEach(string -> {
            System.out.println(string);
        });

        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        System.out.println("Print tree contain only even element: ");
        Iterator<String> treeSetIterator = treeSet.iterator();
        while (treeSetIterator.hasNext()) {
            if (Integer.valueOf(treeSetIterator.next()) % 2 != 0) {
                System.out.println("Not every number is even.");
                break;
            }
        }
    }
}

