import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public int[] commonElement(int[] array1, int[] array2) {
        boolean is_null = array1 == null || array2 == null;
        if(is_null) return null;
        boolean is_array_one_grater = array1.length > array2.length;
        int[] min, max;
        if(is_array_one_grater){
            min = array2;
            max = array1; 
        }else{
            min = array1;
            max = array2;
        }
        int[] result = new int[min.length];
        int count = 0;
        for (int i = 0; i < min.length; i++) {
            for (int j = 0; j < max.length; j++) {
                if(min[i] == max[j]){
                    result[count++] = min[i];
                    break;       
                }
            }
        }
        int[] common_elements = new int[count];
        for (int i = 0; i < common_elements.length; i++) {
            common_elements[i] = result[i];
        }
        return common_elements;
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        int[] arrayArgs1 = {1,8,3,2,6},
              arrayArgs2 = {2,6,1},
              result = app.commonElement(arrayArgs1,arrayArgs2);

        System.out.println("Common elements: " + Arrays.toString(result));
    }
}
