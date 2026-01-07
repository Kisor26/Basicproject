public class Main {
    public static int fibonacchi(int n){
        if(n<=1) return n;
        return fibonacchi(n-1)+fibonacchi(n-2);
    }
    public static void main(String...args) {
        int n=10;

        System.out.println(fibonacchi(n));

        for(int i=0;i<=n;i++){
            System.out.println(fibonacchi(i));
        }



    }
}