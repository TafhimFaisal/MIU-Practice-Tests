public class App {
    public static boolean isprime(int n){
        
        if(n==2||n==3){
            return true;
        }
        
        if(n <= 1|| n%2 == 0 || n%3==0){
            return false;
        }

        for (int i = 5; i*i <= n; i+=6) {
            if( n%i == 0 || n%(i+6) == 0 ){
                return false;
            }
        }

        return true;
    }

    public static int isBunker(int a[], int len) {
        boolean containsPrimeNumber = false;
        boolean containsOne = false;
        for (int i : a) {
            if(isprime(i)){
                containsPrimeNumber = isprime(i);
            }
            if(i==1){
                containsOne = i == 1;
            }
            if(containsOne && containsPrimeNumber){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int array1[] = {7, 6, 10, 1};
        int array2[] = {7, 6, 10};
        int array3[] = {6, 10, 1};
        int array4[] = {3, 7, 1, 8, 1};
        
        System.err.println(isBunker(array1, 4)); // Should print 1
        System.err.println(isBunker(array2, 3)); // Should print 0
        System.err.println(isBunker(array3, 3)); // Should print 0
        System.err.println(isBunker(array4, 5)); // Should print 1
    }
}
