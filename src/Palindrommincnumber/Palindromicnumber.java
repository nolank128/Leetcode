package Palindrommincnumber;

public class Palindromicnumber {
    public boolean isPalindrome(int x){
        if(x<0)
            return false;
        if (x<10)
            return true;
        StringBuilder str=new StringBuilder();
        while(x!=0){
            str.append((char) (x%10)+'0');
            x/=10;
        }
        String s=str.toString();
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}
