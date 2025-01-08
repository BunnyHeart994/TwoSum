import java.util.Scanner;
import java.util.Arrays;

public class Main {
    protected static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Henrique's TwoSum v1.0\nWelcome. This program finds the index of 2 numbers " +
                "in a sequence,\nthat if added up together, result in the target number.\nThe sequence " +
                "and the target are user defined.\n");
        System.out.print("How many numbers do you want?\n--> ");
        short arrLength = scan.nextShort();
        int[] arr = new int[arrLength];
        System.out.println("Insert the numbers:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " -> ");
            arr[i] = scan.nextShort();
        }
        System.out.print("Target number: ");
        short target = scan.nextShort();
        System.out.println();

        System.out.println("Sequence: " + Arrays.toString(arr) + "\nIndexes: " +
                Arrays.toString(Solution.twoSum(arr, target)) + "\n");

        System.out.println("Thank you for using. Reopen the program to do it again.");
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (result [0] != 0)
                    break;
                if (nums[i] + nums[j] == target && nums[i] != nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}