package stepic.java_interview.Ex2_1;

public class Ex2 {

    public static void main(String[] args) {
        System.out.println(Integer.toHexString(reverseByte(0xfe01ccd1)));
    }

    static int reverseByte(int n) {
        return (n << 24)            |
                ((n & 0xff00) << 8)  |
                ((n >>> 8) & 0xff00) |
                (n >>> 24);
    }
}
