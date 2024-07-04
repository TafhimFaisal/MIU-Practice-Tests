public class App {
    public static int isAllPossibilities(int[] a) {
        int n = a.length;
        if(n == 0) return 0;
        boolean[] isFound = new boolean[n];
        for (int i : a) {
            if(n < 0 || i >= n){
                return 0;
            }
            isFound[i] = true;
        }
        
        
        for (boolean b : isFound) {
            if(!b){
                return 0;
            }
        }
        
        return 1;
        
    }
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3})); // 1
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0})); // 1
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3})); // 0
        System.out.println(isAllPossibilities(new int[]{0, 2, 3}));    // 0
        System.out.println(isAllPossibilities(new int[]{0}));          // 1
        System.out.println(isAllPossibilities(new int[]{}));           // 0
    }
}
