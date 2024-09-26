public class App {
    static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
        int i = 0;
        int k = 0;
        int matches = 0;
        for (i = 0; i < len; i++) {
            if(a[i] == pattern[k]){
                matches++;
            }else if(matches == 0  || k == patternLen - 1){
                return 0;
            }else{
                k++;
                if(a[i] == pattern[k]){
                    matches = 1;
                }else{
                    return 0;
                }
            }
        }
        return (i == len && k == patternLen - 1) ? 1 : 0;
    }
    public static void main(String[] args) throws Exception {
        // Test case 1
        int[] a1 = {1, 1, 1, 1, 1};
        int[] pattern1 = {1};
        System.out.println("Test case 1: " + matchPattern(a1, a1.length, pattern1, pattern1.length));  // Expected: 1

        // Test case 2
        int[] a2 = {1};
        int[] pattern2 = {1};
        System.out.println("Test case 2: " + matchPattern(a2, a2.length, pattern2, pattern2.length));  // Expected: 1

        // Test case 3
        int[] a3 = {1, 1, 2, 2, 2, 2};
        int[] pattern3 = {1, 2};
        System.out.println("Test case 3: " + matchPattern(a3, a3.length, pattern3, pattern3.length));  // Expected: 1

        // Test case 4
        int[] a4 = {1, 2, 3};
        int[] pattern4 = {1, 2};
        System.out.println("Test case 4: " + matchPattern(a4, a4.length, pattern4, pattern4.length));  // Expected: 0

        // Test case 5
        int[] a5 = {1, 2};
        int[] pattern5 = {1, 2, 3};
        System.out.println("Test case 5: " + matchPattern(a5, a5.length, pattern5, pattern5.length));  // Expected: 0

        // Test case 6
        int[] a6 = {1, 1, 2, 2, 2, 2, 3};
        int[] pattern6 = {1, 3};
        System.out.println("Test case 6: " + matchPattern(a6, a6.length, pattern6, pattern6.length));  // Expected: 0

        // Test case 7
        int[] a7 = {1, 1, 1, 1};
        int[] pattern7 = {1, 2};
        System.out.println("Test case 7: " + matchPattern(a7, a7.length, pattern7, pattern7.length));  // Expected: 0

        // Test case 8
        int[] a8 = {1, 1, 1, 1, 2, 2, 3, 3};
        int[] pattern8 = {1, 2};
        System.out.println("Test case 8: " + matchPattern(a8, a8.length, pattern8, pattern8.length));  // Expected: 0

        // Test case 9
        int[] a9 = {1, 1, 10, 4, 4, 3};
        int[] pattern9 = {1, 4, 3};
        System.out.println("Test case 9: " + matchPattern(a9, a9.length, pattern9, pattern9.length));  // Expected: 0
    }
}
