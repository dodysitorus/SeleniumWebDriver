import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBushUp2 {
    public static void main(String[] args) {
        int[] arr2 = {1,2,4,5,6,7,8,9,18,122};

        for (int i : arr2){
            if (i% 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("++ -- ++ --");

        for (int i = 0 ; i < arr2.length ; i++){
            if (arr2[i] % 2 == 0){
                System.out.println(arr2[i]);
            }
        }

        System.out.println("++ -- ++ --");

        ArrayList<String> a = new ArrayList<String>();
        a.add("dody");
        a.add("yan");
        a.add("piter");
        a.add("sitorus");
        System.out.println(a.get(3));
        System.out.println("++ -- ++ -- ++");
        for (int i = 0 ; i<a.size() ; i++){
            System.out.println(a.get(i));
        }
        System.out.println("++ -- ++ -- ++");
        for (String s : a){
            System.out.println(s);
        }
        System.out.println("++ -- ++ -- ++");
        System.out.println(a.contains("sitorus"));

        System.out.println("++ -- ++ -- ++");
        String[] name = {"dody","yan","piter"};
        List<String> nameArrayList = Arrays.asList(name);
        System.out.println(nameArrayList.contains("selenium"));
    }
}
