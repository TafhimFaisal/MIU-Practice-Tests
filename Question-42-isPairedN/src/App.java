public class App {
    public static int isPairedN(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j] == n && i + j == n){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        int[] a1 = {1, 4, 1, 4, 5, 6};
        int n1 = 5;
        
        int[] a2 = {1, 4, 1, 4, 5, 6};
        int n2 = 6;
        
        int[] a3 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int n3 = 6;
        
        int[] a4 = {1, 2, 3, 4};
        int n4 = 8;

        System.out.println(isPairedN(a2, n2)); // Output: 1
        System.out.println(isPairedN(a3, n3)); // Output: 1
        System.out.println(isPairedN(a1, n1)); // Output: 1
        System.out.println(isPairedN(a4, n4)); // Output: 0
    }
}
