import java.util.Arrays;

public class App {

    public int isCenter(int[] args) {
        boolean is_center = args.length%2 == 1;
        if(!is_center) return 0;
        
        int centered_eletemnt_index = args.length/2;
        int centered_eletemnt = args[centered_eletemnt_index];
        
        for (int i = 0; i < args.length; i++) {
            boolean is_greater_then_center = args[i] > centered_eletemnt;
            if(!is_greater_then_center && i != centered_eletemnt_index){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        int[] arrayaArgs = {};
        App app = new App();
       System.out.println(app.isCenter(arrayaArgs));
    }
}
