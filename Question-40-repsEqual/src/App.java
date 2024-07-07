public class App {
    public static int repsEqual(int[] a, int n) {
        for (int i = a.length - 1; i >= 0; i--) {
            int last_number = n%10;
            n/=10;
            if(last_number != a[i]) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual(new int[]{4, 3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053));
    }
}
