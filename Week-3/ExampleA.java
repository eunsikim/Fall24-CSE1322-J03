class StaticTest{
    public String nonStaticVal = "Hello";
    public static String staticVal = "World";
}

public class ExampleA {
    public static void main(String[] args) {
        StaticTest t1 = new StaticTest();
        StaticTest t2 = new StaticTest();

        // Attribute values unchanged:
        System.out.println();
        System.out.println("t1's nonStaticVal: " + t1.nonStaticVal);
        System.out.println("t1's staticVal: " + t1.staticVal);
        System.out.println();
        System.out.println("t2's nonStaticVal: " + t2.nonStaticVal);
        System.out.println("t2's staticVal: " + t2.staticVal);
        System.out.println();

        // TODO: Change `t1.nonStaticVal`

        // TODO: Change `t1.staticVal`

        // TODO: Change `t2.nonStaticVal`
        
        // TODO: Change `t2.staticVal`


        System.out.println("t1's nonStaticVal: " + t1.nonStaticVal);
        System.out.println("t1's staticVal: " + t1.staticVal);
        System.out.println();
        System.out.println("t2's nonStaticVal: " + t2.nonStaticVal);
        System.out.println("t2's staticVal: " + t2.staticVal);
        System.out.println();
    }
}
