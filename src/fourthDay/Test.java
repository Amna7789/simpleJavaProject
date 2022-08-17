package fourthDay;

public class Test {

    public static void main(String[] args) {
        IntegerOperation io = new IntegerOperation();
        Integer n1 = new Integer(3);
        Integer n2 = new Integer(3);
        System.out.println("Integer equal:" + io.myOwnEqual(3, 2));

        Float f1 = new Float(3.5261);
        Float f2 = new Float(3.53);
        FloatOperation fo = new FloatOperation();
        fo.myOwnEqual(f1, f2);
        System.out.println("Float equal: " + fo.myOwnEqual(f1, f2));
    }
}
