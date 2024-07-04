public class App {
    public static boolean sumIsPower(int[] arr) {
        if(arr == null) return false;
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return ((sum > 0) && (sum & (sum - 1)) == 0);
    }
    public static void main(String[] args) throws Exception {
         // Test cases
         System.out.println(sumIsPower(new int[]{8, 8, 8, 8})); // Should print true
         System.out.println(sumIsPower(new int[]{8, 8, 8})); // Should print false
    }
}
