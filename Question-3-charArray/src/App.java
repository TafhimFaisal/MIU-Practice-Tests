import java.util.Arrays;

public class App {
    public char[] charArray(char[] cherArray, int start,int length) {
        boolean lenght_not_possible = start + length - 1 >= cherArray.length,
                less_then_zero = start < 0 || length < 0; 

        if(lenght_not_possible || less_then_zero) return null;
        char[] newChar = new char[length];

        for (int i = start,j = 0; j < length; j++,i++) {
            newChar[j] = cherArray[i];
        }
        return newChar;
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        char[] argsArray = {'a','b', 'c'};
        char[] charArray = app.charArray(argsArray, 1, 2);
        System.out.println(Arrays.toString(charArray));
    }
}
