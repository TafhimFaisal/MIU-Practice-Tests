public class App {
    static int secondLargest(int[] a) {
        int max = -1;
        int secondMax = -1;

        for (int i : a) {
            if(i > max){
                secondMax = max;
                max = i;
            }
            if(i > secondMax && i != max){
                secondMax = i;
            }
        }
        return secondMax;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(secondLargest(new int[]{1, 2, 3, 4}));
        System.out.println(secondLargest(new int[]{4, 1, 2, 3}));
        System.out.println(secondLargest(new int[]{1, 1, 2, 2}));
        System.out.println(secondLargest(new int[]{1, 1}));
        System.out.println(secondLargest(new int[]{1}));
        System.out.println(secondLargest(new int[]{}));
    }
}
