public class App {
    public static int is121Array(int[] a) {
        int len = a.length;
        if(len < 3) return 0;

        int i = 0;
        int oneStartCount = 0;
        while (i < len && a[i] == 1) {
            oneStartCount++;
            i++;
        }
        if(oneStartCount == 0) return 0;
        
        int twoCount = 0;
        while (i < len && a[i] == 2) {
            twoCount++;
            i++;
        }

        if(twoCount == 0) return 0;

        int oneEndCount = 0;
        while (i < len && a[i] == 1) {
            oneEndCount++;
            i++;
        }

        System.err.println("**********************");
        String result = " One start: "+ oneStartCount + "\n two count: "+ twoCount + "\n one End: " + oneEndCount;
        System.err.println(result);
        System.err.println("**********************");

        if(
            oneEndCount != oneStartCount ||
            i != len
        ) return 0;


        return 1;
    }
    public static void main(String[] args) throws Exception {
        int[] testArray1 = {1, 1, 2, 2, 1, 1};
        int[] testArray2 = {1, 2, 2, 1};
        int[] testArray3 = {1, 1, 1, 2, 2, 1, 1};
        int[] testArray4 = {2, 1, 1, 2, 1, 1};
        int[] testArray5 = {1, 1, 2, 1};

        System.out.println(is121Array(testArray1)); // Should print 1
        System.out.println(is121Array(testArray2)); // Should print 1
        System.out.println(is121Array(testArray3)); // Should print 0
        System.out.println(is121Array(testArray4)); // Should print 0
        System.out.println(is121Array(testArray5)); // Should print 0
    }
}
