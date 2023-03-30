
/**
 * program
 */
public class program {

    public static void main(String[] args) {
        String str = "aaababaaab";
        System.out.println(ifPalyndrom(str));
    }

    static String compressStr(String str) {

        StringBuffer strBuffer = new StringBuffer(str);
        StringBuffer result = new StringBuffer();
        int len = strBuffer.length();
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (i != len - 1) {
                if (strBuffer.charAt(i) != strBuffer.charAt(i - 1)) {
                    result.append(strBuffer.charAt(i - 1));
                    if (count > 1) {
                        result.append(count);
                    }
                    count = 1;
                } else
                    count++;
            } else {
                if (strBuffer.charAt(i) != strBuffer.charAt(i - 1)) {
                    result.append(strBuffer.charAt(i - 1));
                    if (count > 1) {
                        result.append(count);
                    }
                    result.append(strBuffer.charAt(i));
                } else {
                    result.append(strBuffer.charAt(i - 1));
                    result.append(count);
                }

            }
        }
        return result.toString();
    }

    static Boolean ifPalyndrom(String str) {
        boolean result = true;
        StringBuffer strBuffer = new StringBuffer(str);
        int len = strBuffer.length();
        int j = len - 1;
        for (int i = 0; i < len / 2; i++) {
            if (strBuffer.charAt(i) != strBuffer.charAt(j)) {
                return false;
            } else
                j--;
        }

        return result;
    }
}