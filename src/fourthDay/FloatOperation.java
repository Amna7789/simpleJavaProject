package fourthDay;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FloatOperation implements Operation {
    @Override
    public boolean myOwnEqual(Object o1, Object o2) {
        BigDecimal no1 = new BigDecimal((float) o1);
        no1 = no1.setScale(2, RoundingMode.CEILING);
        BigDecimal no2 = new BigDecimal((float) o2);
        no2 = no2.setScale(2, RoundingMode.CEILING);

        if(no1.floatValue() == no2.floatValue())
            return true;

        return false;
    }
}
