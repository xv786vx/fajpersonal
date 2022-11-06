import java.util.*;
public class ArrayListProblem {


    public static void arrListSortUp(ArrayList<Integer> array) {
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < array.get(i-1)) {
                int biggerNum = array.get(i-1);
                int smallerNum = array.get(i);

                array.add(i, biggerNum);
                array.add(i-1, smallerNum);
            }
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + ", ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(10,2,3,11,4,12,5,13,18,20,1,2,18,34,25,65,11,0,35,22));
        arrListSortUp(nums);


    }
    
}
