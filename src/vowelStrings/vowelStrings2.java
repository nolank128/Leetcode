package vowelStrings;

import java.util.Arrays;
import java.util.function.Function;

class vowelStrings2 {
        public int vowelStrings(String[] words, int left, int right) {
            Function<Character,Boolean> t=(Character x)-> x=='a'||x=='i'||x=='e'||x=='o'||x=='u';
            var res=0;
            for (var f: Arrays.copyOfRange(words,left,right+1))
                if(t.apply(f.charAt(0))&&t.apply(f.charAt(f.length()-1)))
                    res++;
            return res;
        }
}
