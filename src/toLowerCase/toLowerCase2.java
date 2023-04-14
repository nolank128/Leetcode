package toLowerCase;

/*
*时间复杂度：O(n)，其中 n 是字符串 s 的长度。
空间复杂度：O(1)，不考虑返回值的空间占用。
*
* 方法二的主要目的是，带领读者一步一步设计一个高效的大写字母转小写字母的 API。
* 参考链接
https://leetcode.cn/problems/to-lower-case/solution/zhuan-huan-cheng-xiao-xie-zi-mu-by-leetc-5e29/
*
*   */

class toLowerCase2 {
    public String toLowerCase2(String s) {
            StringBuilder st = new StringBuilder();
            for (int i = 0; i < s.length(); ++i) {
                char ch = s.charAt(i);
                if (ch >= 65 && ch <= 90) {
                    ch |= 32;
                }
                st.append(ch);
            }
            return st.toString();
        }

}
