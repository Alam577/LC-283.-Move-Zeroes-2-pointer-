
  import java.util.*;

public class Main {
    
    public static String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();
        
        int left = 0, right = k - 1;
        
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        
        
        if (k > s.length()) {
            k = s.length();
        }
        
        String result = reversePrefix(s, k);
        
      
        System.out.println("Result: " + result);
        
      
    }
}
