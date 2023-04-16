package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;



/*
题目
* 小北有n种邮票，第i种邮票上印有正整数i（i∈[1,n]），
* 且第i种邮票现有c[i]张。为了凑出尽可能多的套邮票，
* 小北拿出了m张空白邮票，他可以在上面写上数i，将其当做第i种邮票来凑出一套邮票。
* 然而小北觉得手写的邮票不太美观，决定第i种邮票最多手写a[i]张。
* 请问小北最多能凑出多少套邮票？
*
时间复杂度：O（n*n）
空间复杂度：O（n）

* */
public class StampCollector {

    public static int maxNumOfSets(int[] stamps, int m) {
        int n = stamps.length;
        int[] counts = new int[n + 1];
        for (int i = 0; i < n; i++) {
            counts[stamps[i]]++;
        }
        int maxNumOfSets = 0;
        while (true) {
            // 找到最多可以凑出的套数以及对应的邮票种类
            int maxNumOfSetsForOneStamp = Integer.MAX_VALUE;
            int maxStamp = -1;
            for (int i = 1; i <= n; i++) {
                if (counts[i] > 0) {
                    maxNumOfSetsForOneStamp = Math.min(maxNumOfSetsForOneStamp, counts[i]);
                    maxStamp = i;
                }
            }
            if (maxNumOfSetsForOneStamp == Integer.MAX_VALUE) {
                break;  // 无法再凑出一套邮票
            }
            // 使用已有的邮票凑出一套邮票
            counts[maxStamp] -= maxNumOfSetsForOneStamp;
            m += maxNumOfSetsForOneStamp - 1;
            maxNumOfSets++;
            // 如果已经用完了所有手写的空白邮票，退出循环
            if (m <= 0) {
                break;
            }
            // 使用手写的空白邮票来凑出一套邮票
            int maxCount = 0;
            for (int i = 1; i <= n; i++) {
                if (counts[i] > maxCount) {
                    maxCount = counts[i];
                    maxStamp = i;
                }
            }
            counts[maxStamp]++;
            m--;
        }
        return maxNumOfSets;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入邮票的种类数n：");
        int n = scanner.nextInt();
        System.out.print("请输入每种邮票的数量，以空格分隔：");
        int[] stamps = new int[n];
        for (int i = 0; i < n; i++) {
            stamps[i] = scanner.nextInt();
        }
        System.out.print("请输入手写空白邮票的数量m：");
        int m = scanner.nextInt();
        int maxNumOfSets = maxNumOfSets(stamps, m);
        System.out.println("最多可以凑出 " + maxNumOfSets + " 套邮票。");
    }
}


