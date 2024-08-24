import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.printf("[%d,%d]", result[0], result[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int index1 = 0  ; index1 < nums.length - 1 ; index1++) {
            for (int index2 = index1 + 1 ; index2 < nums.length ; index2++) {
                if (nums[index1] + nums[index2] == target) {
                    return new int[]{index1, index2};
                }
            }
        }
        return null;
    }
}
