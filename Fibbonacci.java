package BasicMath;



class Fibbonacci {
    public int fib(int n) {
        if(n <= 1) {
            return n;
        }

        int num1 = 0;
        int num2 = 1;

        for(int i = 2; i <= n; i++) {
            int fibbo = num1 + num2;
            num1 = num2;
            num2 = fibbo;
        }

        return num2;
    }
     public static void main(String[] args) {

        Fibbonacci fibo = new Fibbonacci();

        int n = 7;

        int result = fibo.fib(n);

        System.out.println("Fibonacci number is: " + result);
    }
}