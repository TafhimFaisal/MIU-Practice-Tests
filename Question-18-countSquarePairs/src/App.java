public class App {
    public static boolean isPerfectSquar(int n) {
        for (int i = 1; i*i <= n; i++) {
            if(i*i == n){
                return true;
            }
        }
        return false;
    }
    public static int countSquarePairs(int[] args) {
        int count = 0;
        for (int x : args) {
            for (int y : args) {
                if(x > 0 && y > 0 && x < y && isPerfectSquar(x+y)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        int[] array1 = {11, 5, 4, 20};
        System.out.println(countSquarePairs(array1));  // Output: 3

        int[] array2 = {9, 0, 2, -5, 7};
        System.out.println(countSquarePairs(array2));  // Output: 2

        int[] array3 = {9};
        System.out.println(countSquarePairs(array3));  // Output: 0
    }
}
