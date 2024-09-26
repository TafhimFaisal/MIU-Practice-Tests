public class App {
    public static int isZeroPlentiful(int[] a) {
        int zeroCount = 0;
        int zeroSet = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0){
                zeroCount++;
            }else{
                if(zeroCount > 0){
                    if(zeroCount < 4){
                        return 0;
                    }
                    zeroSet++;
                    zeroCount = 0;
                }
            }
        }
        
        if(zeroCount > 0){
            if(zeroCount < 4){
                return 0;
            }
            zeroSet++;
        }

        return zeroSet;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0})); // Output: 1
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12})); // Output: 2
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0})); // Output: 3
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4})); // Output: 0
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0})); // Output: 0
        System.out.println(isZeroPlentiful(new int[]{0})); // Output: 0
        System.out.println(isZeroPlentiful(new int[]{})); // Output: 0
    }
}
