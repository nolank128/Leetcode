package lengthofLastWord;

/*
反向遍历，寻找最后一个单词并计算其长度。
 */

class lengthofLastWord {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        int nums = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(nums == 0) continue;
                break;
            }
            nums++;
        }
        return nums;
    }
}