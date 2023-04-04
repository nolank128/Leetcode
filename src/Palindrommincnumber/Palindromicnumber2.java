package Palindrommincnumber;

public class Palindromicnumber2 {
        public boolean isPalindrome(int x) {
            if(x<0||(x!=0&&x%10==0)){
                return false;
            }
            if(x<10){
                return true;
            }
            int i=0;
            while(x>i){
                i=i*10+x%10;
                x=x/10;
            }
            return (x==i||x==i/10);
        }

}

