package fourthDay;

public class IntegerOperation implements Operation, BaseOperation {
    @Override
    public boolean myOwnEqual(Object o1, Object o2) {
        int no1 = (int) o1;
        int no2 = (int) o2;

        if(no1 == no2)
            return true;

        return false;
    }

    @Override
    public void show(Object o) {

    }
}
