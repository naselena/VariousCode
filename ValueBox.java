package JavaRushTests;

public class ValueBox {
//    byte byteValue;
//    short shortValue;
//    int intValue;
//    long longValue;
//
//    float floatValue;
//    double doubleValue;
//
//    char charValue;
//    boolean booleanValue;
//
//    Byte byteValueBox= Byte.valueOf(byteValue);
//    Short shortValueBox= Short.valueOf(shortValue);
//    Integer integerValueBox =Integer.valueOf(intValue);
//    Long longValueBox= Long.valueOf(longValue);
//    Float floatValueBox=Float.valueOf(floatValue);
//    Double doubleValueBox=Double.valueOf(doubleValue);
//    Character characterValueBox=Character.valueOf(charValue);
//    Boolean booleanValueBox=Boolean.valueOf(booleanValue);
}

class ValueBox2{
    Byte byteValueBox;
    Short shortValueBox;
    Integer integerValueBox;
    Long longValueBox;

    Float floatValueBox;
    Double doubleValueBox;

    Character characterValueBox;
    Boolean booleanValueBox;

    byte byteValue=byteValueBox.byteValue();
    short shortValue=shortValueBox.shortValue();
    int intValue =integerValueBox.intValue();
    long longValue=longValueBox.longValue();
    float floatValue=floatValueBox.floatValue();
    double doubleValue=doubleValueBox.floatValue();
    char charValue=characterValueBox.charValue();
    boolean booleanValue=booleanValueBox.booleanValue();
}