package vowelStrings;

class vowelStrings {
        public int vowelStrings(String[] words, int left, int right) {
            int count = 0;
            for (int i = left; i <= right; i++) {
                String a = words[i];
                if (isVowelChar(a.charAt(0)) && isVowelChar(a.charAt(words[i].length() - 1))) {
                    count++;//计数
                }
            }
            return count;
        }
        
        public boolean isVowelChar(char ch){
            boolean flag = false;
            char[] c = {'a','e','i','o','u'};
            for (int i = 0; i < c.length; i++) {
                if(ch == c[i]){
                    flag = true;
                    break;
                }
            }
            return flag;
        }
}
