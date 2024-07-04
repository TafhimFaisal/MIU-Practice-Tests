public class App {
    public static int goodSpread(int[] a) {
        for (int i : a) {
           int count = 0;
           for (int j : a) {
                if(i==j){
                    count++;
                }
           } 
           if(count > 3) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
         // Test cases
         System.out.println(goodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9})); // Should print 1
         System.out.println(goodSpread(new int[] {3, 1, 3, 1, 3, 5, 5, 3})); // Should print 0
    }
}
