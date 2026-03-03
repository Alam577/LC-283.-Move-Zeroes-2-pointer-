package String;

public class RevString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        reverseString(arr);

        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}