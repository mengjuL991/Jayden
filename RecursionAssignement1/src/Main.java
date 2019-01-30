public class Main {

    public static int fib(int n){
        if (n == 0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Fib sequence of 0 is: " + fib(0));
        System.out.println("Fib sequence of 1 is: " + fib(1));
        System.out.println("Fib sequence of 2 is: " + fib(2));
        System.out.println("Fib sequence of 3 is: " + fib(3));
        System.out.println("Fib sequence of 4 is: " + fib(4));
        System.out.println("Fib sequence of 5 is: " + fib(5));

        System.out.println("Fib sequence of 6 is: " + fib(6));
        System.out.println("Fib sequence of 7 is: " + fib(7));
        System.out.println("Fib sequence of 8 is: " + fib(8));
        System.out.println("Fib sequence of 9 is: " + fib(9));

        System.out.println("Fib sequence of 10 is: " + fib(10));
        System.out.println("Fib sequence of 11 is: " + fib(11));
        System.out.println("Fib sequence of 12 is: " + fib(12));
    }
}
