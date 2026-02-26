package HashMap.Set;
import java.util.Arrays;


public class Add1 
{

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // start from last index
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // add one
                return digits; // no carry, return
            }
            digits[i] = 0; // if 9, make it 0 and carry continues
        }

        // if all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9, 1, 5};

        int[] answer = plusOne(digits);

        System.out.println(Arrays.toString(answer));
    }
}