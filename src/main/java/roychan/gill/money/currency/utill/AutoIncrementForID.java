package roychan.gill.money.currency.utill;

public class AutoIncrementForID {

    private static Integer   ID_Counter = 0;

    static {
        resetID();
    }


    public  static  Integer genereateID(){
        ID_Counter++;
        return  ID_Counter;
    }

    public static void resetID() {
        ID_Counter = 0;
    }
}
