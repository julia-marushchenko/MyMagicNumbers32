// Java program to find numbers dividable by 3

package com.numbers;

import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating a LinkedList of numbers
        List<Integer> list = new ArrayList<>();

        // Adding numbers to the list in a loop
        for (int index = 0; index < 1000000; index++) {

            list.add(index);

        }

        // Checking that elements of the list are dividable by 3 and printing result to console
        for (int index = 0; index < 1000000; index++) {

            // Creating local variable to store number
            int element = list.get(index);

            // Condition
            if (element % 3 == 0) {

                // Printing result to console
                System.out.println(element + " is dividable by 3.");

            } else {

                // Printing result to console
                System.out.println(element + " is not dividable by 3.");

            }
        }

    }
}