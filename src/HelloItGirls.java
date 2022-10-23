import java.time.LocalDate;

public class HelloItGirls {
    public static void main(String[] args){
        /*
        byte _byte = 111;
        Byte _byteBoxed;
        _byteBoxed = new Byte(_byte);
        _byteBoxed = Byte.valueOf(_byte);
        _byteBoxed = _byte;
        _byte = _byteBoxed.byteValue();
        _byte = _byteBoxed;

        short _short = 32000;
        Short _shortBoxed;
        _shortBoxed = new Short(_short);
        _shortBoxed = Short.valueOf(_short);
        _shortBoxed = _short;
        _short = _shortBoxed.shortValue();
        _short = _shortBoxed;

        int _int = 5;
        Integer _intBoxed;
        _intBoxed = new Integer(_int);
        _intBoxed = Integer.valueOf(_int);
        _intBoxed = _int;
        _int = _intBoxed.intValue();
        _int = _intBoxed;

        long _long = 2;
        Long _boxedLong;
        _boxedLong = new Long(_long);
        _boxedLong = Long.valueOf(_long);
        _boxedLong = _long;
        _long = _boxedLong.longValue();
        _long = _boxedLong;
        System.out.println(_long);

        char _char = 'a';
        Character _boxedChar;
        _boxedChar = new Character(_char);
        _boxedChar = Character.valueOf(_char);
        _boxedChar = _char;
        _char = _boxedChar.charValue();
        _char = _boxedChar;

        float _float = 3.14F;
        Float _boxedFloat;
        _boxedFloat = new Float(_char);
        _boxedFloat = Float.valueOf(_float);
        _boxedFloat = _float;
        _float= _boxedFloat.floatValue();
        _float = _boxedFloat;

        double _double = 0.5;
        Double _boxedDouble;
        _boxedDouble = new Double(_double);
        _boxedDouble = Double.valueOf(_double);
        _boxedDouble = _double;
        _double = _boxedDouble.doubleValue();
        _double = _boxedDouble;

        boolean _boolean = true;
        Boolean _boxedBoolean;
        _boxedBoolean = new Boolean(_boolean);
        _boxedBoolean = Boolean.valueOf(_boolean);
        _boxedBoolean = _boolean;
        _boolean = _boxedBoolean.booleanValue();
        _boolean = _boxedBoolean;
        */
        /*double a = 5;
        double b = 8;
        double S;
        double P;
        S = (a*b)/2;
        P = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)) + a + b;
        System.out.println("S = " + S);
        System.out.println("P = " + P);
        System.out.println("P > 15: " + (P>15));
        System.out.println("S < 30: " + (S<30));*/
        String s = "Training Java";
        String date = String.valueOf(LocalDate.now());
        System.out.println("Length of s = "+s.length() + ", char on 5th position is: " + s.charAt(4)+ ", today date: " + (date.substring(date.length()-2)));
        }
}
