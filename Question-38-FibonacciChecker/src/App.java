public class App {
    public static int isFibonacci(int n) {
        if(n <= 0 ) return 0;
        int a = 1;
        int b = 1;
        while (b < n) {
            int c = a + b;
            a = b;
            b = c;
        }
        if(b == n){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isFibonacci(8));  // Output: 1
        System.out.println(isFibonacci(10)); // Output: 0
    }
}
