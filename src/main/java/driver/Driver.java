package driver;

import practice.LearnSorting;

import java.util.Scanner;

public class Driver {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        LearnSorting learnSorting = new LearnSorting();

        learnSorting.sortAnArrayInAscending(new int[] {45,22,47,56,78});

//        System.out.println("Enter the size of the array: ");
//        int sizeOfArray = scanner.nextInt();
//
//        String[] strArray = new String[sizeOfArray];
//
//        for (int i = 0; i < sizeOfArray; i++) {
//            System.out.println("Enter the string " + (i + 1) + ": ");
//            strArray[i] = scanner.next();
//        }
//
//        System.out.println("Entered elements before sorting: ");
//        for(String value: strArray) {
//            System.out.println(value);
//        }

        learnSorting.sortAnArrayOfStringInAscending(new String[] {"Rifat", "Imran", "Zulu", "Travis"});
    }
}
