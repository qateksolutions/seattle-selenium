package practice;

import java.util.Arrays;

public class Learn2DArray {
    public void print2DArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Contents of the array: " + arr[i][j]);
            }
        }
    }
}
