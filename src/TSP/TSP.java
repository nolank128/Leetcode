package TSP;

import java.util.*;

public class TSP {

    static int n; // 城市数量
    static int[][] graph; // 城市间距离
    static int[] bestPath; // 最优路径
    static int bestLength; // 最优路径长度
    static int[] visited; // 标记已经访问的城市

    public static void main(String[] args) {
        // 城市数量
        n = 5;
        // 城市间距离，存储在邻接矩阵中
        graph = new int[][]{ {0, 10, 15, 20, 8},
                {10, 0, 35, 25, 12},
                {15, 35, 0, 30, 18},
                {20, 25, 30, 0, 16},
                {8, 12, 18, 16, 0} };
        // 初始化变量
        bestPath = new int[n];
        visited = new int[n];
        Arrays.fill(visited, 0); // 未访问过任何城市
        bestLength = Integer.MAX_VALUE;
        // 分支限界法搜索
        branchAndBoundSearch(0, 0, visited);
        // 输出结果
        System.out.print("最优路径为：");
        for (int i = 0; i < n; i++) {
            System.out.print(bestPath[i]+1 + " ");
        }
        System.out.println(bestPath[0]+1); // 最后一个点再补充一次
        System.out.println("最优路径长度为：" + bestLength);
    }

    /**
     * @param cur 当前扩展到的节点
     * @param length 当前路径长度
     * @param visited 标记已经访问过的节点
     */
    public static void branchAndBoundSearch(int cur, int length, int[] visited) {
        // 判断是否搜索完所有节点
        if (cur == n) {
            if (length + graph[bestPath[n-1]][0] < bestLength) {
                // 更新最优解
                bestLength = length + graph[bestPath[n-1]][0];
                System.arraycopy(visited, 0, bestPath, 0, n);
            }
            return;
        }
        // 按照节点到起点的距离排序，优先扩展最近的节点
        PriorityQueue<Node> queue = new PriorityQueue<Node>();
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                Node node = new Node(i, length + graph[cur][i]);
                queue.offer(node);
            }
        }
        // 扩展子节点
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int index = node.index;
            visited[index] = 1;
            branchAndBoundSearch(cur+1, node.length, visited);
            visited[index] = 0;
        }

    }

    /**
     * 节点类，用来存放城市的编号和距离信息
     */
    static class Node implements Comparable<Node> {
        int index; // 城市编号
        int length; // 距离起点的距离

        public Node(int index, int length) {
            this.index = index;
            this.length = length;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.length, o.length); //按照路径长度排序
        }
    }
}
