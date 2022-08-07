package practice;

import java.util.Arrays;

public class LearnSorting {
    public void sortAnArrayInAscending(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void sortAnArrayOfStringInAscending(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array Elements after sorting: " + Arrays.toString(arr));

//        for (String value: arr) {
//            System.out.println(value);
//        }
    }
}
