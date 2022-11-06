import java.util.Scanner;
//Firas AJ
//Found out how to do Bubble Sort on freeCodeCamp.org and Insertion Sort on geeksforgeeks.com
public class ArrayProblem {


    public static void mySortAscending(int[] array) { //tried to do insertion sort and ended up with this
        //pretty sure its insertion sort either way but I didn't have to google as much for this one / base it off of existing code
        //(aka this is more original)
        // so I'm using this one instead of the bubble sorts I listed below

        for (int i = 1; i < array.length; i++) {
            while (i > 0 && array[i] < array[i-1]) {
                int smallerNum = array[i];
                int biggerNum = array[i-1];

                array[i] = biggerNum;
                array[i-1] = smallerNum;
                i--;
            }
        }

        for (int number : array) {
            System.out.print(number + ", ");
        }
    }

    public static void mySortDescending(int[] array) { //tried to do insertion sort and ended up with this
        //pretty sure its insertion sort either way but I didn't have to google as much for this one / base it off of existing code
        //(aka this is more original)
        // so I'm using this one instead of the bubble sorts I listed below

        for (int i = 1; i < array.length; i++) {
            while (i > 0 && array[i] > array[i-1]) {
                int smallerNum = array[i-1];
                int biggerNum = array[i];

                array[i-1] = biggerNum;
                array[i] = smallerNum;
                i--;
            }
        }

        for (int number : array) {
            System.out.print(number + ", ");
        }
    }


    
    public static void sortAscending(int[] array) { //bubble sort
        for (int i = 0; i < array.length; i++) {
            for (int x = i+1; x < array.length; x++) { //this is to sort every element in the array each time. For every element in the array, the array will be iterated over 
                if (array[i] > array[x]) { //if the number i is at is greater than x, switch their spots in the array
                    int biggerNum = array[i];
                    int smallerNum = array[x];

                    array[i] = smallerNum;
                    array[x] = biggerNum;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i+1 == array.length) {
                break;
            } else {
                System.out.print(", ");
            }
        }
    }
    public static void sortDescending(int[] array) { //bubble sort
        for (int i = 0; i < array.length; i++) {
            for (int x = i+1; x < array.length; x++) { //this is to sort every element in the array each time. For every element in the array, the array will be iterated over 
                if (array[i] < array[x]) { //if the number x is at is greater than i, switch their spots in the array
                    int biggerNum = array[i];
                    int smallerNum = array[x];

                    array[i] = smallerNum;
                    array[x] = biggerNum;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i+1 == array.length) {
                break;
            } else {
                System.out.print(", ");
            }
        }
    }

    public static int total(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void changeArray(int position, int value, int[] array) {
        array[position] = value;
        System.out.println("The value at index " + position + " of the array is now " + value + ".");
    }

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int[] nums= {10,2,3,11,4,12,5,13,18,20,1,2,18,34,25,65,11,0,35,22};
        String command = "";

        while (!command.equals("5")) {
            System.out.println("");
            System.out.println("1. Sort array by smallest -> largest.");
            System.out.println("2. Sort array by largest -> smallest.");
            System.out.println("3. Find total of every element in the array.");
            System.out.println("4. Change an element in the array.");
            System.out.println("5. Quit.");
    
            command = userInput.nextLine();
    
            if (command.equals("1")) {
                mySortAscending(nums);
            } else if (command.equals("2")) {
                mySortDescending(nums);
            } else if (command.equals("3")) {
                System.out.println("The total of every element is " + total(nums) + ".");
            } else if (command.equals("4")) {
                System.out.println("Input the index of the array you want to change and the new number.");
    
                System.out.print("Position: ");
                int position = userInput.nextInt();
                System.out.println("");    
                System.out.print("Value: ");
                int value = userInput.nextInt();
    
                changeArray(position, value, nums);
            }
        }   
        userInput.close(); 
    }
}
