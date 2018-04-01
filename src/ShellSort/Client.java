/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Client
 * Author:   shugan
 * Date:     2018/4/1 13:20
 * Description:
 */
package ShellSort;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/4/1
 * @since 1.0.0
 */
public class Client {
    public int[] sort(int[] a) {
        int gap = a.length / 2;
        while (gap > 0) {
            for (int i = gap; i < a.length; i++) {
                int current = a[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && a[preIndex] > current) {
                    a[preIndex + gap] = a[preIndex];
                    preIndex = preIndex - gap;
                }
                a[preIndex + gap] = current;
            }
            gap /= 2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return a;
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.sort(new int[]{3, 2, 6, 76, 4, 333, 44, 67, 7});
    }
}