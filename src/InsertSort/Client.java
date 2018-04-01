/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Client
 * Author:   shugan
 * Date:     2018/4/1 12:16
 * Description:
 */
package InsertSort;

/**
 * 〈直接插入排序〉
 *
 * @author shugan
 * @create 2018/4/1
 * @since 1.0.0
 */
public class Client {
    public int[] sort1(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    //置换
                    int temp = 0;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return a;
    }

    public int[] sort2(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int preIndex = i - 1;
            while (preIndex >= 0 && a[preIndex] > current) {
                a[preIndex + 1] = a[preIndex];
                preIndex--;
            }
            a[preIndex + 1] = current;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return a;
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.sort2(new int[]{5, 6, 1, 3, 8, 15});
        client.sort1(new int[]{5, 6, 1, 3, 8, 15});
    }
}