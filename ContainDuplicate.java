package HashMap.Set;

import java.util.HashSet;

public class ContainDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> st = new HashSet<>();

        for (int num : nums) {
            if (st.contains(num)) {
                return true;
            }
            st.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums)); // true
    }
}
