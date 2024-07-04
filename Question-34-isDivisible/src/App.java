public class App {
    public static int isDivisible(int[] a, int divisor) {
        for (int number : a) {
            if(number % divisor != 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
         // Test cases
         int[] array1 = {3, 3, 6, 36};
         int divisor1 = 3;
         
         int[] array2 = {4};
         int divisor2 = 2;
         
         int[] array3 = {3, 4, 3, 6, 36};
         int divisor3 = 3;
         
         int[] array4 = {6, 12, 24, 36};
         int divisor4 = 12;

         int[] array5 = {};
         int divisor5 = 3;

         System.out.println(isDivisible(array2, divisor2)); // Output: 1
         System.out.println(isDivisible(array3, divisor3)); // Output: 0
         System.out.println(isDivisible(array4, divisor4)); // Output: 0
         System.out.println(isDivisible(array1, divisor1)); // Output: 1
         System.out.println(isDivisible(array5, divisor5)); // Output: 1
    }
}
