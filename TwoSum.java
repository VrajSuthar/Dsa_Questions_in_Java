import java.util.Arrays; // Import this for Arrays.toString()

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 15;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println(Arrays.toString(result)); // Use Arrays.toString to print the array
        } else {
            System.out.println("No two numbers add up to the target.");
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] arr = { i, j };
                    return arr;
                }
            }
        }
        return null;
    }

}
