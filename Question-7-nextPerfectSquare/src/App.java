public class App {
    public static int nextPerfectSquare(int n) {
        int num = 0;
        while (num*num <= n) {
            num++;
        }
        return num*num;
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println(app.nextPerfectSquare(6));
        System.out.println(app.nextPerfectSquare(36));
        System.out.println(app.nextPerfectSquare(0));
        System.out.println(app.nextPerfectSquare(-5));
    }
}
