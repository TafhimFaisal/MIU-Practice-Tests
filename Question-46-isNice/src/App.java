public class App {
    public static int isNice(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        for (int i : arr) {
            if(i >= (sum - i)){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        // Example usage
        int[] arr1 = {2, 3, 3};
        int[] arr2 = {10, 20, 30};

        System.out.println(isNice(arr1)); // Should print 1
        System.out.println(isNice(arr2)); // Should print 0
    }
}
