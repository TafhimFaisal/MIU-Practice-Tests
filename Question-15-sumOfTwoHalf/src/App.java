public class App {
    public static int sumOfTwoHalf(int[] args) {
        if (args.length % 2 != 0) {
            return 0;
        }

        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;
        int mid = args.length/2;

        for (int i = 0; i < args.length; i++) {
            if(i < mid){
                sumOfFirstHalf+= args[i];
            }else if(i >= mid){
                sumOfSecondHalf+=args[i];
            }
        }

        return sumOfFirstHalf == sumOfSecondHalf ? 1 : 0;
    }
    public static void main(String[] args) throws Exception {
        int[] a1 = {5, 4, 3, 2, 3, 4, 6, 1};
        int[] a2 = {1, 2, 3, 4, 5, 6};
        
        System.out.println(sumOfTwoHalf(a1)); // Expected output: 1
        System.out.println(sumOfTwoHalf(a2)); // Expected output: 0
    }
}
