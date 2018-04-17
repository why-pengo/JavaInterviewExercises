public class ReverseString {
    public String strRev(String s) {
        String result = "";

        for (int i = s.length() - 1; i >=0;  i--) {
            result += s.charAt(i);
        }

        return result;
    }
}
