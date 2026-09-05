public class power {

    public static double OptimalPower(double x,int n){

        if(n==0){
            return 1;
        }

        if(n<0){
            x=1/x;
            n=-1;
        }

        double half=OptimalPower(x, n-1)*OptimalPower(x, n-1);

        if(n % 2 != 0){
            half=x * half;
        }
        return half;
    }

    public static void main(String[] args) {
        System.out.println(OptimalPower(2, 5));
    }
}