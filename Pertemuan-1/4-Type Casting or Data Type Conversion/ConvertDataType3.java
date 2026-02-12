
public class ConvertDataType3 {
    static short methodOne(long l) {
        System.out.println(l);
        int i = (int) l;
        System.out.println(i);
        System.out.println((short)i);
        return (short)i;
    }
    public static void main(String[] args) { 
        double d = 1862315.797693134; 
        System.out.println(d);
        float f = (float) d;
        System.out.println(f);
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

