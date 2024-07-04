public class App {
    public static int isOlympic(int[] arr) {
        for (int i : arr) {
            int sum = 0;
            for (int j : arr) {
                if(j < i){
                    sum+=j;
                }
            }
            
            if(i < sum){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
         // Test cases
         int[] test1 = {3, 2, 1};
         int[] test2 = {2, 2, 1, 1};
         int[] test3 = {1,1,1,2, 3};
         int[] test4 = {4, 2, 1};
         int[] test5 = {1, 1, 1, 1};
 
         System.out.println(isOlympic(test1)); // Should return 1
         System.out.println(isOlympic(test2)); // Should return 1
         System.out.println(isOlympic(test3)); // Should return 0
         System.out.println(isOlympic(test4)); // Should return 1
         System.out.println(isOlympic(test5)); // Should return 1
    }
}
