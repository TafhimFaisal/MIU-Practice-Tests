public class App {
    public static int largestPrimeFactor(int n) {
        if(n<=1){
            return 0;
        }
        int largestPrimefector = 0;

         // Check for factors of 2 first to handle even numbers
        while (n%2 == 0) {
            largestPrimefector = n;
            n/=2; 
        }

        // Check for odd factors from 3 onwards
        for (int i = 3; i < n; i++) {
            while (n%i == 0) {
                largestPrimefector = n;
                n/=i;
            }
        }

         // If n is still greater than 2, then it must be a prime number
        if(n>2){
            largestPrimefector = n;
        }
        return largestPrimefector;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        System.out.println(largestPrimeFactor(10));   // Output: 5
        System.out.println(largestPrimeFactor(6936)); // Output: 17
        System.out.println(largestPrimeFactor(1));    // Output: 0
    }
}
