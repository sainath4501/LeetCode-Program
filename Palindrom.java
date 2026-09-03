public class Palindrom {

    public static boolean palindrom(int x){
        int origin=x;
        int rev=0;
        while (x > 0) {
            int lastDigit=x%10;
            rev=(rev*10)+lastDigit;
            x=x/10;
            
        }
        return origin==rev;
    }

    public static void main(String[] args) {
    
        System.out.println(palindrom(161));
        
    }
}