//larger type to smaller type, requires an explicit cast and may lose precision or overflow.

public class Narrowingcasting {
    public static void main(String[] args) {
        double x = 9.78;
        int y = (int) x; // y = 9 (decimals dropped)
        System.out.println(y);

        int big = 130;
        byte small = (byte) big; // small = -126 (overflow due to byte range -128..127)
        System.out.println(small);

        // Character
        char c = 'A'; // 65
        int code = c; // 65 (widening)
        char again = (char) code; // narrowing if code might exceed char range
        System.out.println(again);

    }
}
