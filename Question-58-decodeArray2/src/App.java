public class App {
    public static int decodeArray(int[] a) {
        boolean isNegative = a[0] == -1;
        int index = isNegative ? 1 : 0;
        int result = 0;
        while (index < a.length) {
            int zeroCount = 0;
            while (index < a.length && a[index] == 0) {
                zeroCount++;
                index++;
            }
            index++;
            result = result*10+zeroCount;
        }

        return isNegative ? -result: result;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        System.out.println(decodeArray(new int[]{1})); // 0
        System.out.println(decodeArray(new int[]{0, 1})); // 1
        System.out.println(decodeArray(new int[]{-1, 0, 1})); // -1
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1})); // 100001
        System.out.println(decodeArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1})); // 999
    }
}
