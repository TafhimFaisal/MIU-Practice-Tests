public class App {
    public static int sumFactor(int[] a) {
        int sumFactor = 0;
        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        for (int i : a) {
            if(sum == i){
                sumFactor++;
            }
        }
        return sumFactor;
    }
    public static void main(String[] args) throws Exception {
         // Test cases
         int[] arr1 = {3, 0, 2, -5, 0};
         int[] arr2 = {9, -3, -3, -1, -1};
         int[] arr3 = {1};
         int[] arr4 = {0, 0, 0};
 
         System.out.println(sumFactor(arr1)); // Output: 2
         System.out.println(sumFactor(arr2)); // Output: 0
         System.out.println(sumFactor(arr3)); // Output: 1
         System.out.println(sumFactor(arr4)); // Output: 3
    }
}
