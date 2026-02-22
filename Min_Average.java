package TwoPointer;

import java.util.*;

class Min_Average {
    public double minimumAverage(int[] nums) {

        Arrays.sort(nums);   // MUST sort

        double avg = Double.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            double currentAvg = (nums[left] + nums[right]) / 2.0;
            avg = Math.min(avg, currentAvg);

            left++;
            right--;
        }

        return avg;
    }

    public static void main(String[] args) {
        Min_Average obj = new Min_Average();
        int[] nums = {5, 1, 8, 2};
        System.out.println(obj.minimumAverage(nums));
    }
}
