public class App {
    public static int isDigitIncreasing(int n) {
        for (int i = 1; i < 9; i++) {
            int sum = 0;
            int currentNumber = 0;
            for (int j = 1; sum < n; j++) {
                currentNumber = currentNumber*10+i;
                sum += currentNumber; 
                if(sum == n){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isDigitIncreasing(7));    // Output: 1
        System.out.println(isDigitIncreasing(36));   // Output: 1
        System.out.println(isDigitIncreasing(984));  // Output: 1
        System.out.println(isDigitIncreasing(7404)); // Output: 1
        System.out.println(isDigitIncreasing(100));  // Output: 0 (example of non-digit-increasing number)
    }
}
