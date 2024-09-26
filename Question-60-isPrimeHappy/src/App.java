public class App {
    public static boolean isPrime(int n) {
        if(n == 2 || n == 3){
            return true;
        }
        
        if(n <= 1 || n % 2 == 0 || n % 3 == 0){
            return false;
        }
        
        for (int i = 5; i*i <= n; i += 6) {
            if(n % i == 0 || n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }

    public static int isPrimeHappy(int n) {
        if(n<=2) return 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(isPrime(i)){
                sum+=i;
            }
        }
        if(sum%n == 0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isPrimeHappy(5));  // Output: 1
        System.out.println(isPrimeHappy(25)); // Output: 1
        System.out.println(isPrimeHappy(32)); // Output: 1
        System.out.println(isPrimeHappy(8));  // Output: 0
        System.out.println(isPrimeHappy(2));  // Output: 0
    }
}
