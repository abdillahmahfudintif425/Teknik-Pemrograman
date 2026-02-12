public class ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args) { 
        double d = 1.797693134862315; 
        System.out.println(d);
        float f = (float) d;
        System.out.println(f);
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

