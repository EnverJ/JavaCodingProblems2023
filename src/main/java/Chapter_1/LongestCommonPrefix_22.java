package Chapter_1;

public class LongestCommonPrefix_22 {
    public String longestCommonPrefix(String[] str){
    if (str.length == 1) {
        return str[0];
    }
    int firstLen = str[0].length();
    for (int prefixLen = 0; prefixLen < firstLen; prefixLen ++) {
        char ch= str[0].charAt(prefixLen);
        for (int i = 1; i < str.length; i ++) {
            if (prefixLen >= str[i].length() || str[i].charAt(prefixLen) !=ch) {
                return str[i].substring(0,prefixLen);
            }
        }
    }

        return str[0];
    }

    public static void main(String[] args) {
        String[] ar={"abc","abc","abcd","abcde", "abcdef"};
        LongestCommonPrefix_22 lc=new LongestCommonPrefix_22();
        System.out.println(lc.longestCommonPrefix(ar));

    }
}
