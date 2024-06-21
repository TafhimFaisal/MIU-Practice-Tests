public class App {
    public static boolean isPrime(int n) {
        if(n <= 1 || n % 2 == 0 || n % 3 == 0){
            return false;
        }
        if(n <= 3){
            return true;
        }
        for (int i = 5; i*i <= n; i += 6) {
            if(n % i == 0 || n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }

    public static int findPorcupineNumber(int args) {
        int num = args + 1;
        while (true) {
            if(isPrime(num) && num%10 == 9){
                int nextPrime = num + 1;
                while(!isPrime(num)){
                    nextPrime++;
                }
                if(isPrime(nextPrime) && nextPrime%10 == 9){
                    return nextPrime;
                }
            }
            num++;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(findPorcupineNumber(0));     // Expected output: 139
        System.out.println(findPorcupineNumber(138));   // Expected output: 139
        System.out.println(findPorcupineNumber(139));   // Expected output: 409
    }
}
