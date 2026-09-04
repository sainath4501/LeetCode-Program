public class Fibonacci {

    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String[] args) {
        System.out.print(Fib(5)+" ");
    }
}