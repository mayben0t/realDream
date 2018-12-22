package third.world.demo.algorithm;

/**
 * @program: demo
 * @description: 二分思想
 * @author: WangX
 * @create: 2018-12-23 00:36
 **/
public class Second {

    public static int min(int[] arr,int b,Integer half){
        int size = arr.length;
        if(size==0){return -1;}
        if(half==null){half=size/2;}
//        while(true){
//            int half = size/2;
            if(arr[half]<b){int temp = half;half=(half+size)/2;return min(arr,b,half);}
            if(arr[half]>b){int temp = half;half=(half)/2;return min(arr,b,half);}
            if(arr[half]==b){return half;}
//        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(min(arr,4,null));
    }

}
