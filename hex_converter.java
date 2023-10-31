package JavaRushTests;

public class hex_converter {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if(decimalNumber<=0)
            return null;
        String hexNumber="";
        int index = decimalNumber%16;
        int value = Character.getNumericValue(HEX.charAt(index));
        while(decimalNumber!=0){
            hexNumber=value+hexNumber;
            decimalNumber=decimalNumber/16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        if(hexNumber==null)
            return 0;
        int decimalNumber=0;
        for(int i=0; i<hexNumber.length(); i++){
            int index=i;
            int value = Character.getNumericValue(HEX.charAt(index));
            decimalNumber=16*decimalNumber+value;
        }
        return decimalNumber;
    }
}
