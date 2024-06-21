public class App {
    public static int oddEvensubs(int[] args) {
        int odd_numbers_sum = 0;
        int even_number_sum = 0;
        for (int i = 0; i < args.length; i++) {
            boolean is_odd = args[i]%2 == 1;
            if(is_odd) odd_numbers_sum+=args[i]; else even_number_sum+=args[i];
        }
        return odd_numbers_sum - even_number_sum;
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        int[] argsArray = {1};
        System.out.println(app.oddEvensubs(argsArray));
    }
}
