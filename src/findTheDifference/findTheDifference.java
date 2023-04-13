package findTheDifference;

/*
* 时间复杂度：O(N)。
  空间复杂度：O(1)。*/

class findTheDifference {
    public char findTheDifference(String s,String t){
        int as=0,at=0;
        for (int i=0;i<s.length();i++){
            as+=s.charAt(i);
        }
        for (int i=0;i<t.length();i++){
            at+=t.charAt(i);
        }
        return (char)(at-as);
    }
}
