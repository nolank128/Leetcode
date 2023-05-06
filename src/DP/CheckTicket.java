package DP;

import java.util.Scanner;

public class CheckTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    // 从标准输入读取数列
        String s = input.nextLine();
        input.close();
        int[] tickets = new int[10];    // 记录每个游客的门票数量
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {    // 如果是数字
                int num = s.charAt(i) - '0';
                if (i < num)    // 导游在第一位
                    tickets[num]--;    // 导游不需要门票
                else if (i > num)
                    tickets[num]++;    // 其他游客需要门票
            }
        }
        boolean valid = true;
        for (int i = 1; i < 10; i++) {    // 检查每个团体的门票数量是否正确
            if (tickets[i] != 0) {
                valid = false;
                break;
            }
        }
        if (valid)
            System.out.println("所有团体都购买了正确数量的门票");
        else
            System.out.println("有团体购买了错误数量的门票");
    }
}
