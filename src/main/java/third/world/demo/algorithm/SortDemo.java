package third.world.demo.algorithm;

import org.springframework.transaction.annotation.Transactional;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-03-03 01:01
 **/
public class SortDemo {

    public static void main(String[] args) {
        int[] a = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
//        System.out.println(7/2);
    }

    @Transactional
    public static void quickSort(int a[], int left, int right) {
        int i = left;
        int j = right;
        int temp = a[left];
        if (left >= right)
            return;
        while (i != j) {
            while (i < j && a[j] >= temp)
                j--;
            if (j > i)
                a[i] = a[j];//a[i]已经赋值给temp,所以直接将a[j]赋值给a[i],赋值完之后a[j],有空位
            while (i < j && a[i] <= temp)
                i++;
            if (i < j)
                a[j] = a[i];
        }
        a[i] = temp;//把基准插入,此时i与j已经相等R[low..pivotpos-1].keys≤R[pivotpos].key≤R[pivotpos+1..high].keys
        quickSort(a, left, i - 1);/*递归左边*/
        quickSort(a, i + 1, right);/*递归右边*/
    }
}
