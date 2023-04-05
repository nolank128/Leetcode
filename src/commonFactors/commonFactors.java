package commonFactors;

class commonFactors {

    //在（1，min(a,b)）中枚举x，判断x是否为公因子，是的话，加一计数，最终返回所有公因子个数。
    public int commonFactors(int a,int b) {
        int num=0;//用于计数
        for (int x=1;x<=Math.min(a,b);x++){
            if (a%x==0&&b%x==0){
                num++;
            }
        }
        return num;
    }
}
