public class App {
    public int reverseNumber(int args) {
        int number = args, reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /=10;
        }
        return reverse;
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println(app.reverseNumber(12345));
    }
}
