package sort.radix;

/**
 * 基数排序
 *
 * @author: jiancong
 * @date: 2020/9/22
 */
public class RadixSort {

    public static void radixSort(int[] nums,int[] digital){
        // 每个桶的起始下标
        int[] bucketIdx = new int[10];
        // 桶
        int[] bucket = new int[nums.length];
        for(int i=0;i<digital.length;i++){
            // 清空桶
            for(int b=0;b<bucketIdx.length;b++){
                bucketIdx[b] = 0;
            }
            // 统计每个桶的长度
            for(int j=0;j<nums.length;j++){
                bucketIdx[nums[j]/digital[i]%10]++;
            }
            /*
            // 计算每个桶的截止下标
            for(int b=1;b<bucketIdx.length;b++){
                bucketIdx[b] = bucketIdx[b]+bucketIdx[b-1];
            }
            // 入桶
            for(int j=nums.length-1;j>=0;j--){
                int i1 = (nums[j] / digital[i]) % 10;
                bucket[bucketIdx[i1]-1] = nums[j];
                bucketIdx[i1]--;
            }
            */
            // 计算每个桶的起始下标
            bucketIdx[bucketIdx.length-1] = nums.length-bucketIdx[bucketIdx.length-1];
            for(int b=bucketIdx.length-2;b>=0;b--){
                bucketIdx[b] = bucketIdx[b+1] - bucketIdx[b];
            }
            // 入桶
            for(int j=0;j<nums.length;j++){
                int i1 = (nums[j] / digital[i]) % 10;
                bucket[bucketIdx[i1]] = nums[j];
                bucketIdx[i1]++;
            }
            // 刷新原始nums
            for(int j=0;j<nums.length;j++){
                nums[j] = bucket[j];
            }
        }
    }

    public static int[] getDigital(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = nums[i]>max?nums[i]:max;
        }
        int count=0;
        while(max>0){
            count++;
            max=max/10;
        }
        int[] digital = new int[count];
        digital[0] = 1;
        for(int i=1;i<count;i++){
            digital[i] = digital[i-1]*10;
        }
        return digital;
    }
}
