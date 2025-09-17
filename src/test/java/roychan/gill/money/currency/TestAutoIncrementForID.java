package roychan.gill.money.currency;

import org.junit.jupiter.api.Test;
import roychan.gill.money.currency.utill.AutoIncrementForID;

public class TestAutoIncrementForID {
    @Test
    void testCheck() {

        Integer data1 = AutoIncrementForID.genereateID();
        Integer data2 = AutoIncrementForID.genereateID();
        System.out.println(data1);
        System.out.println(data2);
    }
}
