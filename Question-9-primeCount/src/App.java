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
    public static int primeCount(int start, int end) {
        int primeCount = 0;
        if(start > end) {
            return 0;
        }
        for (int n = start; n <= end; n++) {
            if(isPrime(n)){
                primeCount++;
            }
        }
        return primeCount;
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println(app.primeCount(10, 30));
        System.out.println(app.primeCount(11, 29));
        System.out.println(app.primeCount(20, 22));
        System.out.println(app.primeCount(-10, 6));
    }
}
