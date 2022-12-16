public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
//        String s = "Dody Yan Piter Sitorus";
        String s1 = "Dody Yan Piter Sitorus";
        String s4 = "Hello";

        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s = "Dody Yan Piter Sitorus";
        String [] splitString = s.split("Yan");
        System.out.println(splitString[0]);
        System.out.println(splitString[1]);
        System.out.println(splitString[1].trim());

//        for (int i = 0 ; i < s.length() ; i++){
//            System.out.println(s.charAt(i));
//        }
        for (int i = s.length()-1 ; i >= 0 ; i--){
            System.out.println(s.charAt(i));
        }
//        System.out.println(splitString[2]);
    }
}
