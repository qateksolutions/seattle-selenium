package practice;

import java.util.List;

public class Learn2DList {
    public void printValueFrom2DListArray(List<List<Integer>> list) {
        int fRow = 0;
        int sRow = 0;
        int tRow = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                //System.out.println("Contents of list is: " + list.get(i).get(j));
                fRow += list.get(i).get(j);
            }
        }
    }
}
