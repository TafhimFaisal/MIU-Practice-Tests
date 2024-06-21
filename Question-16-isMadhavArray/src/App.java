public class App {
    public static int isMadhavArray(int[] args) {
        int len = args.length;
        int n = 0;
        while (n*(n+1)/2 < len) {
            n++;
        }
        if(n*(n+1)/2 != len){
            return 0;
        }

        int index = 1;
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += args[index];
                index++;
            }
            if(args[0] != sum){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        int[] a1 = {2, 1, 1};
        int[] a2 = {2, 1, 1, 4, -1, -1};
        int[] a3 = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int[] a4 = {18, 9, 10, 6, 6, 6};
        int[] a5 = {-6, -3, -3, 8, -5, -4};
        int[] a6 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
        int[] a7 = {3, 1, 2, 3, 0};

        System.out.println(isMadhavArray(a1)); // Output: 1
        System.out.println(isMadhavArray(a2)); // Output: 1
        System.out.println(isMadhavArray(a3)); // Output: 1
        System.out.println(isMadhavArray(a4)); // Output: 0
        System.out.println(isMadhavArray(a5)); // Output: 0
        System.out.println(isMadhavArray(a6)); // Output: 1
        System.out.println(isMadhavArray(a7)); // Output: 0
    }
}
