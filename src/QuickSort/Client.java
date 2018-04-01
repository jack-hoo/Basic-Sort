/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Client
 * Author:   shugan
 * Date:     2018/4/1 19:08
 * Description:
 */
package QuickSort;

import java.util.Arrays;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/4/1
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        int[] arr = new int[]{23, 11, 233, 34, 54, 56};
        client.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int[] arr, int left, int right) {
        if (left < right) {
            //选择一个基点，以该基点为准，左边所有元素比它小，右边所有元素比它大(不必关心顺序)
            int basePoint = divide(arr, left, right);
            sort(arr, left, basePoint - 1);
            sort(arr, basePoint + 1, right);
        }
    }

    public int divide(int[] arr, int left, int right) {
        int basePoint = arr[left]; //基点选择最左侧元素
        while (left < right) {
            //右侧元素大于基准点
            while (left < right && arr[right] >= basePoint) --right;
            arr[left] = arr[right];
            //左侧元素小于基准点
            while (left < right && arr[left] <= basePoint) ++left;
            arr[right] = arr[left];
        }
        arr[left] = basePoint;
        return left;
    }
}