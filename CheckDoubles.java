
import java.util.HashSet;


public class CheckDoubles {

    public static boolean checkIfExist(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(2 * num) ||
                (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {1, 44, 6, 8, 9, 2};

        System.out.println(checkIfExist(arr));
    }
}