public class App {
    public static int checkConcatenatedSum(int n, int catlen) {
        int originalNumber = n;
        int sum = 0;
        while (n > 0) {
            int number = n%10;
            int concatNumber = 0;
            n/=10;
            for (int i = 0; i < catlen; i++) {
                concatNumber = concatNumber*10+number;
            }
            sum+=concatNumber;
        }
        return sum == originalNumber ? 1 : 0;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(checkConcatenatedSum(198, 2));  // Output: 1
        System.out.println(checkConcatenatedSum(198, 3));  // Output: 0
        System.out.println(checkConcatenatedSum(2997, 3)); // Output: 1
        System.out.println(checkConcatenatedSum(2997, 2)); // Output: 0
        System.out.println(checkConcatenatedSum(13332, 4));// Output: 1
        System.out.println(checkConcatenatedSum(9, 1));    // Output: 1
    }
}
