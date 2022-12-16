public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
        int myNum = 5;
        // Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int[] arr2 = {1,2,4,5,6};

        for (int x = 0 ; x < arr.length ; x++){
            System.out.println(arr[x]);
        }

        String[] name = {"dody","yan","piter"};

        for (int i = 0 ; i < name.length ; i++){
            System.out.println(name[i]);
        }

        System.out.println("-- ++ -- ++");
        for (String s: name){
            System.out.println(s);
        }



    }
}
