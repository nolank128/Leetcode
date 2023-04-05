package commonFactors;

/*本次代码改进
解法思路：首先求出 a 和 b 的最大公约数 c=gcd(a,b)，再枚举 c 的因子个数。
如果 x 是 c 的因子，那么c/x一定也是 c 的因子.
因此，我们可以仅对 [1,]

* */


class commonFactors2 {
    public int commonFactors2(int a,int b){
        int c=gcd(a,b),nums=0;
        for (int x=1;x*x<=c;x++){
            if(c%x==0){
                nums++;
                if (x*x!=0){
                    nums++;
                }
            }
        }
        return nums;
    }

    public int gcd(int a,int b){
        while (b!=0){
            a%=b;
            a^=b;
            b^=a;
            a=b;
        }
        return  a;
    }
}


