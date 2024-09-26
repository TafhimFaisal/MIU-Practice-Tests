public class App {
    public static int isOnionArray(int[] a) {
        int fullLength = a.length;
        int halfLength = fullLength/2;
        for (int j = 0; j < halfLength; j++) {
            if(a[j] + a[fullLength - 1 - j] > 10){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        System.out.println(isOnionArray(new int[] {1, 2, 19, 4, 5}));  // Should return 1
        System.out.println(isOnionArray(new int[] {1, 2, 3, 4, 15}));  // Should return 0
        System.out.println(isOnionArray(new int[] {1, 3, 9, 8}));      // Should return 0
        System.out.println(isOnionArray(new int[] {2}));               // Should return 1
        System.out.println(isOnionArray(new int[] {}));                // Should return 1
        System.out.println(isOnionArray(new int[] {-2, 5, 0, 5, 12})); // Should return 1
    }
}
