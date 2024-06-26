

public class VarExample {
    public static void main(String[] args) {

        byte aByte = 127;
        byte bByte = (byte) (aByte + 1);  // переполнение
        byte cByte = 111;
        System.out.println(bByte);  // переполнение
        System.out.println(aByte + cByte);

        short aShort = -32768;
        short bShort = (short) (aShort - 1);// переполнение
        short cShort = 0;
        System.out.println(bShort);  // переполнение
        System.out.println(aShort * cShort);


        int aInt = 1234567890;
        //  int bInt =aInt  +1 ; error
        int cInt = 1235;
        System.out.println(aInt / cInt);


        long aLong = 1234567890111L;
        long cLong = 1235L;
        System.out.println(aLong - cLong);

        float aFloat = 10.1F;
        float bFloat = 0.1F;
        //float cFloat = 10.1F*10000000000; error
        System.out.println(aFloat * bFloat);


        double aDouble = 10.10001;
        double bDouble = 0.1;
        System.out.println(aDouble / bDouble);


        boolean aBoolean = true;
        boolean bBoolean = false;

        if (30 <= aByte) {

            System.out.println(aBoolean);
        } else {
            System.out.println(bBoolean);
        }


        System.out.println(aInt / bDouble);
        System.out.println(aDouble % 123);
        System.out.println(aInt / bDouble * aDouble);


        String sString = "Love";
        System.out.println(sString.equals("Simple"));
        System.out.println(sString.equals("Love") && cByte == 111);


    }

}
