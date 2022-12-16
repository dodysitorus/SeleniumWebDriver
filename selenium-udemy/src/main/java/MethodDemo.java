public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo d = new MethodDemo();
//        d.getData()
        d.getDataString();
        System.out.println("Print from class MethodDemo2");
        MethodDemo2 d1 = new MethodDemo2();
        d1.getUserData();
        getData2();
    }

    public void getData(){
        System.out.println("Hello World");
    }

    public static void getData2(){
        System.out.println("Hello World");
    }

    public String getDataString(){
        System.out.println("Hello World");
        return "Docu";
    }
}
