package sort.quick;

import sort.Utils;

import java.io.File;

/**
 * 快速排序
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class QuickSort {

    public static void quickSort(int[] nums, int l, int r) {
        if (l < r) {
            int q = partition(nums, l, r);
            quickSort(nums, l, q - 1);
            quickSort(nums, q + 1, r);
        }
    }

    public static int partition(int[] nums, int l, int r) {
        int q = l, u = l;
        while (u < r) {
            if (nums[u] <= nums[r]) {
                Utils.swap(nums, q, u);
                q++;
            }
            u++;
        }
        Utils.swap(nums, q, r);
        return q;
    }

    public static void main(String[] args) {

        int[] nums = new int[8];
        for(int i=0;i<8;i++){
            nums[i] = (int)(Math.random()*20);
        }
        for(int num:nums){
            System.out.print(num+",");
        }
    }
}
