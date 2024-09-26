public class App {
    public static int isSequencedArray(int[] a, int m, int n) {
        int length = a.length;
        if(length == 0 ){
            return 0;
        }
        
        if(a[0] < m || a[length - 1] > n){
            return 0;
        }
        
        for (int i = 0; i < length; i++) {
            if(a[i] < m || a[i] > n){
                return 0;
            }
            if(i != 0 && a[i] < a[i-1]){
                return 0;
            }
        }

        for (int i = m; i <= n; i++) {
            boolean found = false;
            for (int j : a) {
                if(i == j){
                    found = true;
                    break;
                }
            }
            if(!found){
                return 0;
            }
        }

        return 1;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5)); // 1
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2)); // 1
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5)); // 0
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5)); // 0
    }
}
