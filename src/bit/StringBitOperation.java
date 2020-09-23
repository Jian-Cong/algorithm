package bit;

/**
 * 位运算实现字母大小写转换
 *
 * @author: jiancong
 * @date: 2020/9/23
 */
public class StringBitOperation {

    /**
     * 大小写互换
     * @param str
     * @return
     */
    public static String exchange(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= 0x20;
        }
        return new String(chars);
    }

    /**
     * 大写转小写
     * @param str
     * @return
     */
    public static String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            ch[i] |= 0x20;
        }
        return String.valueOf(ch);
    }

    /**
     * 小写转大写
     * @param str
     * @return
     */
    public static String toUpper(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] &= 0xdf;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "ABcd";
        System.out.println(toLowerCase(s));
        System.out.println(toUpper(s));
        System.out.println(exchange(s));
    }

}
