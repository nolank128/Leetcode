package lengthofLastWord;

/*
*以空格为分隔符，分出不同的字符串，然后找最后一个字符串的长度
* */
public class lengthofLastWord2 {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs[strs.length -1].length();
    }
}
