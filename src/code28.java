public class code28 {
    public int strStr(String haystack, String needle) {
        boolean flag = false;
        int index = 0;
        for (index = 0; index < haystack.length() - needle.length() + 1; index++) {
            flag = true;
            for (int m = 0, n = index; m < needle.length(); m++, n++) {
                if (haystack.charAt(n) != needle.charAt(m)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                break;
        }
        return flag ? index : -1;
    }
}
