package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/*
给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：

answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
answer[i] == "Fizz" 如果 i 是 3 的倍数。
answer[i] == "Buzz" 如果 i 是 5 的倍数。
answer[i] == i （以字符串形式）如果上述条件全不满足。

* */
class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> li=new ArrayList<>();
        for(Integer i=1;i<=n;i++){
            if(i%15==0)li.add("FizzBuzz");//既是3的倍数又是5的倍数，那就是15的倍数
            else if(i%3==0) li.add("Fizz");
            else if(i%5==0) li.add("Buzz");
            else li.add(i.toString());
        }
        return li;

    }
}
