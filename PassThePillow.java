import java.util.*;

public class PassThePillow {

    public static int passThePillow(int n, int time) {

        int cycle = 2 * (n - 1);
        time = time % cycle;

        if (time < n) {
            return 1 + time;
        } else {
            return n - (time - (n - 1));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people (n): ");
        int n = sc.nextInt();

        System.out.print("Enter time: ");
        int time = sc.nextInt();

        int result = passThePillow(n, time);

        System.out.println("Person holding pillow = " + result);

        sc.close();
    }
}
