public class TestRecursion {
    public static int factorial(int n){
        //if n > 1 then n! = n * (n-1)! else if n == 1 then n! = 1
        if(n > 1){ // recursive case
            return n * factorial(n - 1);
        }else if(n == 1 || n == 0){ //base case
            return 1;
        }
        return 0;
    }
    public static int factorialByIteration(int n){
        //accumulative loop
        int prod = 1;
        for (int i = n; i >= 1; i--){
            prod = prod * i;
        }
        return prod;
    }
    public static long fibonacciRecursion(long n){
        if (n == 0 || n == 1){
            return 1;
        }else { //recursion
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }
    public static long fibonacciIteration(long n){
        long returnValue = 0;
        if (n == 0 || n == 1){
            return 1;
        }else { //iteration
            long first = 1;
            long second = 1;
            long third = 0;
            for (int k = 2; k <= n; k++){
                third = second + first;
                first = second;
                second = third;
            }
            returnValue = third;
        }
        return returnValue;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("The factorial(recursive) " + result);


        int result2 = factorialByIteration(n);
        System.out.println("The factorial(iterative) " + result2);

        long result3 = fibonacciRecursion(n);
        System.out.println("5th Fibonacci number by recursion " + result3);

//        for (long k = 1; k <= 300; k++){
//            System.out.println("The " + k + "th Fibonacci number is " + fibonacciRecursion(k));
//        }

        long result4 = fibonacciIteration(n);
        System.out.println("5th Fibonacci number by recursion " + result3);

        for (long k = 1; k <= 300; k++){
            System.out.println("The " + k + "th Fibonacci number is " + fibonacciIteration(k));
        }
    }
}
