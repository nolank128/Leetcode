package reverseString;

/*
* 时间复杂度：O(N)，其中 N为字符数组的长度。一共执行了 N/2 次的交换。
 空间复杂度：O(1),使用了常数空间来存放若干变量。
*/
class reverseString {
    public void reverseString(char[] s){
        int n=s.length;
        for (int left=0,right=n-1;left<right;left++,right--){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
        }
    }
}
