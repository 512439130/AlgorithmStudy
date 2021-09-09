package com.yy.study.algorithm.sort;

/**
 * 插入排序2
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * 稳定性：稳定
 */
public class InsertSort2 extends BaseSort {

    @Override
    protected void sort() {
        //原插入排序中，每次比较后，都需要交换当前元素和上一个元素，大量的交换次数会导致排序性能变差
        //优化点：排序过程中数组元素减少交换次数
        //当元素比较时，如果 array[j] < array[j-1]，则a[j] = array[j-1],更大的数向右覆盖，新元素等到最后合适的位置再放入
        int temp;
        for(int i = 1; i < array.length; i++){
            temp = array[i];
            int j;
            for(j = i; j > 0; j--){
                if(compare(temp,array[j - 1]) < 0){
                    array[j] = array[j-1];
//                    System.out.println("交换元素 " + "array[" + j + "]=" + "array[" + (j - 1) + "] ==>> " + array[j]);
//                    System.out.println("交换后 array:" + Arrays.toString(array));

                    //记录交换次数
                    swapCount ++;
                } else {
                    break;
                }
            }
            //将temp中的元素插入交换元素下标j跳出循环的位置（temp的值已经大于左边的所有值），则该位置为temp的新位置
            array[j] = temp;
        }
    }
}
