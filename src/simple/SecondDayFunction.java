package simple;

public class SecondDayFunction {

    /*1. modifier
    2. return type
    3. name of function
    4. parameter*/
    private int add (int x , int y) {
        return x + y;
    }

    /*
    * Function Overloading
    * three ways to overload a function
    * 1. no. of parameters
    * 2. types of parameters
    * 3. sequence of parameters
    * */

    private int add (int x, int y, int z ) {
        return x + y + z;
    }

    private float add(float x, float y) {
        return x+y;
    }

    private float add (int x , float y) {
        return x + y;
    }

    private float add (float y, int x) {
        return x + y;
    }

    public static void main(String[] args) {
        SecondDayFunction sdf = new SecondDayFunction();
        int r = sdf.add (2, 4);
        System.out.println("Addition is: " + r);
        sdf.add(2.3f, 4);
        sdf.add(2, 4.4f);
    }

}
