public class App {
    public static int is235Array(int[] arr) {
        int div_2 = 0;
        int div_3 = 0;
        int div_5 = 0;
        int div_none = 0;
        int total_elements = arr.length;
        for (int i : arr) {
            if( i%2 == 0 ) div_2++;
            if( i%3 == 0 ) div_3++;
            if( i%5 == 0 ) div_5++;
            if( i%2 != 0 && i%3 != 0 && i%5 != 0 ) div_none++;
        }
        int total_div = div_2 + div_3 + div_5 + div_none;
        return total_elements == total_div ? 1 : 0;
    }
    public static void main(String[] args) throws Exception {
        int[] testArray = {30, 42, 70, 8, 23}; 
        System.out.println(is235Array(testArray)); 
    }
}
