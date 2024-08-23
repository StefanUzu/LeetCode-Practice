import static java.lang.Math.abs;


public class LowestDistance {
    public static void main(String[] args) {
        int[] nums = {-4,-2,1,4,8};
        System.out.println(findClosestNumber(nums));

        }

    public static int findClosestNumber(int[] nums) {
        int distance = abs(nums[0]);
        int value = nums[0];
        for (int i = 1; i < nums.length ; i ++) {
            if ( abs(nums[i]) < distance ){
                continue;
            }
            if (abs(nums[i]) > distance) {
                distance = abs(nums[i]);
                value = nums[i];
            }
            if (nums[0] > value ) {
                distance = abs(nums[i]);
                value = nums[i];
            }
        }
        return value;
    }
}
